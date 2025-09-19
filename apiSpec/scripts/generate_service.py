#!/usr/bin/env python3
"""
Service Generator for Coinbase Prime SDK

Generates service interfaces and implementations from OpenAPI operations
following the established SDK patterns.
"""

import json
import re
from pathlib import Path
from typing import Dict, List, Any
from datetime import datetime

# License header template
LICENSE_HEADER = """/*
 * Copyright {year} Coinbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */"""

def load_analysis() -> Dict[str, Any]:
    """Load the OpenAPI analysis data."""
    analysis_file = Path("tmp/openapi_analysis.json")
    if not analysis_file.exists():
        raise FileNotFoundError("Run parse_openapi.py first to generate analysis data")
    
    with open(analysis_file) as f:
        return json.load(f)

def to_pascal_case(text: str) -> str:
    """Convert text to PascalCase."""
    return ''.join(word.capitalize() for word in re.split(r'[^a-zA-Z0-9]', text))

def to_camel_case(text: str) -> str:
    """Convert text to camelCase."""
    pascal = to_pascal_case(text)
    return pascal[0].lower() + pascal[1:] if pascal else ""

def generate_service_interface(domain: str, operations: List[Dict[str, Any]]) -> str:
    """Generate service interface code."""
    domain_class = to_pascal_case(domain)
    package_name = f"com.coinbase.prime.{domain.lower().replace(' ', '').replace('-', '')}"
    
    # Handle Web3 -> Onchain conversion
    if "web3" in package_name:
        package_name = package_name.replace("web3", "onchain")
    
    interface_code = f"""{LICENSE_HEADER.format(year=datetime.now().year)}

package {package_name};

import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.core.errors.CoinbaseClientException;

/**
 * Service interface for {domain} operations.
 * Generated from OpenAPI specification.
 */
public interface {domain_class}Service {{
"""
    
    # Add method declarations
    for operation in operations:
        method_name = to_camel_case(operation["javaMethodName"])
        request_type = f"{operation['javaMethodName']}Request"
        response_type = f"{operation['javaMethodName']}Response"
        
        interface_code += f"""
    /**
     * {operation.get('summary', operation['javaMethodName'])}
     */
    {response_type} {method_name}({request_type} request) 
        throws CoinbaseClientException, CoinbasePrimeException;
"""
    
    interface_code += "\n}\n"
    return interface_code

def generate_service_implementation(domain: str, operations: List[Dict[str, Any]]) -> str:
    """Generate service implementation code."""
    domain_class = to_pascal_case(domain)
    package_name = f"com.coinbase.prime.{domain.lower().replace(' ', '').replace('-', '')}"
    
    # Handle Web3 -> Onchain conversion
    if "web3" in package_name:
        package_name = package_name.replace("web3", "onchain")
    
    impl_code = f"""{LICENSE_HEADER.format(year=datetime.now().year)}

package {package_name};

import com.coinbase.prime.client.CoinbasePrimeClient;
import com.coinbase.prime.errors.CoinbasePrimeException;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;

/**
 * Implementation of {domain_class}Service.
 * Generated from OpenAPI specification.
 */
public class {domain_class}ServiceImpl extends CoinbaseServiceImpl implements {domain_class}Service {{

    public {domain_class}ServiceImpl(CoinbasePrimeClient client) {{
        super(client);
    }}
"""
    
    # Add method implementations
    for operation in operations:
        method_name = to_camel_case(operation["javaMethodName"])
        request_type = f"{operation['javaMethodName']}Request"
        response_type = f"{operation['javaMethodName']}Response"
        http_method = operation["httpMethod"]
        path = operation["path"]
        
        # Convert path parameters to Java format
        java_path = re.sub(r'\\{([^}]+)\\}', r'{$1}', path)
        
        impl_code += f"""
    @Override
    public {response_type} {method_name}({request_type} request) throws CoinbasePrimeException {{
        return this.request(
            HttpMethod.{http_method},
            "{java_path}",
            request,
            List.of(200),
            new TypeReference<{response_type}>() {{}}
        );
    }}
"""
    
    impl_code += "\n}\n"
    return impl_code

def generate_request_class(operation: Dict[str, Any], package_name: str) -> str:
    """Generate request class code."""
    class_name = f"{operation['javaMethodName']}Request"
    
    # Determine if this extends PrimeListRequest (for pagination)
    extends_list = operation.get("isBatch", False)
    base_class = "PrimeListRequest" if extends_list else ""
    import_base = "import com.coinbase.prime.common.PrimeListRequest;" if extends_list else ""
    extends_clause = f" extends {base_class}" if base_class else ""
    
    request_code = f"""{LICENSE_HEADER.format(year=datetime.now().year)}

package {package_name};

{import_base}
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request class for {operation['javaMethodName']} operation.
 * Generated from OpenAPI specification.
 */
public class {class_name}{extends_clause} {{
"""
    
    # Add fields based on parameters
    fields = []
    for param in operation.get("parameters", []):
        param_name = param["name"]
        java_field_name = to_camel_case(param_name)
        param_type = "String"  # Simplified - could be enhanced based on schema
        
        fields.append({
            "name": java_field_name,
            "jsonName": param_name,
            "type": param_type,
            "required": param.get("required", False)
        })
        
        request_code += f"""
    @JsonProperty("{param_name}")
    private {param_type} {java_field_name};
"""
    
    # Add Builder class
    request_code += f"""
    
    public static class Builder {{
        private {class_name} instance = new {class_name}();
"""
    
    # Add builder methods
    for field in fields:
        request_code += f"""
        public Builder {field['name']}({field['type']} {field['name']}) {{
            instance.{field['name']} = {field['name']};
            return this;
        }}
"""
    
    request_code += f"""
        public {class_name} build() {{
            return instance;
        }}
    }}
    
    public static Builder builder() {{
        return new Builder();
    }}
"""
    
    # Add getters and setters
    for field in fields:
        getter_name = f"get{field['name'].capitalize()}"
        setter_name = f"set{field['name'].capitalize()}"
        
        request_code += f"""
    public {field['type']} {getter_name}() {{
        return {field['name']};
    }}
    
    public void {setter_name}({field['type']} {field['name']}) {{
        this.{field['name']} = {field['name']};
    }}
"""
    
    request_code += "\n}\n"
    return request_code

def generate_response_class(operation: Dict[str, Any], package_name: str) -> str:
    """Generate response class code."""
    class_name = f"{operation['javaMethodName']}Response"
    
    # Determine if this extends PaginationResponse (for collections)
    extends_pagination = operation.get("isBatch", False)
    base_class = "PaginationResponse" if extends_pagination else ""
    import_base = "import com.coinbase.prime.common.PaginationResponse;" if extends_pagination else ""
    extends_clause = f" extends {base_class}" if base_class else ""
    
    response_code = f"""{LICENSE_HEADER.format(year=datetime.now().year)}

package {package_name};

{import_base}
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response class for {operation['javaMethodName']} operation.
 * Generated from OpenAPI specification.
 */
public class {class_name}{extends_clause} {{
"""
    
    # Add result fields (simplified - would need schema analysis for full implementation)
    if operation.get("isBatch", False):
        result_type = "Object"  # Would be determined from schema
        response_code += f"""
    @JsonProperty("results")
    private List<{result_type}> results;
    
    public List<{result_type}> getResults() {{
        return results;
    }}
    
    public void setResults(List<{result_type}> results) {{
        this.results = results;
    }}
"""
    else:
        response_code += f"""
    // Response fields would be generated based on OpenAPI schema
    // This is a placeholder implementation
"""
    
    response_code += "\n}\n"
    return response_code

def generate_factory_methods(domains: Dict[str, List[Dict[str, Any]]]) -> str:
    """Generate factory methods for PrimeServiceFactory."""
    factory_methods = "\n// Generated factory methods - add to PrimeServiceFactory.java\n"
    
    for domain, operations in domains.items():
        domain_class = to_pascal_case(domain)
        package_name = f"com.coinbase.prime.{domain.lower().replace(' ', '').replace('-', '')}"
        
        # Handle Web3 -> Onchain conversion
        if "web3" in package_name:
            package_name = package_name.replace("web3", "onchain")
        
        factory_methods += f"""
/**
 * Create {domain} service instance.
 */
public static {domain_class}Service create{domain_class}Service(CoinbasePrimeClient client) {{
    return new {package_name}.{domain_class}ServiceImpl(client);
}}
"""
    
    return factory_methods

def main():
    """Main execution function."""
    try:
        print("🔍 Loading OpenAPI analysis...")
        analysis = load_analysis()
        
        domains = analysis["analysis"]["domains"]
        
        print(f"🏗️  Generating services for {len(domains)} domains...")
        
        # Create output directory
        output_dir = Path("tmp/generated_services")
        output_dir.mkdir(exist_ok=True, parents=True)
        
        # Generate services for each domain
        for domain, operations in domains.items():
            print(f"  📦 Generating {domain} service...")
            
            domain_class = to_pascal_case(domain)
            package_name = f"com.coinbase.prime.{domain.lower().replace(' ', '').replace('-', '')}"
            
            # Handle Web3 -> Onchain conversion
            if "web3" in package_name:
                package_name = package_name.replace("web3", "onchain")
            
            # Generate interface
            interface_code = generate_service_interface(domain, operations)
            interface_file = output_dir / f"{domain_class}Service.java"
            with open(interface_file, 'w') as f:
                f.write(interface_code)
            
            # Generate implementation
            impl_code = generate_service_implementation(domain, operations)
            impl_file = output_dir / f"{domain_class}ServiceImpl.java"
            with open(impl_file, 'w') as f:
                f.write(impl_code)
            
            # Generate request/response classes for each operation
            for operation in operations:
                # Request class
                request_code = generate_request_class(operation, package_name)
                request_file = output_dir / f"{operation['javaMethodName']}Request.java"
                with open(request_file, 'w') as f:
                    f.write(request_code)
                
                # Response class
                response_code = generate_response_class(operation, package_name)
                response_file = output_dir / f"{operation['javaMethodName']}Response.java"
                with open(response_file, 'w') as f:
                    f.write(response_code)
        
        # Generate factory methods
        factory_code = generate_factory_methods(domains)
        factory_file = output_dir / "PrimeServiceFactory_additions.java"
        with open(factory_file, 'w') as f:
            f.write(factory_code)
        
        print(f"✅ Generation complete!")
        print(f"📁 Files generated in {output_dir}")
        print(f"📝 Factory methods in {factory_file}")
        
        return 0
        
    except Exception as e:
        print(f"❌ Error: {e}")
        return 1

if __name__ == "__main__":
    import sys
    sys.exit(main())