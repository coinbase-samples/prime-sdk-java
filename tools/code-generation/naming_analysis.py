#!/usr/bin/env python3
"""
Coinbase Prime Java SDK - Naming Comparison Tool

This script compares OpenAPI operation names with actual Java implementation names
to identify naming differences and truly missing endpoints.

Usage:
    python naming_analysis.py
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

def extract_openapi_operations(spec):
    """Extract all operations from OpenAPI spec with proper naming."""
    operations = {}
    
    for path, path_item in spec.get('paths', {}).items():
        for method, operation in path_item.items():
            if method in ['get', 'post', 'put', 'patch', 'delete']:
                operation_id = operation.get('operationId', '')
                tags = operation.get('tags', [])
                tag = tags[0] if tags else 'Unknown'
                
                # Generate expected Java class name
                if operation_id.startswith('PrimeRESTAPI_'):
                    operation_id = operation_id[13:]
                
                # Convert to proper PascalCase
                java_class = ''.join(word.capitalize() for word in operation_id.replace('_', ' ').split())
                
                package_name = tag.lower().replace(' ', '').replace('-', '')
                
                if package_name not in operations:
                    operations[package_name] = []
                
                operations[package_name].append({
                    'method': method.upper(),
                    'path': path,
                    'operation_id': operation_id,
                    'java_class': java_class,
                    'tag': tag,
                    'summary': operation.get('summary', '')
                })
    
    return operations

def compare_naming(openapi_ops, actual_classes):
    """Compare OpenAPI expected names with actual implementation names."""
    comparison = {}
    
    for package, ops in openapi_ops.items():
        comparison[package] = {
            'package_exists': package in actual_classes,
            'operations': []
        }
        
        if package in actual_classes:
            actual_requests = set(actual_classes[package]['requests'])
            
            for op in ops:
                expected_name = op['java_class']
                
                # Try to find matching actual implementation
                matching_actual = None
                for actual_name in actual_requests:
                    # Direct match
                    if actual_name.lower() == expected_name.lower():
                        matching_actual = actual_name
                        break
                    # Try without prefixes
                    if actual_name.lower().replace('get', '').replace('list', '').replace('create', '') == \
                       expected_name.lower().replace('get', '').replace('list', '').replace('create', ''):
                        matching_actual = actual_name
                        break
                
                comparison[package]['operations'].append({
                    'method': op['method'],
                    'path': op['path'],
                    'expected_name': expected_name,
                    'actual_name': matching_actual,
                    'exists': matching_actual is not None,
                    'name_match': matching_actual == expected_name if matching_actual else False,
                    'summary': op['summary']
                })
        else:
            # Package doesn't exist
            for op in ops:
                comparison[package]['operations'].append({
                    'method': op['method'],
                    'path': op['path'],
                    'expected_name': op['java_class'],
                    'actual_name': None,
                    'exists': False,
                    'name_match': False,
                    'summary': op['summary']
                })
    
    return comparison

def print_naming_differences(comparison):
    """Print detailed naming differences."""
    print("# Naming Differences Analysis")
    print("=" * 60)
    
    total_operations = 0
    implemented_operations = 0
    name_mismatches = 0
    
    for package, data in sorted(comparison.items()):
        if not data['package_exists']:
            print(f"\n## ❌ Missing Package: {package}")
            for op in data['operations']:
                print(f"- {op['method']} {op['path']} → {op['expected_name']}")
                total_operations += 1
            continue
        
        has_mismatches = any(op['exists'] and not op['name_match'] for op in data['operations'])
        has_missing = any(not op['exists'] for op in data['operations'])
        
        if has_mismatches or has_missing:
            status = "⚠️" if has_mismatches else "❌"
            print(f"\n## {status} Package: {package}")
            
            for op in data['operations']:
                total_operations += 1
                
                if not op['exists']:
                    print(f"- ❌ MISSING: {op['method']} {op['path']}")
                    print(f"  Expected: {op['expected_name']}")
                elif not op['name_match']:
                    print(f"- ⚠️ NAME DIFF: {op['method']} {op['path']}")
                    print(f"  Expected: {op['expected_name']}")
                    print(f"  Actual:   {op['actual_name']}")
                    name_mismatches += 1
                    implemented_operations += 1
                else:
                    implemented_operations += 1
        else:
            print(f"\n## ✅ Package: {package} (all operations match)")
            implemented_operations += len(data['operations'])
            total_operations += len(data['operations'])
    
    print(f"\n# Summary")
    print(f"- **Total Operations:** {total_operations}")
    print(f"- **Implemented:** {implemented_operations}")
    print(f"- **Missing:** {total_operations - implemented_operations}")
    print(f"- **Name Mismatches:** {name_mismatches}")
    print(f"- **Coverage:** {(implemented_operations/total_operations)*100:.1f}%")

def generate_missing_operations_list(comparison):
    """Generate list of truly missing operations."""
    missing = []
    
    for package, data in comparison.items():
        for op in data['operations']:
            if not op['exists']:
                missing.append({
                    'package': package,
                    'method': op['method'],
                    'path': op['path'],
                    'expected_name': op['expected_name'],
                    'summary': op['summary']
                })
    
    return missing

def main():
    """Main execution function."""
    try:
        print("Loading OpenAPI specification...")
        spec = load_openapi_spec()
        
        print("Scanning Java implementation...")
        actual_classes = scan_java_files()
        
        print("Extracting OpenAPI operations...")
        openapi_ops = extract_openapi_operations(spec)
        
        print("Comparing naming...")
        comparison = compare_naming(openapi_ops, actual_classes)
        
        print("\n" + "=" * 60)
        print_naming_differences(comparison)
        
        # Generate missing operations list
        missing_ops = generate_missing_operations_list(comparison)
        
        if missing_ops:
            print(f"\n# Missing Operations ({len(missing_ops)} total)")
            print("=" * 40)
            
            current_package = None
            for op in missing_ops:
                if op['package'] != current_package:
                    current_package = op['package']
                    print(f"\n### {current_package}")
                
                print(f"- {op['method']} {op['path']} → {op['expected_name']}")
                print(f"  Summary: {op['summary']}")
        
    except Exception as e:
        print(f"Error during analysis: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    main()