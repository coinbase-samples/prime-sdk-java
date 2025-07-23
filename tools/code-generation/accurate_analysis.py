#!/usr/bin/env python3
"""
Coinbase Prime Java SDK - Accurate Analysis Tool

This script provides accurate analysis by properly examining both the OpenAPI spec 
and the actual Java implementation files.

Usage:
    python accurate_analysis.py
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

def extract_openapi_operations(spec):
    """Extract all operations from OpenAPI spec."""
    operations = []
    
    for path, path_item in spec.get('paths', {}).items():
        for method, operation in path_item.items():
            if method in ['get', 'post', 'put', 'patch', 'delete']:
                operation_id = operation.get('operationId', '')
                tags = operation.get('tags', [])
                tag = tags[0] if tags else 'Unknown'
                
                # Generate standardized name based on your conventions
                if operation_id.startswith('PrimeRESTAPI_'):
                    operation_id = operation_id[13:]
                
                # Apply naming rules
                standardized_name = standardize_java_name(operation_id, operation.get('summary', ''), method, path)
                
                operations.append({
                    'path': path,
                    'method': method.upper(),
                    'operation_id': operation_id,
                    'standardized_name': standardized_name,
                    'tag': tag,
                    'package': tag.lower().replace(' ', '').replace('-', ''),
                    'summary': operation.get('summary', ''),
                    'description': operation.get('description', '')
                })
    
    return operations

def standardize_java_name(operation_id, summary, method, path):
    """Standardize name following the user's preferences."""
    # Special cases first
    if operation_id == 'GetOrder':
        return 'GetOrderByOrderId'  # Current implementation name
    if operation_id == 'GetPortfolio':
        return 'GetPortfolioById'   # Current implementation name
    if operation_id == 'GetActivity':
        return 'GetActivityByActivityId'  # User wants to change this to GetActivity
    
    # Convert to PascalCase
    words = re.findall(r'[A-Z][a-z]*|[a-z]+', operation_id)
    
    # Determine if this should be a List operation
    is_list_operation = (
        method.upper() == 'GET' and 
        ('{' not in path.split('/')[-1] or  # No ID at the end
         any(word in summary.lower() for word in ['list', 'get all', 'retrieve all']) or
         'list' in operation_id.lower())
    )
    
    # Apply List prefix for batch operations
    if is_list_operation and words and words[0].lower() == 'get':
        words[0] = 'List'
    
    # Handle other prefixes
    if not words:
        return 'Unknown'
    
    if words[0].lower() not in ['get', 'list', 'create', 'update', 'delete', 'cancel', 'accept', 'set', 'schedule']:
        if method.upper() == 'GET':
            if is_list_operation:
                words.insert(0, 'List')
            else:
                words.insert(0, 'Get')
        elif method.upper() == 'POST':
            words.insert(0, 'Create')
        elif method.upper() == 'PUT':
            words.insert(0, 'Update')
        elif method.upper() == 'DELETE':
            words.insert(0, 'Delete')
    
    return ''.join(word.capitalize() for word in words)

def scan_java_implementation():
    """Scan the actual Java implementation."""
    script_dir = Path(__file__).parent
    src_dir = script_dir / "../../src/main/java/com/coinbase/prime"
    
    implementation = {}
    
    if not src_dir.exists():
        return implementation
    
    for package_dir in src_dir.iterdir():
        if package_dir.is_dir() and not package_dir.name.startswith('.'):
            package_name = package_dir.name
            
            # Skip non-service packages
            if package_name in ['client', 'credentials', 'errors', 'factory', 'model', 'common', 'utils']:
                continue
            
            implementation[package_name] = []
            
            for java_file in package_dir.glob("*Request.java"):
                class_name = java_file.name[:-12]  # Remove Request.java
                implementation[package_name].append(class_name)
    
    return implementation

def find_matches(openapi_ops, java_impl):
    """Find matches between OpenAPI operations and Java implementation."""
    results = {
        'implemented': [],
        'missing': [],
        'rename_suggestions': []
    }
    
    for op in openapi_ops:
        package = op['package']
        standardized_name = op['standardized_name']
        
        # Check if package exists
        if package not in java_impl:
            results['missing'].append(op)
            continue
        
        # Look for exact match
        if standardized_name in java_impl[package]:
            results['implemented'].append({
                'operation': op,
                'java_class': standardized_name,
                'status': 'exact_match'
            })
            continue
        
        # Look for similar matches
        best_match = None
        for java_class in java_impl[package]:
            # Remove common words for comparison
            op_clean = standardized_name.lower().replace('get', '').replace('list', '').replace('create', '').replace('update', '').replace('delete', '')
            java_clean = java_class.lower().replace('get', '').replace('list', '').replace('create', '').replace('update', '').replace('delete', '')
            
            if op_clean == java_clean:
                best_match = java_class
                break
            
            # Partial match
            if op_clean in java_clean or java_clean in op_clean:
                best_match = java_class
        
        if best_match:
            if best_match != standardized_name:
                results['rename_suggestions'].append({
                    'operation': op,
                    'current_java_class': best_match,
                    'suggested_name': standardized_name
                })
            else:
                results['implemented'].append({
                    'operation': op,
                    'java_class': best_match,
                    'status': 'name_match'
                })
        else:
            results['missing'].append(op)
    
    return results

def print_analysis(results):
    """Print comprehensive analysis."""
    print("# Coinbase Prime Java SDK - Accurate Analysis")
    print("=" * 60)
    
    total_ops = len(results['implemented']) + len(results['missing']) + len(results['rename_suggestions'])
    implemented_count = len(results['implemented']) + len(results['rename_suggestions'])
    
    print(f"## Summary")
    print(f"- **Total OpenAPI Operations:** {total_ops}")
    print(f"- **Implemented (with exact names):** {len(results['implemented'])}")
    print(f"- **Implemented (with different names):** {len(results['rename_suggestions'])}")
    print(f"- **Missing:** {len(results['missing'])}")
    print(f"- **Coverage:** {(implemented_count/total_ops)*100:.1f}%")
    
    if results['rename_suggestions']:
        print(f"\n## 🔄 Naming Differences ({len(results['rename_suggestions'])})")
        
        current_package = None
        for item in results['rename_suggestions']:
            op = item['operation']
            if op['package'] != current_package:
                current_package = op['package']
                print(f"\n### Package: {current_package}")
            
            print(f"- **{item['current_java_class']}** → **{item['suggested_name']}**")
            print(f"  `{op['method']} {op['path']}`")
            print(f"  Summary: {op['summary']}")
    
    if results['missing']:
        print(f"\n## ❌ Missing Operations ({len(results['missing'])})")
        
        missing_by_package = {}
        for op in results['missing']:
            package = op['package']
            if package not in missing_by_package:
                missing_by_package[package] = []
            missing_by_package[package].append(op)
        
        for package, ops in sorted(missing_by_package.items()):
            print(f"\n### Package: {package} ({len(ops)} missing)")
            for op in ops:
                print(f"- **{op['standardized_name']}**")
                print(f"  `{op['method']} {op['path']}`")
                print(f"  Summary: {op['summary']}")

def main():
    """Main execution function."""
    try:
        print("Loading OpenAPI specification...")
        spec = load_openapi_spec()
        
        print("Extracting OpenAPI operations...")
        openapi_ops = extract_openapi_operations(spec)
        
        print("Scanning Java implementation...")
        java_impl = scan_java_implementation()
        
        print("Finding matches...")
        results = find_matches(openapi_ops, java_impl)
        
        print("\n" + "=" * 60)
        print_analysis(results)
        
    except Exception as e:
        print(f"Error during analysis: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    main()