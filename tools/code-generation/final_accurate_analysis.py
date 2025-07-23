#!/usr/bin/env python3
"""
Final accurate endpoint analysis for Coinbase Prime Java SDK.
This script directly compares OpenAPI endpoints with actual implementation paths found in ServiceImpl files.
"""

import yaml
import re
import subprocess
from pathlib import Path

def load_openapi_spec():
    """Load and parse OpenAPI specification."""
    spec_path = Path("apiSpec/prime-public-spec.yaml")
    with open(spec_path, 'r') as f:
        return yaml.safe_load(f)

def extract_openapi_endpoints(spec):
    """Extract all endpoints from OpenAPI spec."""
    endpoints = {}
    
    for path, path_obj in spec.get('paths', {}).items():
        for method, method_obj in path_obj.items():
            if method.lower() in ['get', 'post', 'put', 'delete']:
                operation_id = method_obj.get('operationId', '')
                if operation_id.startswith('PrimeRESTAPI_'):
                    # Remove PrimeRESTAPI_ prefix and convert to normalized path
                    java_name = operation_id.replace('PrimeRESTAPI_', '')
                    summary = method_obj.get('summary', '')
                    tags = method_obj.get('tags', [])
                    tag = tags[0] if tags else 'Unknown'
                    
                    # Normalize the path by removing /v1 prefix for comparison
                    normalized_path = path.replace('/v1', '')
                    key = f"{method.upper()} {normalized_path}"
                    
                    endpoints[key] = {
                        'path': path,
                        'method': method.upper(),
                        'operation_id': operation_id,
                        'java_name': java_name,
                        'summary': summary,
                        'tag': tag
                    }
    
    return endpoints

def get_implemented_endpoints():
    """Extract all implemented endpoints from ServiceImpl files using grep."""
    try:
        # Get all String.format paths from service implementations
        result = subprocess.run([
            'grep', '-r', 'String.format.*/', 
            '/Users/nickmorgan/projects/prime-sdk-java/src/main/java/com/coinbase/prime/'
        ], capture_output=True, text=True)
        
        implemented = {}
        for line in result.stdout.strip().split('\n'):
            if not line:
                continue
                
            # Parse the grep output
            parts = line.split(':')
            if len(parts) >= 2:
                file_path = parts[0]
                code_line = ':'.join(parts[1:])
                
                # Extract the path from String.format
                path_match = re.search(r'String\.format\("([^"]+)"', code_line)
                if path_match:
                    path = path_match.group(1)
                    
                    # Determine HTTP method from context
                    method = 'GET'  # Default
                    if 'HttpMethod.POST' in code_line or '.post(' in code_line:
                        method = 'POST'
                    elif 'HttpMethod.PUT' in code_line or '.put(' in code_line:
                        method = 'PUT'
                    elif 'HttpMethod.DELETE' in code_line or '.delete(' in code_line:
                        method = 'DELETE'
                    
                    # Check surrounding context for HTTP method
                    # Read the full implementation file to get better context
                    try:
                        with open(file_path, 'r') as f:
                            file_content = f.read()
                            
                        # Find the method containing this path
                        lines = file_content.split('\n')
                        for i, file_line in enumerate(lines):
                            if path in file_line and 'String.format' in file_line:
                                # Look backwards for HttpMethod
                                for j in range(max(0, i-10), i):
                                    if 'HttpMethod.' in lines[j]:
                                        if 'HttpMethod.POST' in lines[j]:
                                            method = 'POST'
                                        elif 'HttpMethod.PUT' in lines[j]:
                                            method = 'PUT'
                                        elif 'HttpMethod.DELETE' in lines[j]:
                                            method = 'DELETE'
                                        elif 'HttpMethod.GET' in lines[j]:
                                            method = 'GET'
                                        break
                                break
                    except:
                        pass
                    
                    key = f"{method} {path}"
                    implemented[key] = {
                        'file': file_path,
                        'path': path,
                        'method': method
                    }
        
        return implemented
    except Exception as e:
        print(f"Error getting implemented endpoints: {e}")
        return {}

def analyze_gaps():
    """Perform accurate gap analysis."""
    print("Loading OpenAPI specification...")
    spec = load_openapi_spec()
    
    print("Extracting OpenAPI endpoints...")
    openapi_endpoints = extract_openapi_endpoints(spec)
    
    print("Getting implemented endpoints from Java code...")
    implemented_endpoints = get_implemented_endpoints()
    
    print("\n" + "="*100)
    print("# Coinbase Prime Java SDK - ACCURATE Endpoint Analysis")
    print("="*100)
    
    print(f"\n## Summary")
    print(f"- **Total OpenAPI Endpoints:** {len(openapi_endpoints)}")
    print(f"- **Total Implemented Endpoints:** {len(implemented_endpoints)}")
    
    # Find missing endpoints
    missing_endpoints = []
    implemented_count = 0
    
    for openapi_key, openapi_info in openapi_endpoints.items():
        found = False
        
        # Try exact match first
        if openapi_key in implemented_endpoints:
            found = True
            implemented_count += 1
        else:
            # Try variations - sometimes the path parameters differ
            openapi_path = openapi_info['path'].replace('/v1', '')
            openapi_method = openapi_info['method']
            
            for impl_key, impl_info in implemented_endpoints.items():
                impl_path = impl_info['path']
                impl_method = impl_info['method']
                
                if impl_method == openapi_method:
                    # Compare paths with parameter substitution
                    # Replace {param} with %s in openapi path for comparison
                    normalized_openapi = re.sub(r'\{[^}]+\}', '%s', openapi_path)
                    if impl_path == normalized_openapi:
                        found = True
                        implemented_count += 1
                        break
        
        if not found:
            missing_endpoints.append(openapi_info)
    
    coverage = (implemented_count / len(openapi_endpoints)) * 100 if openapi_endpoints else 0
    print(f"- **Missing Endpoints:** {len(missing_endpoints)}")
    print(f"- **Implementation Coverage:** {coverage:.1f}%")
    
    # Group missing endpoints by tag
    missing_by_tag = {}
    for endpoint in missing_endpoints:
        tag = endpoint['tag']
        if tag not in missing_by_tag:
            missing_by_tag[tag] = []
        missing_by_tag[tag].append(endpoint)
    
    if missing_endpoints:
        print(f"\n## Missing Endpoints by Domain")
        for tag, endpoints in sorted(missing_by_tag.items()):
            print(f"\n### {tag} ({len(endpoints)} missing)")
            for endpoint in endpoints:
                print(f"- **{endpoint['method']} {endpoint['path']}**")
                print(f"  - Operation ID: `{endpoint['operation_id']}`")
                print(f"  - Java Name: `{endpoint['java_name']}`") 
                print(f"  - Summary: {endpoint['summary']}")
        
        print(f"\n## Complete List of Missing Endpoints")
        print(f"**{len(missing_endpoints)} endpoints are missing from the Java SDK:**")
        print()
        for i, endpoint in enumerate(missing_endpoints, 1):
            print(f"{i}. **{endpoint['method']} {endpoint['path']}** (`{endpoint['java_name']}`)")
            print(f"   - {endpoint['summary']}")
            print(f"   - Domain: {endpoint['tag']}")
            print()
    else:
        print("\n✅ **All OpenAPI endpoints are implemented in the Java SDK!**")
    
    print(f"\n## Implemented Endpoints Found")
    print(f"**{len(implemented_endpoints)} endpoints are implemented:**")
    print()
    for key, impl in sorted(implemented_endpoints.items()):
        print(f"- **{key}**")

if __name__ == "__main__":
    analyze_gaps()