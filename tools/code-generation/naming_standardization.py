#!/usr/bin/env python3
"""
Coinbase Prime Java SDK - Naming Standardization Analysis

This script analyzes naming conventions and creates a standardized mapping
based on Java conventions: PascalCase, List for batch operations, 
simplified names (GetActivity not GetActivityByActivityId).

Usage:
    python naming_standardization.py
"""

import yaml
import json
from pathlib import Path
import re

def load_openapi_spec(spec_path="../../apiSpec/prime-public-spec.yaml"):
    """Load the OpenAPI specification from YAML file."""
    script_dir = Path(__file__).parent
    yaml_path = script_dir / spec_path
    
    with open(yaml_path, 'r') as file:
        return yaml.safe_load(file)

def scan_java_files():
    """Scan all Java files to extract actual class names."""
    script_dir = Path(__file__).parent
    src_dir = script_dir / "../../src/main/java/com/coinbase/prime"
    
    actual_classes = {}
    
    if not src_dir.exists():
        return actual_classes
    
    for package_dir in src_dir.iterdir():
        if package_dir.is_dir() and not package_dir.name.startswith('.'):
            package_name = package_dir.name
            
            # Skip non-service packages
            if package_name in ['client', 'credentials', 'errors', 'factory', 'model', 'common', 'utils']:
                continue
            
            actual_classes[package_name] = {
                'requests': [],
                'responses': [],
                'services': []
            }
            
            for java_file in package_dir.glob("*.java"):
                filename = java_file.name[:-5]  # Remove .java
                
                if filename.endswith('Request'):
                    actual_classes[package_name]['requests'].append(filename[:-7])  # Remove Request
                elif filename.endswith('Response'):
                    actual_classes[package_name]['responses'].append(filename[:-8])  # Remove Response
                elif filename.endswith('Service') and not filename.endswith('ServiceImpl'):
                    actual_classes[package_name]['services'].append(filename[:-7])  # Remove Service
    
    return actual_classes

def standardize_name(operation_id, summary, method, path):
    """Generate standardized Java class name following conventions."""
    # Remove PrimeRESTAPI_ prefix
    if operation_id.startswith('PrimeRESTAPI_'):
        operation_id = operation_id[13:]
    
    # Analyze the operation to determine if it's a batch operation
    is_batch = any(keyword in summary.lower() for keyword in ['list', 'get all', 'retrieve all']) or \
               any(keyword in operation_id.lower() for keyword in ['list', 'getall']) or \
               method.upper() == 'GET' and '{' not in path.split('/')[-1]
    
    # Handle special cases
    if 'activities' in operation_id.lower():
        if '{activity_id}' in path:
            return 'GetActivity'
        else:
            return 'ListActivities'
    
    if 'portfolio' in operation_id.lower() and operation_id.lower().endswith('portfolio'):
        if '{portfolio_id}' in path and path.endswith('{portfolio_id}'):
            return 'GetPortfolio'
        else:
            return 'ListPortfolios'
    
    # Convert operation_id to words
    words = re.findall(r'[A-Z][a-z]*|[a-z]+', operation_id)
    
    # Apply naming rules
    if is_batch and len(words) > 1:
        # For batch operations, use List prefix
        if words[0].lower() == 'get':
            words[0] = 'List'
        elif words[0].lower() not in ['list', 'create', 'update', 'delete']:
            words.insert(0, 'List')
    else:
        # For single item operations
        if words[0].lower() not in ['get', 'create', 'update', 'delete', 'cancel', 'accept', 'set']:
            if method.upper() == 'GET':
                words.insert(0, 'Get')
            elif method.upper() == 'POST':
                words.insert(0, 'Create')
            elif method.upper() == 'PUT':
                words.insert(0, 'Update')
            elif method.upper() == 'DELETE':
                words.insert(0, 'Delete')
    
    # Join words in PascalCase
    result = ''.join(word.capitalize() for word in words)
    
    # Clean up common issues
    result = result.replace('Byid', '').replace('ByActivityId', '').replace('ByPortfolioId', '')
    result = result.replace('Id', '').replace('Details', '')
    
    return result

def extract_operations_with_standardized_names(spec):
    """Extract all operations with standardized naming."""
    operations = {}
    
    for path, path_item in spec.get('paths', {}).items():
        for method, operation in path_item.items():
            if method in ['get', 'post', 'put', 'patch', 'delete']:
                operation_id = operation.get('operationId', '')
                tags = operation.get('tags', [])
                tag = tags[0] if tags else 'Unknown'
                summary = operation.get('summary', '')
                
                package_name = tag.lower().replace(' ', '').replace('-', '')
                standardized_name = standardize_name(operation_id, summary, method, path)
                
                if package_name not in operations:
                    operations[package_name] = []
                
                operations[package_name].append({
                    'method': method.upper(),
                    'path': path,
                    'operation_id': operation_id,
                    'standardized_name': standardized_name,
                    'tag': tag,
                    'summary': summary
                })
    
    return operations

def compare_with_existing(standardized_ops, actual_classes):
    """Compare standardized names with existing implementation."""
    comparison = {}
    
    for package, ops in standardized_ops.items():
        comparison[package] = {
            'package_exists': package in actual_classes,
            'operations': []
        }
        
        if package in actual_classes:
            actual_requests = set(actual_classes[package]['requests'])
            
            for op in ops:
                standardized_name = op['standardized_name']
                
                # Find exact or close matches
                matching_actual = None
                for actual_name in actual_requests:
                    if actual_name == standardized_name:
                        matching_actual = actual_name
                        break
                    # Try case-insensitive match
                    if actual_name.lower() == standardized_name.lower():
                        matching_actual = actual_name
                        break
                
                # If no exact match, try semantic matching
                if not matching_actual:
                    for actual_name in actual_requests:
                        # Remove common prefixes/suffixes for comparison
                        actual_clean = actual_name.lower().replace('get', '').replace('list', '').replace('create', '').replace('update', '').replace('delete', '')
                        standard_clean = standardized_name.lower().replace('get', '').replace('list', '').replace('create', '').replace('update', '').replace('delete', '')
                        
                        if actual_clean == standard_clean:
                            matching_actual = actual_name
                            break
                
                comparison[package]['operations'].append({
                    'method': op['method'],
                    'path': op['path'],
                    'operation_id': op['operation_id'],
                    'standardized_name': standardized_name,
                    'actual_name': matching_actual,
                    'exists': matching_actual is not None,
                    'needs_rename': matching_actual is not None and matching_actual != standardized_name,
                    'summary': op['summary']
                })
        else:
            # Package doesn't exist
            for op in ops:
                comparison[package]['operations'].append({
                    'method': op['method'],
                    'path': op['path'],
                    'operation_id': op['operation_id'],
                    'standardized_name': op['standardized_name'],
                    'actual_name': None,
                    'exists': False,
                    'needs_rename': False,
                    'summary': op['summary']
                })
    
    return comparison

def print_rename_analysis(comparison):
    """Print analysis of what needs to be renamed."""
    print("# Naming Standardization Analysis")
    print("=" * 60)
    
    renames_needed = []
    missing_operations = []
    missing_packages = []
    
    for package, data in sorted(comparison.items()):
        if not data['package_exists']:
            missing_packages.append(package)
            for op in data['operations']:
                missing_operations.append({
                    'package': package,
                    'operation': op
                })
            continue
        
        package_renames = []
        package_missing = []
        
        for op in data['operations']:
            if not op['exists']:
                package_missing.append(op)
            elif op['needs_rename']:
                package_renames.append(op)
        
        if package_renames or package_missing:
            status = "🔄" if package_renames else "➕"
            print(f"\n## {status} Package: {package}")
            
            if package_renames:
                print("### Rename Required:")
                for op in package_renames:
                    print(f"- **{op['actual_name']}** → **{op['standardized_name']}**")
                    print(f"  `{op['method']} {op['path']}`")
                    renames_needed.append({
                        'package': package,
                        'current': op['actual_name'],
                        'new': op['standardized_name'],
                        'operation': op
                    })
            
            if package_missing:
                print("### Missing Operations:")
                for op in package_missing:
                    print(f"- **{op['standardized_name']}** (new)")
                    print(f"  `{op['method']} {op['path']} - {op['summary']}`")
                    missing_operations.append({
                        'package': package,
                        'operation': op
                    })
    
    if missing_packages:
        print(f"\n## ➕ Missing Packages ({len(missing_packages)})")
        for package in missing_packages:
            print(f"- `com.coinbase.prime.{package}`")
    
    print(f"\n# Summary")
    print(f"- **Renames needed:** {len(renames_needed)}")
    print(f"- **Missing operations:** {len(missing_operations)}")
    print(f"- **Missing packages:** {len(missing_packages)}")
    
    return renames_needed, missing_operations, missing_packages

def print_detailed_renames(renames_needed):
    """Print detailed rename instructions."""
    if not renames_needed:
        print("\n## ✅ No renames needed - all existing names follow conventions!")
        return
    
    print(f"\n# Detailed Rename Instructions ({len(renames_needed)} renames)")
    print("=" * 60)
    
    current_package = None
    for rename in renames_needed:
        if rename['package'] != current_package:
            current_package = rename['package']
            print(f"\n## Package: com.coinbase.prime.{current_package}")
        
        print(f"\n### {rename['current']} → {rename['new']}")
        print(f"- **Path:** `{rename['operation']['path']}`")
        print(f"- **Method:** {rename['operation']['method']}")
        print(f"- **Summary:** {rename['operation']['summary']}")
        print(f"- **Files to rename:**")
        print(f"  - `{rename['current']}Request.java` → `{rename['new']}Request.java`")
        print(f"  - `{rename['current']}Response.java` → `{rename['new']}Response.java`")
        print(f"- **Service method to update:** `{rename['current'].lower()}()` → `{rename['new'].lower()}()`")

def main():
    """Main execution function."""
    try:
        print("Loading OpenAPI specification...")
        spec = load_openapi_spec()
        
        print("Scanning existing Java implementation...")
        actual_classes = scan_java_files()
        
        print("Generating standardized names...")
        standardized_ops = extract_operations_with_standardized_names(spec)
        
        print("Comparing with existing implementation...")
        comparison = compare_with_existing(standardized_ops, actual_classes)
        
        print("\n" + "=" * 60)
        renames_needed, missing_operations, missing_packages = print_rename_analysis(comparison)
        
        print_detailed_renames(renames_needed)
        
        # Generate JSON output for automation
        output = {
            'renames_needed': renames_needed,
            'missing_operations': missing_operations,
            'missing_packages': missing_packages
        }
        
        with open('naming_analysis_output.json', 'w') as f:
            json.dump(output, f, indent=2)
        
        print(f"\n📄 Detailed analysis saved to: naming_analysis_output.json")
        
    except Exception as e:
        print(f"Error during analysis: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    main()