#!/usr/bin/env python3
"""
Accurate endpoint analysis for Coinbase Prime Java SDK.
This script performs a detailed comparison between OpenAPI endpoints and implemented Java methods.
"""

import os
import re
import yaml
from pathlib import Path

def load_openapi_spec():
    """Load and parse OpenAPI specification."""
    spec_path = Path("apiSpec/prime-public-spec.yaml")
    with open(spec_path, 'r') as f:
        return yaml.safe_load(f)

def extract_openapi_endpoints(spec):
    """Extract all endpoints from OpenAPI spec."""
    endpoints = []
    
    for path, path_obj in spec.get('paths', {}).items():
        for method, method_obj in path_obj.items():
            if method.lower() in ['get', 'post', 'put', 'delete']:
                operation_id = method_obj.get('operationId', '')
                if operation_id.startswith('PrimeRESTAPI_'):
                    # Remove PrimeRESTAPI_ prefix
                    java_name = operation_id.replace('PrimeRESTAPI_', '')
                    summary = method_obj.get('summary', '')
                    tags = method_obj.get('tags', [])
                    tag = tags[0] if tags else 'Unknown'
                    
                    endpoints.append({
                        'path': path,
                        'method': method.upper(),
                        'operation_id': operation_id,
                        'java_name': java_name,
                        'summary': summary,
                        'tag': tag
                    })
    
    return endpoints

def scan_java_services():
    """Scan all Java service files to extract implemented methods."""
    services = {}
    
    # Find all service interface files
    src_path = Path("src/main/java/com/coinbase/prime")
    
    for service_dir in src_path.iterdir():
        if service_dir.is_dir() and service_dir.name not in ['client', 'credentials', 'errors', 'factory', 'model', 'common', 'utils']:
            service_file = service_dir / f"{service_dir.name.title()}Service.java"
            if not service_file.exists():
                # Try alternative naming patterns
                for file in service_dir.glob("*Service.java"):
                    if not file.name.endswith("ServiceImpl.java"):
                        service_file = file
                        break
            
            if service_file.exists():
                with open(service_file, 'r') as f:
                    content = f.read()
                    
                # Extract method names using regex
                method_pattern = r'(\w+Response)\s+(\w+)\s*\('
                methods = re.findall(method_pattern, content)
                
                services[service_dir.name] = {
                    'file': str(service_file),
                    'methods': [method[1] for method in methods]
                }
    
    return services

def convert_java_method_to_openapi_name(method_name):
    """Convert Java method name to expected OpenAPI operation name."""
    # Handle special cases for list vs get
    if method_name.startswith('list') and not method_name.startswith('listEntity'):
        # Convert listPortfolios -> GetPortfolios, listActivities -> GetActivities
        base_name = method_name[4:]  # Remove 'list'
        if base_name.endswith('s'):
            return f"Get{base_name}"
        else:
            return f"Get{base_name}s"
    elif method_name.startswith('listEntity'):
        # listEntityActivities -> GetEntityActivities
        return f"Get{method_name[4:]}"  # Remove 'list'
    elif method_name.startswith('get'):
        # Keep as is: getPortfolioById -> GetPortfolioById
        return method_name[0].upper() + method_name[1:]
    elif method_name.startswith('create'):
        # createOrder -> CreateOrder
        return method_name[0].upper() + method_name[1:]
    elif method_name.startswith('cancel'):
        # cancelOrder -> CancelOrder
        return method_name[0].upper() + method_name[1:]
    elif method_name.startswith('accept'):
        # acceptQuote -> AcceptQuote
        return method_name[0].upper() + method_name[1:]
    elif method_name.startswith('set'):
        # setAutoSweep -> SetAutoSweep
        return method_name[0].upper() + method_name[1:]
    elif method_name.startswith('schedule'):
        # scheduleEntityFuturesSweep -> ScheduleFuturesSweep
        return method_name[0].upper() + method_name[1:]
    else:
        return method_name[0].upper() + method_name[1:]

def analyze_gaps():
    """Perform gap analysis between OpenAPI spec and Java implementation."""
    print("Loading OpenAPI specification...")
    spec = load_openapi_spec()
    
    print("Extracting OpenAPI endpoints...")
    openapi_endpoints = extract_openapi_endpoints(spec)
    
    print("Scanning Java service implementations...")
    java_services = scan_java_services()
    
    print("\n" + "="*80)
    print("# Coinbase Prime Java SDK - Accurate Endpoint Analysis")
    print("="*80)
    
    # Group endpoints by tag/domain
    endpoints_by_tag = {}
    for endpoint in openapi_endpoints:
        tag = endpoint['tag']
        if tag not in endpoints_by_tag:
            endpoints_by_tag[tag] = []
        endpoints_by_tag[tag].append(endpoint)
    
    # Create mapping from tag to Java package
    tag_to_package = {
        'Activities': 'activities',
        'Address Book': 'addressbook', 
        'Allocations': 'allocations',
        'Assets': 'assets',
        'Balances': 'balances',
        'Commission': 'commission',
        'Financing': 'financing',
        'Futures': 'futures',
        'Invoice': 'invoice',
        'Onchain Address Groups': 'onchainaddressgroups',
        'Orders': 'orders',
        'Payment Methods': 'paymentmethods',
        'Portfolios': 'portfolios',
        'Positions': 'positions',
        'Products': 'products',
        'Staking': 'staking',
        'Transactions': 'transactions',
        'Users': 'users',
        'Wallets': 'wallets'
    }
    
    total_endpoints = len(openapi_endpoints)
    implemented_count = 0
    missing_endpoints = []
    
    for tag, endpoints in sorted(endpoints_by_tag.items()):
        package_name = tag_to_package.get(tag, tag.lower().replace(' ', ''))
        
        print(f"\n## {tag}")
        print(f"- **OpenAPI Tag:** `{tag}`")
        print(f"- **Java Package:** `com.coinbase.prime.{package_name}`")
        
        if package_name in java_services:
            java_methods = java_services[package_name]['methods']
            print(f"- **Implemented Methods:** {len(java_methods)}")
            print(f"- **OpenAPI Endpoints:** {len(endpoints)}")
            
            # Check each OpenAPI endpoint
            tag_missing = []
            tag_implemented = 0
            
            for endpoint in endpoints:
                java_name = endpoint['java_name']
                implemented = False
                
                # Try multiple matching strategies
                for java_method in java_methods:
                    converted_name = convert_java_method_to_openapi_name(java_method)
                    
                    # Direct match
                    if converted_name == java_name:
                        implemented = True
                        break
                    
                    # Case insensitive match
                    if converted_name.lower() == java_name.lower():
                        implemented = True
                        break
                    
                    # Handle specific naming variations
                    if (java_method == 'listPortfolios' and java_name == 'GetPortfolios') or \
                       (java_method == 'getPortfolioById' and java_name == 'GetPortfolio') or \
                       (java_method == 'getWalletById' and java_name == 'GetWallet') or \
                       (java_method == 'getOrderByOrderId' and java_name == 'GetOrder') or \
                       (java_method == 'getActivityByActivityId' and java_name == 'GetActivity'):
                        implemented = True
                        break
                
                if implemented:
                    tag_implemented += 1
                    implemented_count += 1
                else:
                    tag_missing.append(endpoint)
                    missing_endpoints.append(endpoint)
            
            if tag_missing:
                print(f"- **Status:** ❌ INCOMPLETE ({tag_implemented}/{len(endpoints)} implemented)")
                print("- **Missing Endpoints:**")
                for missing in tag_missing:
                    print(f"  - `{missing['method']} {missing['path']}` → `{missing['java_name']}` ({missing['summary']})")
            else:
                print(f"- **Status:** ✅ COMPLETE ({tag_implemented}/{len(endpoints)} implemented)")
                
            if java_methods:
                print("- **Implemented Java Methods:**")
                for method in sorted(java_methods):
                    print(f"  - `{method}()`")
        else:
            print(f"- **Status:** ❌ PACKAGE NOT FOUND")
            print(f"- **Missing Endpoints:** {len(endpoints)}")
            for endpoint in endpoints:
                missing_endpoints.append(endpoint)
    
    # Summary
    coverage = (implemented_count / total_endpoints) * 100 if total_endpoints > 0 else 0
    
    print(f"\n## Summary")
    print(f"- **Total OpenAPI Endpoints:** {total_endpoints}")
    print(f"- **Implemented Endpoints:** {implemented_count}")
    print(f"- **Missing Endpoints:** {len(missing_endpoints)}")
    print(f"- **Implementation Coverage:** {coverage:.1f}%")
    
    if missing_endpoints:
        print(f"\n## Complete List of Missing Endpoints")
        print(f"The following {len(missing_endpoints)} endpoints are missing from the Java SDK:")
        
        for endpoint in missing_endpoints:
            print(f"- **{endpoint['method']} {endpoint['path']}**")
            print(f"  - OpenAPI Operation: `{endpoint['operation_id']}`")
            print(f"  - Java Method Name: `{endpoint['java_name']}`")
            print(f"  - Summary: {endpoint['summary']}")
            print(f"  - Tag: {endpoint['tag']}")
            print()
    else:
        print(f"\n✅ **All OpenAPI endpoints are implemented in the Java SDK!**")

if __name__ == "__main__":
    analyze_gaps()