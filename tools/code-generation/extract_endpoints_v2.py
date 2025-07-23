#!/usr/bin/env python3
"""
Coinbase Prime Java SDK - OpenAPI Endpoint Extraction Tool

This script parses the OpenAPI specification and extracts endpoint metadata
for analysis and potential code generation in the Java SDK.

Usage:
    python extract_endpoints_v2.py

Output:
    Detailed endpoint analysis with Java-specific considerations
"""

import yaml
import json
from pathlib import Path

def load_openapi_spec(spec_path="../../apiSpec/prime-public-spec.yaml"):
    """Load the OpenAPI specification from YAML file."""
    script_dir = Path(__file__).parent
    yaml_path = script_dir / spec_path
    
    with open(yaml_path, 'r') as file:
        return yaml.safe_load(file)

def extract_endpoints(spec):
    """Extract endpoint information from OpenAPI spec."""
    endpoints = {}
    
    for path, path_item in spec.get('paths', {}).items():
        for method, operation in path_item.items():
            if method in ['get', 'post', 'put', 'patch', 'delete']:
                operation_id = operation.get('operationId', '')
                tags = operation.get('tags', [])
                tag = tags[0] if tags else 'Unknown'
                
                # Extract parameters
                parameters = []
                for param in operation.get('parameters', []):
                    param_info = {
                        'name': param.get('name'),
                        'in': param.get('in'),
                        'required': param.get('required', False),
                        'type': param.get('schema', {}).get('type', 'string')
                    }
                    parameters.append(param_info)
                
                # Extract request body
                request_body = None
                if 'requestBody' in operation:
                    content = operation['requestBody'].get('content', {})
                    if 'application/json' in content:
                        schema_ref = content['application/json'].get('schema', {}).get('$ref')
                        if schema_ref:
                            request_body = schema_ref.split('/')[-1]
                
                # Extract response
                responses = {}
                for status_code, response in operation.get('responses', {}).items():
                    content = response.get('content', {})
                    if 'application/json' in content:
                        schema_ref = content['application/json'].get('schema', {}).get('$ref')
                        if schema_ref:
                            responses[status_code] = schema_ref.split('/')[-1]
                
                endpoint_info = {
                    'method': method.upper(),
                    'path': path,
                    'operation_id': operation_id,
                    'tag': tag,
                    'summary': operation.get('summary', ''),
                    'description': operation.get('description', ''),
                    'parameters': parameters,
                    'request_body': request_body,
                    'responses': responses
                }
                
                if tag not in endpoints:
                    endpoints[tag] = []
                endpoints[tag].append(endpoint_info)
    
    return endpoints

def generate_java_class_name(operation_id):
    """Generate Java class name from operation ID."""
    if not operation_id:
        return ''
    
    # Remove prefix if present
    if operation_id.startswith('PrimeRESTAPI_'):
        operation_id = operation_id[13:]
    
    # Convert to PascalCase
    words = operation_id.replace('_', ' ').split()
    return ''.join(word.capitalize() for word in words)

def generate_java_package_name(tag):
    """Generate Java package name from tag."""
    return tag.lower().replace(' ', '').replace('-', '')

def print_java_analysis(endpoints):
    """Print Java-specific analysis of endpoints."""
    print("# Coinbase Prime Java SDK - Endpoint Analysis")
    print("=" * 60)
    
    total_endpoints = sum(len(ops) for ops in endpoints.values())
    print(f"**Total Endpoints:** {total_endpoints}")
    print(f"**Total Domains:** {len(endpoints)}")
    print()
    
    for tag, ops in sorted(endpoints.items()):
        print(f"## {tag} ({len(ops)} endpoints)")
        print(f"**Java Package:** `com.coinbase.prime.{generate_java_package_name(tag)}`")
        print()
        
        for op in ops:
            class_name = generate_java_class_name(op['operation_id'])
            
            print(f"### {op['method']} {op['path']}")
            print(f"- **Operation ID:** {op['operation_id']}")
            print(f"- **Java Class:** {class_name}")
            print(f"- **Summary:** {op['summary']}")
            
            if op['parameters']:
                print("- **Parameters:**")
                for param in op['parameters']:
                    required = "required" if param['required'] else "optional"
                    print(f"  - `{param['name']}` ({param['in']}, {param['type']}, {required})")
            
            if op['request_body']:
                print(f"- **Request Body:** {op['request_body']}")
            
            if op['responses']:
                print("- **Responses:**")
                for status, schema in op['responses'].items():
                    print(f"  - {status}: {schema}")
            
            print()
        
        print()

def print_implementation_status(endpoints):
    """Print implementation status for Java SDK."""
    print("# Java SDK Implementation Status")
    print("=" * 50)
    
    # Map of existing Java packages
    existing_packages = {
        'activities', 'addressbook', 'allocations', 'assets', 'balances',
        'commission', 'financing', 'futures', 'invoice', 'onchainaddressbook',
        'orders', 'paymentmethods', 'portfolios', 'positions', 'products',
        'staking', 'transactions', 'users', 'wallets'
    }
    
    for tag, ops in sorted(endpoints.items()):
        package_name = generate_java_package_name(tag)
        status = "✅ Implemented" if package_name in existing_packages else "❌ Missing"
        
        print(f"## {tag} - {status}")
        print(f"**Package:** `com.coinbase.prime.{package_name}`")
        print(f"**Endpoints:** {len(ops)}")
        
        if package_name not in existing_packages:
            print("**Required Classes:**")
            for op in ops:
                class_name = generate_java_class_name(op['operation_id'])
                print(f"- {class_name}Request.java")
                print(f"- {class_name}Response.java")
            print(f"- {tag}Service.java")
            print(f"- {tag}ServiceImpl.java")
        
        print()

def main():
    """Main execution function."""
    try:
        # Load OpenAPI specification
        spec = load_openapi_spec()
        
        # Extract endpoints
        endpoints = extract_endpoints(spec)
        
        # Generate analysis
        print_java_analysis(endpoints)
        print_implementation_status(endpoints)
        
    except FileNotFoundError:
        print("Error: Could not find OpenAPI specification file.")
        print("Expected location: ../../apiSpec/prime-public-spec.yaml")
    except Exception as e:
        print(f"Error processing OpenAPI specification: {e}")

if __name__ == "__main__":
    main()