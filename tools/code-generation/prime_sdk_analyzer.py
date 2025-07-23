#!/usr/bin/env python3
"""
Coinbase Prime Java SDK - Comprehensive Analysis Tool

This consolidated script provides complete analysis capabilities for the Coinbase Prime Java SDK:
- OpenAPI specification parsing and endpoint extraction
- Java implementation scanning and gap analysis  
- Naming standardization and rename recommendations
- Implementation coverage reporting
- Cross-SDK consistency validation

Usage:
    python prime_sdk_analyzer.py [--mode MODE] [--output FORMAT]
    
    Modes:
        gap         - Gap analysis (default)
        naming      - Naming analysis and standardization
        coverage    - Implementation coverage report
        endpoints   - OpenAPI endpoint extraction
        all         - All analyses
    
    Output formats:
        console     - Console output (default)
        json        - JSON output
        markdown    - Markdown report
        
Examples:
    python prime_sdk_analyzer.py                    # Basic gap analysis
    python prime_sdk_analyzer.py --mode all         # Complete analysis
    python prime_sdk_analyzer.py --mode naming --output json
"""

import yaml
import json
import re
import subprocess
import argparse
from pathlib import Path
from typing import Dict, List, Tuple, Optional

class PrimeSDKAnalyzer:
    """Comprehensive analyzer for Coinbase Prime Java SDK."""
    
    def __init__(self, spec_path: str = "../../apiSpec/prime-public-spec.yaml"):
        self.script_dir = Path(__file__).parent
        self.spec_path = self.script_dir / spec_path
        self.src_dir = self.script_dir / "../../src/main/java/com/coinbase/prime"
        self.spec = None
        self.openapi_endpoints = []
        self.java_implementation = {}
        
    def load_openapi_spec(self) -> Dict:
        """Load and parse OpenAPI specification."""
        if self.spec is None:
            with open(self.spec_path, 'r') as f:
                self.spec = yaml.safe_load(f)
        return self.spec
    
    def extract_openapi_endpoints(self) -> List[Dict]:
        """Extract all endpoints from OpenAPI spec with comprehensive metadata."""
        if self.openapi_endpoints:
            return self.openapi_endpoints
            
        spec = self.load_openapi_spec()
        endpoints = []
        
        for path, path_obj in spec.get('paths', {}).items():
            for method, method_obj in path_obj.items():
                if method.lower() in ['get', 'post', 'put', 'delete', 'patch']:
                    operation_id = method_obj.get('operationId', '')
                    if operation_id.startswith('PrimeRESTAPI_'):
                        # Clean operation ID
                        clean_operation_id = operation_id.replace('PrimeRESTAPI_', '')
                        
                        # Extract metadata
                        summary = method_obj.get('summary', '')
                        tags = method_obj.get('tags', [])
                        tag = tags[0] if tags else 'Unknown'
                        
                        # Generate standardized Java names
                        java_class = self._standardize_java_name(
                            clean_operation_id, summary, method, path
                        )
                        package_name = self._tag_to_package(tag)
                        
                        # Extract parameters and request/response info
                        parameters = self._extract_parameters(method_obj)
                        request_body = self._extract_request_body(method_obj)
                        responses = self._extract_responses(method_obj)
                        
                        endpoint = {
                            'path': path,
                            'method': method.upper(),
                            'operation_id': operation_id,
                            'clean_operation_id': clean_operation_id,
                            'java_class': java_class,
                            'package_name': package_name,
                            'tag': tag,
                            'summary': summary,
                            'description': method_obj.get('description', ''),
                            'parameters': parameters,
                            'request_body': request_body,
                            'responses': responses,
                            'is_batch_operation': self._is_batch_operation(
                                clean_operation_id, summary, method, path
                            )
                        }
                        
                        endpoints.append(endpoint)
        
        self.openapi_endpoints = endpoints
        return endpoints
    
    def scan_java_implementation(self) -> Dict:
        """Comprehensive scan of Java implementation."""
        if self.java_implementation:
            return self.java_implementation
            
        implementation = {}
        
        if not self.src_dir.exists():
            return implementation
        
        for package_dir in self.src_dir.iterdir():
            if not package_dir.is_dir() or package_dir.name.startswith('.'):
                continue
                
            package_name = package_dir.name
            
            # Skip non-service packages
            if package_name in ['client', 'credentials', 'errors', 'factory', 'model', 'common', 'utils']:
                continue
            
            package_info = {
                'requests': [],
                'responses': [],
                'services': [],
                'service_methods': set(),
                'implemented_endpoints': [],
                'path': str(package_dir)
            }
            
            # Scan Java files
            for java_file in package_dir.glob("*.java"):
                filename = java_file.stem
                
                if filename.endswith('Request'):
                    class_name = filename[:-7]  # Remove 'Request'
                    package_info['requests'].append(class_name)
                elif filename.endswith('Response'):
                    class_name = filename[:-8]  # Remove 'Response'
                    package_info['responses'].append(class_name)
                elif filename.endswith('Service') and not filename.endswith('ServiceImpl'):
                    package_info['services'].append(filename[:-7])  # Remove 'Service'
            
            # Extract service methods from interface
            service_file = package_dir / f"{package_name.title()}Service.java"
            if service_file.exists():
                try:
                    with open(service_file, 'r') as f:
                        content = f.read()
                        # Extract method signatures
                        method_pattern = r'(\w+Response)\s+(\w+)\s*\([^)]*\)'
                        methods = re.findall(method_pattern, content)
                        package_info['service_methods'].update(method[1] for method in methods)
                except:
                    pass
            
            # Extract actual implemented endpoints from ServiceImpl
            impl_file = package_dir / f"{package_name.title()}ServiceImpl.java"
            if impl_file.exists():
                package_info['implemented_endpoints'] = self._extract_implemented_endpoints(impl_file)
            
            implementation[package_name] = package_info
        
        self.java_implementation = implementation
        return implementation
    
    def analyze_gaps(self) -> Dict:
        """Perform comprehensive gap analysis."""
        endpoints = self.extract_openapi_endpoints()
        implementation = self.scan_java_implementation()
        
        # Group endpoints by package
        endpoints_by_package = {}
        for endpoint in endpoints:
            package = endpoint['package_name']
            if package not in endpoints_by_package:
                endpoints_by_package[package] = []
            endpoints_by_package[package].append(endpoint)
        
        results = {
            'summary': {},
            'packages': {},
            'missing_packages': [],
            'missing_endpoints': [],
            'implemented_endpoints': []
        }
        
        total_endpoints = len(endpoints)
        total_implemented = 0
        
        for package_name, package_endpoints in endpoints_by_package.items():
            if package_name not in implementation:
                # Entire package is missing
                results['missing_packages'].append({
                    'package': package_name,
                    'endpoints': package_endpoints,
                    'tag': package_endpoints[0]['tag'] if package_endpoints else 'Unknown'
                })
                results['missing_endpoints'].extend(package_endpoints)
                continue
            
            impl = implementation[package_name]
            package_missing = []
            package_implemented = []
            
            for endpoint in package_endpoints:
                is_implemented = self._is_endpoint_implemented(endpoint, impl)
                if is_implemented:
                    package_implemented.append(endpoint)
                    total_implemented += 1
                else:
                    package_missing.append(endpoint)
                    results['missing_endpoints'].append(endpoint)
            
            coverage = (len(package_implemented) / len(package_endpoints) * 100) if package_endpoints else 100
            
            results['packages'][package_name] = {
                'tag': package_endpoints[0]['tag'],
                'total_endpoints': len(package_endpoints),
                'implemented_count': len(package_implemented),
                'missing_count': len(package_missing),
                'coverage_percent': coverage,
                'missing_endpoints': package_missing,
                'implemented_endpoints': package_implemented
            }
            
            results['implemented_endpoints'].extend(package_implemented)
        
        results['summary'] = {
            'total_endpoints': total_endpoints,
            'total_implemented': total_implemented,
            'total_missing': len(results['missing_endpoints']),
            'coverage_percent': (total_implemented / total_endpoints * 100) if total_endpoints > 0 else 100,
            'total_packages': len(endpoints_by_package),
            'implemented_packages': len([p for p in endpoints_by_package.keys() if p in implementation]),
            'missing_packages': len(results['missing_packages'])
        }
        
        return results
    
    def analyze_naming(self) -> Dict:
        """Analyze naming conventions and suggest standardizations."""
        endpoints = self.extract_openapi_endpoints()
        implementation = self.scan_java_implementation()
        
        results = {
            'renames_needed': [],
            'name_matches': [],
            'missing_operations': [],
            'summary': {}
        }
        
        for endpoint in endpoints:
            package = endpoint['package_name']
            expected_name = endpoint['java_class']
            
            if package not in implementation:
                results['missing_operations'].append(endpoint)
                continue
            
            impl = implementation[package]
            actual_name = self._find_matching_implementation(expected_name, impl['requests'])
            
            if actual_name:
                if actual_name == expected_name:
                    results['name_matches'].append({
                        'endpoint': endpoint,
                        'actual_name': actual_name
                    })
                else:
                    results['renames_needed'].append({
                        'endpoint': endpoint,
                        'current_name': actual_name,
                        'standardized_name': expected_name
                    })
            else:
                results['missing_operations'].append(endpoint)
        
        results['summary'] = {
            'total_operations': len(endpoints),
            'exact_matches': len(results['name_matches']),
            'renames_needed': len(results['renames_needed']),
            'missing_operations': len(results['missing_operations'])
        }
        
        return results
    
    def generate_coverage_report(self) -> Dict:
        """Generate detailed implementation coverage report."""
        gap_analysis = self.analyze_gaps()
        naming_analysis = self.analyze_naming()
        
        return {
            'coverage': gap_analysis,
            'naming': naming_analysis,
            'recommendations': self._generate_recommendations(gap_analysis, naming_analysis)
        }
    
    def _standardize_java_name(self, operation_id: str, summary: str, method: str, path: str) -> str:
        """Generate standardized Java class name following SDK conventions."""
        # Handle special known mappings first
        special_mappings = {
            'GetActivity': 'GetActivity',  # Not GetActivityByActivityId
            'GetPortfolio': 'GetPortfolio',  # Not GetPortfolioById
            'GetWallet': 'GetWallet',  # Not GetWalletById
            'GetOrder': 'GetOrder'  # Not GetOrderByOrderId
        }
        
        if operation_id in special_mappings:
            return special_mappings[operation_id]
        
        # Determine if this is a batch operation
        is_batch = self._is_batch_operation(operation_id, summary, method, path)
        
        # Convert to words
        words = re.findall(r'[A-Z][a-z]*|[a-z]+', operation_id)
        
        if not words:
            return operation_id
        
        # Apply batch operation rules
        if is_batch and words[0].lower() == 'get':
            words[0] = 'List'
        elif not is_batch and words[0].lower() not in ['get', 'create', 'update', 'delete', 'cancel', 'accept', 'set', 'schedule']:
            if method.upper() == 'GET':
                words.insert(0, 'Get')
            elif method.upper() == 'POST':
                words.insert(0, 'Create')
            elif method.upper() == 'PUT':
                words.insert(0, 'Update')
            elif method.upper() == 'DELETE':
                words.insert(0, 'Delete')
        
        return ''.join(word.capitalize() for word in words)
    
    def _is_batch_operation(self, operation_id: str, summary: str, method: str, path: str) -> bool:
        """Determine if an operation is a batch (list) operation."""
        return (
            method.upper() == 'GET' and
            ('{' not in path.split('/')[-1] or  # No ID parameter at the end
             any(keyword in summary.lower() for keyword in ['list', 'get all', 'retrieve all']) or
             operation_id.lower().endswith('s') or  # Plural form
             'list' in operation_id.lower())
        )
    
    def _tag_to_package(self, tag: str) -> str:
        """Convert OpenAPI tag to Java package name."""
        return tag.lower().replace(' ', '').replace('-', '').replace('_', '')
    
    def _extract_parameters(self, operation: Dict) -> List[Dict]:
        """Extract parameter information from operation."""
        parameters = []
        for param in operation.get('parameters', []):
            parameters.append({
                'name': param.get('name'),
                'in': param.get('in'),
                'required': param.get('required', False),
                'type': param.get('schema', {}).get('type', 'string'),
                'description': param.get('description', '')
            })
        return parameters
    
    def _extract_request_body(self, operation: Dict) -> Optional[str]:
        """Extract request body schema name."""
        request_body = operation.get('requestBody', {})
        content = request_body.get('content', {})
        json_content = content.get('application/json', {})
        schema = json_content.get('schema', {})
        ref = schema.get('$ref', '')
        return ref.split('/')[-1] if ref else None
    
    def _extract_responses(self, operation: Dict) -> Dict[str, str]:
        """Extract response schema names by status code."""
        responses = {}
        for status, response in operation.get('responses', {}).items():
            content = response.get('content', {})
            json_content = content.get('application/json', {})
            schema = json_content.get('schema', {})
            ref = schema.get('$ref', '')
            if ref:
                responses[status] = ref.split('/')[-1]
        return responses
    
    def _extract_implemented_endpoints(self, impl_file: Path) -> List[Dict]:
        """Extract implemented endpoints from ServiceImpl file."""
        implemented = []
        try:
            with open(impl_file, 'r') as f:
                content = f.read()
                
            # Look for String.format patterns that indicate API paths
            path_pattern = r'String\.format\("([^"]+)"'
            paths = re.findall(path_pattern, content)
            
            for path in paths:
                # Try to determine HTTP method from context
                method = 'GET'  # Default
                # This could be enhanced to parse method from surrounding code
                implemented.append({
                    'path': path,
                    'method': method
                })
        except:
            pass
        
        return implemented
    
    def _is_endpoint_implemented(self, endpoint: Dict, implementation: Dict) -> bool:
        """Check if an endpoint is implemented using multiple strategies."""
        expected_class = endpoint['java_class']
        
        # Strategy 1: Check if request class exists
        if expected_class in implementation['requests']:
            return True
        
        # Strategy 2: Check service methods (camelCase)
        expected_method = self._to_camel_case(expected_class)
        if expected_method in implementation['service_methods']:
            return True
        
        # Strategy 3: Case-insensitive partial matching
        for request_class in implementation['requests']:
            if request_class.lower() == expected_class.lower():
                return True
            
            # Remove common prefixes for comparison
            request_clean = self._clean_name_for_comparison(request_class)
            expected_clean = self._clean_name_for_comparison(expected_class)
            if request_clean == expected_clean:
                return True
        
        return False
    
    def _find_matching_implementation(self, expected_name: str, request_classes: List[str]) -> Optional[str]:
        """Find the actual implementation name that matches the expected name."""
        # Exact match
        if expected_name in request_classes:
            return expected_name
        
        # Case-insensitive match
        for actual_name in request_classes:
            if actual_name.lower() == expected_name.lower():
                return actual_name
        
        # Semantic match (ignoring prefixes)
        expected_clean = self._clean_name_for_comparison(expected_name)
        for actual_name in request_classes:
            actual_clean = self._clean_name_for_comparison(actual_name)
            if actual_clean == expected_clean:
                return actual_name
        
        return None
    
    def _clean_name_for_comparison(self, name: str) -> str:
        """Clean name for semantic comparison."""
        return name.lower().replace('get', '').replace('list', '').replace('create', '').replace('update', '').replace('delete', '')
    
    def _to_camel_case(self, pascal_case: str) -> str:
        """Convert PascalCase to camelCase."""
        return pascal_case[0].lower() + pascal_case[1:] if pascal_case else pascal_case
    
    def _generate_recommendations(self, gap_analysis: Dict, naming_analysis: Dict) -> Dict:
        """Generate actionable recommendations."""
        recommendations = {
            'priority_actions': [],
            'renames': [],
            'new_implementations': []
        }
        
        # High priority: Missing entire packages
        for missing_pkg in gap_analysis['missing_packages']:
            recommendations['priority_actions'].append({
                'type': 'create_package',
                'package': missing_pkg['package'],
                'tag': missing_pkg['tag'],
                'endpoints_count': len(missing_pkg['endpoints'])
            })
        
        # Medium priority: Renames for consistency
        for rename in naming_analysis['renames_needed']:
            recommendations['renames'].append({
                'current': rename['current_name'],
                'new': rename['standardized_name'],
                'package': rename['endpoint']['package_name'],
                'endpoint': f"{rename['endpoint']['method']} {rename['endpoint']['path']}"
            })
        
        # Low priority: Individual missing endpoints
        for endpoint in gap_analysis['missing_endpoints']:
            if endpoint['package_name'] in gap_analysis['packages']:  # Package exists
                recommendations['new_implementations'].append({
                    'class': endpoint['java_class'],
                    'package': endpoint['package_name'],
                    'endpoint': f"{endpoint['method']} {endpoint['path']}",
                    'summary': endpoint['summary']
                })
        
        return recommendations

def print_gap_analysis(results: Dict) -> None:
    """Print gap analysis results to console."""
    print("=" * 80)
    print("# Coinbase Prime Java SDK - Gap Analysis")
    print("=" * 80)
    
    summary = results['summary']
    print(f"\n## Summary")
    print(f"- **Total OpenAPI Endpoints:** {summary['total_endpoints']}")
    print(f"- **Implemented Endpoints:** {summary['total_implemented']}")
    print(f"- **Missing Endpoints:** {summary['total_missing']}")
    print(f"- **Implementation Coverage:** {summary['coverage_percent']:.1f}%")
    print(f"- **Packages:** {summary['implemented_packages']}/{summary['total_packages']}")
    
    if results['missing_packages']:
        print(f"\n## ❌ Missing Packages ({len(results['missing_packages'])})")
        for pkg in results['missing_packages']:
            print(f"- **{pkg['tag']}** (`com.coinbase.prime.{pkg['package']}`)")
            print(f"  Missing {len(pkg['endpoints'])} endpoints")
    
    print(f"\n## Package Analysis")
    for package_name, analysis in sorted(results['packages'].items()):
        coverage = analysis['coverage_percent']
        status = "✅" if coverage == 100 else "⚠️" if coverage >= 50 else "❌"
        
        print(f"\n### {analysis['tag']} {status}")
        print(f"**Package:** `com.coinbase.prime.{package_name}`")
        print(f"**Coverage:** {coverage:.1f}% ({analysis['implemented_count']}/{analysis['total_endpoints']})")
        
        if analysis['missing_endpoints']:
            print("**Missing:**")
            for endpoint in analysis['missing_endpoints']:
                print(f"  - {endpoint['method']} {endpoint['path']} → `{endpoint['java_class']}`")

def print_naming_analysis(results: Dict) -> None:
    """Print naming analysis results to console."""
    print("=" * 80)
    print("# Coinbase Prime Java SDK - Naming Analysis")
    print("=" * 80)
    
    summary = results['summary']
    print(f"\n## Summary")
    print(f"- **Total Operations:** {summary['total_operations']}")
    print(f"- **Exact Name Matches:** {summary['exact_matches']}")
    print(f"- **Renames Needed:** {summary['renames_needed']}")
    print(f"- **Missing Operations:** {summary['missing_operations']}")
    
    if results['renames_needed']:
        print(f"\n## 🔄 Renames Needed ({len(results['renames_needed'])})")
        
        current_package = None
        for rename in results['renames_needed']:
            endpoint = rename['endpoint']
            if endpoint['package_name'] != current_package:
                current_package = endpoint['package_name']
                print(f"\n### Package: {current_package}")
            
            print(f"- **{rename['current_name']}** → **{rename['standardized_name']}**")
            print(f"  `{endpoint['method']} {endpoint['path']}`")

def main():
    """Main execution function."""
    parser = argparse.ArgumentParser(description='Coinbase Prime Java SDK Analysis Tool')
    parser.add_argument('--mode', choices=['gap', 'naming', 'coverage', 'endpoints', 'all'], 
                       default='gap', help='Analysis mode')
    parser.add_argument('--output', choices=['console', 'json', 'markdown'], 
                       default='console', help='Output format')
    parser.add_argument('--spec', default='../../apiSpec/prime-public-spec.yaml',
                       help='Path to OpenAPI specification')
    
    args = parser.parse_args()
    
    try:
        analyzer = PrimeSDKAnalyzer(args.spec)
        
        if args.mode == 'gap' or args.mode == 'all':
            results = analyzer.analyze_gaps()
            if args.output == 'console':
                print_gap_analysis(results)
            elif args.output == 'json':
                print(json.dumps(results, indent=2))
        
        if args.mode == 'naming' or args.mode == 'all':
            results = analyzer.analyze_naming()
            if args.output == 'console':
                print_naming_analysis(results)
            elif args.output == 'json':
                print(json.dumps(results, indent=2))
        
        if args.mode == 'coverage' or args.mode == 'all':
            results = analyzer.generate_coverage_report()
            if args.output == 'console':
                print_gap_analysis(results['coverage'])
                print_naming_analysis(results['naming'])
            elif args.output == 'json':
                print(json.dumps(results, indent=2))
        
        if args.mode == 'endpoints':
            endpoints = analyzer.extract_openapi_endpoints()
            if args.output == 'console':
                print(f"Found {len(endpoints)} OpenAPI endpoints")
                for endpoint in endpoints[:5]:  # Show first 5
                    print(f"- {endpoint['method']} {endpoint['path']} → {endpoint['java_class']}")
            elif args.output == 'json':
                print(json.dumps(endpoints, indent=2))
                
    except Exception as e:
        print(f"Error during analysis: {e}")
        import traceback
        traceback.print_exc()

if __name__ == "__main__":
    main()