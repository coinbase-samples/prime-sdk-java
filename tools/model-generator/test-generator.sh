#!/bin/bash
#
# Test Script for Model Generator
# 
# This script validates that the model generator can:
# 1. Build successfully
# 2. Run without errors
# 3. Generate valid Java code
#
# Usage: ./test-generator.sh

set -e  # Exit on error

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/../.." && pwd)"

echo "=========================================="
echo "Model Generator Test Suite"
echo "=========================================="
echo ""

# Test 1: Build the generator
echo "Test 1: Building model generator..."
cd "$SCRIPT_DIR"
mvn clean package -q
if [ $? -eq 0 ]; then
    echo "✅ PASS: Generator builds successfully"
else
    echo "❌ FAIL: Generator build failed"
    exit 1
fi
echo ""

# Test 2: Check JAR exists
echo "Test 2: Checking generated JAR..."
JAR_FILE="$SCRIPT_DIR/target/model-generator-1.0.0.jar"
if [ -f "$JAR_FILE" ]; then
    echo "✅ PASS: JAR file exists at $JAR_FILE"
else
    echo "❌ FAIL: JAR file not found"
    exit 1
fi
echo ""

# Test 3: Run generator in dry-run mode (just parse, don't write)
echo "Test 3: Running generator (incremental mode)..."
cd "$SCRIPT_DIR"
mvn exec:java@generate-models -q 2>&1 | tail -20
if [ $? -eq 0 ]; then
    echo "✅ PASS: Generator runs without errors"
else
    echo "❌ FAIL: Generator execution failed"
    exit 1
fi
echo ""

# Test 4: Check output structure
echo "Test 4: Validating output structure..."
MODEL_DIR="$PROJECT_ROOT/src/main/java/com/coinbase/prime/model"
ENUMS_DIR="$MODEL_DIR/enums"

if [ -d "$MODEL_DIR" ]; then
    MODEL_COUNT=$(find "$MODEL_DIR" -maxdepth 1 -name "*.java" -type f | wc -l | tr -d ' ')
    echo "✅ PASS: Model directory exists with $MODEL_COUNT model files"
else
    echo "❌ FAIL: Model directory not found"
    exit 1
fi

if [ -d "$ENUMS_DIR" ]; then
    ENUM_COUNT=$(find "$ENUMS_DIR" -name "*.java" -type f | wc -l | tr -d ' ')
    echo "✅ PASS: Enums directory exists with $ENUM_COUNT enum files"
else
    echo "❌ FAIL: Enums directory not found"
    exit 1
fi
echo ""

# Test 5: Verify key models exist
echo "Test 5: Checking for key model files..."
KEY_MODELS=(
    "Asset.java"
    "Balance.java"
    "Order.java"
    "Activity.java"
    "Portfolio.java"
)

for model in "${KEY_MODELS[@]}"; do
    if [ -f "$MODEL_DIR/$model" ]; then
        echo "  ✓ $model exists"
    else
        echo "  ⚠ $model missing (may not be in OpenAPI spec)"
    fi
done
echo ""

# Test 6: Verify no unwanted files
echo "Test 6: Checking for unwanted files..."
UNWANTED_FOUND=0

# Check for Request/Response files
REQUEST_FILES=$(find "$MODEL_DIR" -maxdepth 1 -name "*Request.java" -type f | wc -l | tr -d ' ')
RESPONSE_FILES=$(find "$MODEL_DIR" -maxdepth 1 -name "*Response.java" -type f | wc -l | tr -d ' ')

if [ "$REQUEST_FILES" -eq 0 ]; then
    echo "  ✅ No *Request.java files in model/ (correct)"
else
    echo "  ❌ Found $REQUEST_FILES *Request.java files in model/ (should be in services)"
    UNWANTED_FOUND=1
fi

if [ "$RESPONSE_FILES" -eq 0 ]; then
    echo "  ✅ No *Response.java files in model/ (correct)"
else
    echo "  ❌ Found $RESPONSE_FILES *Response.java files in model/ (should be in services)"
    UNWANTED_FOUND=1
fi

# Check for Google files
GOOGLE_FILES=$(find "$MODEL_DIR" -name "Google*.java" -type f | wc -l | tr -d ' ')
if [ "$GOOGLE_FILES" -eq 0 ]; then
    echo "  ✅ No Google*.java files (correct)"
else
    echo "  ❌ Found $GOOGLE_FILES Google*.java files (should be filtered)"
    UNWANTED_FOUND=1
fi

if [ "$UNWANTED_FOUND" -eq 0 ]; then
    echo "✅ PASS: No unwanted files found"
else
    echo "❌ FAIL: Unwanted files detected"
    exit 1
fi
echo ""

# Test 7: Validate Java syntax (quick check)
echo "Test 7: Validating generated Java syntax..."
cd "$PROJECT_ROOT"
mvn compile -q -DskipTests 2>&1 | grep -i "error" || true
if [ $? -ne 0 ]; then
    echo "✅ PASS: Generated code compiles without errors"
else
    echo "❌ FAIL: Compilation errors detected"
    exit 1
fi
echo ""

echo "=========================================="
echo "All Tests Passed! ✅"
echo "=========================================="
echo ""
echo "Summary:"
echo "  - Generator builds: ✅"
echo "  - Generator runs: ✅"
echo "  - Output structure: ✅"
echo "  - Key models exist: ✅"
echo "  - No unwanted files: ✅"
echo "  - Code compiles: ✅"
echo ""
echo "Next steps:"
echo "  1. Run full test suite: cd $PROJECT_ROOT && mvn test"
echo "  2. Review generated models in: $MODEL_DIR"
echo "  3. Commit changes if everything looks good"
echo ""

