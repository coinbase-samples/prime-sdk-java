#!/usr/bin/env python3
"""
OpenAPI Specification Parser for Coinbase Prime SDK Generation

This script parses the OpenAPI specification and extracts all operations
and schemas needed for complete SDK generation.
"""

import yaml
import json
import sys
from pathlib import Path
from typing import Dict, List, Any

def load_openapi_spec(spec_path: str = "apiSpec/prime-public-spec.yaml") -> Dict[str, Any]:
    """Load and parse the OpenAPI specification file."""
    spec_file = Path(spec_path)
    if not spec_file.exists():
        raise FileNotFoundError(f"OpenAPI spec not found at {spec_path}")
    
    with open(spec_file, 'r') as f:
        return yaml.safe_load(f)

def extract_operations(spec: Dict[str, Any]) -> List[Dict[str, Any]]:
    """Extract all operations from the OpenAPI specification."""
    operations = []
    
    for path, methods in spec.get("paths", {}).items():
        for method, operation in methods.items():
            if isinstance(operation, dict) and "operationId" in operation:
                # Determine if this is a batch operation (collection)
                is_batch = (
                    operation["operationId"].startswith("PrimeRESTAPI_Get") and
                    (operation["operationId"].endswith("s") or "List" in operation.get("summary", ""))
                )
                
                # Convert operation ID to Java method name
                java_method = operation["operationId"].replace("PrimeRESTAPI_", "")
                if is_batch and java_method.startswith("Get"):
                    java_method = java_method.replace("Get", "List", 1)
                
                operations.append({
                    "operationId": operation["operationId"],
                    "javaMethodName": java_method,
                    "httpMethod": method.upper(),
                    "path": path,
                    "tags": operation.get("tags", []),
                    "summary": operation.get("summary", ""),
                    "parameters": operation.get("parameters", []),
                    "requestBody": operation.get("requestBody", {}),
                    "responses": operation.get("responses", {}),
                    "isBatch": is_batch
                })
    
    return sorted(operations, key=lambda x: (x["tags"][0] if x["tags"] else "", x["javaMethodName"]))

def extract_schemas(spec: Dict[str, Any]) -> Dict[str, Dict[str, Any]]:
    """Extract all schemas from the OpenAPI specification."""
    return spec.get("components", {}).get("schemas", {})

def categorize_schemas(schemas: Dict[str, Dict[str, Any]]) -> Dict[str, List[str]]:
    """Categorize schemas by their type for generation planning."""
    categories = {
        "responses": [],
        "requests": [],
        "domain_models": [],
        "enums": [],
        "metadata": []
    }
    
    for schema_name, schema_def in schemas.items():
        if schema_name.endswith("Response"):
            categories["responses"].append(schema_name)
        elif schema_name.endswith("Request"):
            categories["requests"].append(schema_name)
        elif schema_def.get("type") == "string" and "enum" in schema_def:
            categories["enums"].append(schema_name)
        elif schema_name in ["Pagination", "Error", "Meta"]:
            categories["metadata"].append(schema_name)
        else:
            categories["domain_models"].append(schema_name)
    
    return categories

def generate_package_mapping(operations: List[Dict[str, Any]]) -> Dict[str, str]:
    """Generate mapping from OpenAPI tags to Java packages."""
    tag_to_package = {}
    
    for operation in operations:
        for tag in operation["tags"]:
            # Convert tag to Java package name
            package_name = tag.lower().replace(" ", "").replace("-", "")
            
            # Handle Web3 -> Onchain conversion
            if "web3" in package_name:
                package_name = package_name.replace("web3", "onchain")
            
            tag_to_package[tag] = f"com.coinbase.prime.{package_name}"
    
    return tag_to_package

def analyze_coverage(operations: List[Dict[str, Any]], schemas: Dict[str, Any]) -> Dict[str, Any]:
    """Analyze current coverage and identify gaps."""
    
    # Group operations by domain
    domains = {}
    for op in operations:
        domain = op["tags"][0] if op["tags"] else "misc"
        if domain not in domains:
            domains[domain] = []
        domains[domain].append(op)
    
    schema_categories = categorize_schemas(schemas)
    
    return {
        "summary": {
            "total_operations": len(operations),
            "total_schemas": len(schemas),
            "total_domains": len(domains)
        },
        "domains": domains,
        "schema_categories": schema_categories,
        "package_mapping": generate_package_mapping(operations)
    }

def main():
    """Main execution function."""
    try:
        print("🔍 Parsing OpenAPI specification...")
        spec = load_openapi_spec()
        
        print("📋 Extracting operations...")
        operations = extract_operations(spec)
        
        print("🏗️  Extracting schemas...")
        schemas = extract_schemas(spec)
        
        print("📊 Analyzing coverage...")
        analysis = analyze_coverage(operations, schemas)
        
        # Generate output
        output = {
            "spec_info": {
                "title": spec.get("info", {}).get("title", "Unknown"),
                "version": spec.get("info", {}).get("version", "Unknown"),
                "server": spec.get("servers", [{}])[0].get("url", "Unknown")
            },
            "operations": operations,
            "schemas": schemas,
            "analysis": analysis
        }
        
        # Save detailed analysis
        output_file = Path("tmp/openapi_analysis.json")
        output_file.parent.mkdir(exist_ok=True)
        
        with open(output_file, 'w') as f:
            json.dump(output, f, indent=2, sort_keys=True)
        
        # Print summary
        print(f"\n✅ Analysis complete!")
        print(f"📈 Found {analysis['summary']['total_operations']} operations")
        print(f"🏗️  Found {analysis['summary']['total_schemas']} schemas")
        print(f"📦 Across {analysis['summary']['total_domains']} domains")
        print(f"💾 Detailed analysis saved to {output_file}")
        
        # Print domain breakdown
        print(f"\n📋 Domain Breakdown:")
        for domain, ops in analysis["domains"].items():
            print(f"  {domain}: {len(ops)} operations")
        
        # Print schema categories
        print(f"\n🏗️  Schema Categories:")
        for category, items in analysis["schema_categories"].items():
            print(f"  {category}: {len(items)} items")
            
        return 0
        
    except Exception as e:
        print(f"❌ Error: {e}", file=sys.stderr)
        return 1

if __name__ == "__main__":
    sys.exit(main())