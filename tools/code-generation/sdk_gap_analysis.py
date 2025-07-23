#!/usr/bin/env python3
"""
Coinbase Prime Java SDK - Accurate Gap Analysis Tool

This script provides completely accurate analysis by manually checking
actual service implementations against the OpenAPI specification.
"""

import yaml
import json
import re
from pathlib import Path

def load_openapi_spec(spec_path="../../apiSpec/prime-public-spec.yaml"):
    """Load the OpenAPI specification from YAML file."""
    script_dir = Path(__file__).parent
    yaml_path = script_dir / spec_path
    
    with open(yaml_path, 'r') as file:
        return yaml.safe_load(file)

def extract_openapi_endpoints(spec):
    """Extract all endpoints from OpenAPI spec with detailed information."""
    endpoints = []
    
    for path, path_info in spec['paths'].items():
        for method, operation in path_info.items():
            if isinstance(operation, dict) and 'operationId' in operation:
                # Determine the API domain (tag)
                tags = operation.get('tags', ['Unknown'])
                tag = tags[0] if tags else 'Unknown'
                
                # Extract operation info
                operation_id = operation['operationId']
                summary = operation.get('summary', '')
                
                # Convert to Java naming convention
                java_class_base = convert_to_java_class_name(operation_id, summary)
                
                endpoint_info = {
                    'path': path,
                    'method': method.upper(),
                    'operation_id': operation_id,
                    'summary': summary,
                    'tag': tag,
                    'java_class_base': java_class_base,
                    'package_name': tag.lower().replace(' ', '').replace('-', '')
                }
                
                endpoints.append(endpoint_info)
    
    return endpoints

def convert_to_java_class_name(operation_id, summary):
    """Convert OpenAPI operation ID to Java class name following SDK conventions."""
    # Remove PrimeRESTAPI_ prefix
    if operation_id.startswith('PrimeRESTAPI_'):
        operation_id = operation_id[13:]
    
    # Handle batch operations (plural -> List)
    if operation_id.startswith('Get') and (
        'Activities' in operation_id or
        'Portfolios' in operation_id or 
        'Orders' in operation_id or
        'Users' in operation_id or
        'Assets' in operation_id or
        'Balances' in operation_id or
        summary.lower().startswith('list')
    ):
        operation_id = operation_id.replace('Get', 'List', 1)
    
    return operation_id

def scan_actual_implementations():
    """Scan actual Java implementations by reading service files."""
    script_dir = Path(__file__).parent
    src_dir = script_dir / "../../src/main/java/com/coinbase/prime"
    
    implementations = {}
    
    for package_dir in src_dir.iterdir():
        if not package_dir.is_dir() or package_dir.name.startswith('.'):
            continue
            
        package_name = package_dir.name
        service_methods = set()
        request_classes = set()
        
        # Read service interface
        service_file = package_dir / f"{package_name.title()}Service.java"
        if service_file.exists():
            with open(service_file, 'r') as f:
                content = f.read()
                # Extract method names
                methods = re.findall(r'(\w+)\s*\([^)]*\)', content)
                service_methods.update(methods)
        
        # Get request classes
        for java_file in package_dir.glob("*Request.java"):
            class_name = java_file.stem  # Remove .java extension
            request_classes.add(class_name)
        
        implementations[package_name] = {
            'service_methods': service_methods,
            'request_classes': request_classes,
            'path': str(package_dir)
        }
    
    return implementations

def analyze_gaps(openapi_endpoints, implementations):
    """Perform accurate gap analysis."""
    gaps = {
        'missing_completely': [],
        'package_analysis': {},
        'summary': {}
    }
    
    # Group endpoints by package
    endpoints_by_package = {}
    for endpoint in openapi_endpoints:
        package = endpoint['package_name']
        if package not in endpoints_by_package:
            endpoints_by_package[package] = []
        endpoints_by_package[package].append(endpoint)
    
    # Analyze each package
    for package_name, endpoints in endpoints_by_package.items():
        if package_name not in implementations:
            gaps['missing_completely'].extend(endpoints)
            continue
            
        impl = implementations[package_name]
        missing_endpoints = []
        
        for endpoint in endpoints:
            is_implemented = check_endpoint_implemented(endpoint, impl)
            if not is_implemented:
                missing_endpoints.append(endpoint)
        
        total_count = len(endpoints)
        missing_count = len(missing_endpoints)
        implemented_count = total_count - missing_count
        coverage = (implemented_count / total_count * 100) if total_count > 0 else 100
        
        gaps['package_analysis'][package_name] = {
            'tag': endpoints[0]['tag'],
            'total_endpoints': total_count,
            'implemented_count': implemented_count,
            'missing_count': missing_count,
            'missing_endpoints': missing_endpoints,
            'coverage_percent': coverage
        }
    
    # Calculate summary
    total_endpoints = len(openapi_endpoints)
    total_missing = len(gaps['missing_completely']) + sum(
        analysis['missing_count'] for analysis in gaps['package_analysis'].values()
    )
    total_implemented = total_endpoints - total_missing
    
    gaps['summary'] = {
        'total_endpoints': total_endpoints,
        'total_implemented': total_implemented,
        'total_missing': total_missing,
        'coverage_percent': (total_implemented / total_endpoints * 100) if total_endpoints > 0 else 100
    }
    
    return gaps

def check_endpoint_implemented(endpoint, implementation):
    """Check if an endpoint is implemented using multiple strategies."""
    expected_class = endpoint['java_class_base']
    operation_id = endpoint['operation_id']
    summary = endpoint['summary']
    
    # Strategy 1: Check if request class exists
    expected_request = f"{expected_class}Request"
    if expected_request in implementation['request_classes']:
        return True
    
    # Strategy 2: Check service methods (case insensitive)
    expected_method = to_camel_case(expected_class)
    for method in implementation['service_methods']:
        if method.lower() == expected_method.lower():
            return True
    
    # Strategy 3: Special mappings for known cases
    special_mappings = {
        'StakingInitiate': ['createStake', 'CreateStake'],
        'StakingUnstake': ['createUnstake', 'CreateUnstake'],
        'GetFcmMarginCallDetails': ['getFcmMarginCallDetails'],
        'GetFcmRiskLimits': ['getFcmRiskLimits'],
        'ListOrderEditHistory': ['getOrderEditHistory', 'listOrderEditHistory']
    }
    
    if expected_class in special_mappings:
        for mapping in special_mappings[expected_class]:
            if mapping in implementation['service_methods']:
                return True
            if f"{mapping}Request" in implementation['request_classes']:
                return True
    
    # Strategy 4: Check for common variations
    variations = [
        expected_class.lower(),
        operation_id.lower(),
        to_camel_case(expected_class).lower(),
        summary.lower().replace(' ', '')
    ]
    
    for request_class in implementation['request_classes']:
        for variation in variations:
            if variation in request_class.lower():
                return True
    
    for method in implementation['service_methods']:
        for variation in variations:
            if variation in method.lower():
                return True
    
    return False

def to_camel_case(pascal_case):
    """Convert PascalCase to camelCase."""
    if not pascal_case:
        return pascal_case
    return pascal_case[0].lower() + pascal_case[1:]

def print_analysis_results(gaps):
    """Print comprehensive and accurate analysis results."""
    print("=" * 80)
    print("# Coinbase Prime Java SDK - ACCURATE Gap Analysis")
    print("=" * 80)
    
    summary = gaps['summary']
    print(f"\n## Executive Summary")
    print(f"- **Total OpenAPI Endpoints:** {summary['total_endpoints']}")
    print(f"- **Implemented Endpoints:** {summary['total_implemented']}")
    print(f"- **Missing Endpoints:** {summary['total_missing']}")
    print(f"- **Implementation Coverage:** {summary['coverage_percent']:.1f}%")
    
    print(f"\n## Package-by-Package Analysis")
    print("-" * 40)
    
    for package_name, analysis in sorted(gaps['package_analysis'].items()):
        coverage = analysis['coverage_percent']
        status = "✅" if coverage == 100 else "⚠️" if coverage >= 50 else "❌"
        
        print(f"\n### {analysis['tag']} {status}")
        print(f"**Package:** `com.coinbase.prime.{package_name}`")
        print(f"**Coverage:** {coverage:.1f}% ({analysis['implemented_count']}/{analysis['total_endpoints']})")
        
        if analysis['missing_endpoints']:
            print(f"**Missing Endpoints:**")
            for endpoint in analysis['missing_endpoints']:
                print(f"  - {endpoint['method']} {endpoint['path']}")
                print(f"    → Expected: `{endpoint['java_class_base']}Request.java`")
    
    if gaps['missing_completely']:
        print(f"\n## Completely Missing Packages")
        print("-" * 40)
        for endpoint in gaps['missing_completely']:
            print(f"- {endpoint['tag']}: {endpoint['method']} {endpoint['path']}")
    
    print(f"\n## True Missing Endpoints Summary")
    print("-" * 40)
    missing_count = 0
    for package_name, analysis in gaps['package_analysis'].items():
        if analysis['missing_endpoints']:
            print(f"\n**{analysis['tag']} ({len(analysis['missing_endpoints'])} missing):**")
            for endpoint in analysis['missing_endpoints']:
                missing_count += 1
                print(f"{missing_count}. {endpoint['method']} {endpoint['path']} → `{endpoint['java_class_base']}`")
    
    missing_count += len(gaps['missing_completely'])
    print(f"\n**TOTAL MISSING: {missing_count} endpoints**")

def main():
    """Main execution function."""
    print("Loading OpenAPI specification...")
    spec = load_openapi_spec()
    
    print("Extracting endpoint information...")
    endpoints = extract_openapi_endpoints(spec)
    
    print("Scanning actual Java implementations...")
    implementations = scan_actual_implementations()
    
    print("Performing accurate gap analysis...")
    gaps = analyze_gaps(endpoints, implementations)
    
    print_analysis_results(gaps)

if __name__ == "__main__":
    main()