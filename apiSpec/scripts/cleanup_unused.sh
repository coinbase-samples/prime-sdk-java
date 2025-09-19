#!/bin/bash
"""
Unused Class Cleanup Script for Coinbase Prime SDK

Detects and optionally removes unused Java classes from the codebase
while maintaining safety through backup and manual review processes.
"""

set -e

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Configuration
BACKUP_DIR="backup/$(date +%Y%m%d_%H%M%S)"
SRC_DIR="src/main/java"
TEMP_DIR="/tmp/cleanup_$$"

echo -e "${BLUE}🧹 Coinbase Prime SDK Unused Class Cleanup${NC}"
echo "=========================================="

# Create temporary directory
mkdir -p "$TEMP_DIR"

# Function to cleanup on exit
cleanup() {
    rm -rf "$TEMP_DIR"
}
trap cleanup EXIT

echo -e "${YELLOW}📋 Step 1: Analyzing codebase...${NC}"

# Find all Java classes
echo "Finding all Java classes..."
find "$SRC_DIR" -name "*.java" -exec basename {} .java \; | sort | uniq > "$TEMP_DIR/all_classes.txt"
TOTAL_CLASSES=$(wc -l < "$TEMP_DIR/all_classes.txt")
echo "Found $TOTAL_CLASSES total classes"

# Find imported classes
echo "Finding imported classes..."
grep -r "import com.coinbase.prime\." "$SRC_DIR" 2>/dev/null | \
    sed 's/.*prime\.//' | \
    sed 's/;.*//' | \
    sed 's/\..*//' | \
    sort | uniq > "$TEMP_DIR/imported_classes.txt"

# Find classes referenced in type parameters, annotations, etc.
echo "Finding referenced classes..."
grep -r -E "(new|extends|implements|<|>|\s)" "$SRC_DIR" 2>/dev/null | \
    grep -E "[A-Z][a-zA-Z0-9]*" | \
    sed 's/.*[^a-zA-Z0-9]\([A-Z][a-zA-Z0-9]*\).*/\1/' | \
    grep -v "^[A-Z][A-Z_]*$" | \
    sort | uniq > "$TEMP_DIR/referenced_classes.txt"

# Find classes used in service factory
echo "Finding factory-registered classes..."
if [ -f "$SRC_DIR/com/coinbase/prime/factory/PrimeServiceFactory.java" ]; then
    grep -E "(create|return new)" "$SRC_DIR/com/coinbase/prime/factory/PrimeServiceFactory.java" | \
        grep -oE "[A-Z][a-zA-Z0-9]*" | \
        sort | uniq > "$TEMP_DIR/factory_classes.txt"
else
    touch "$TEMP_DIR/factory_classes.txt"
fi

# Combine all used classes
cat "$TEMP_DIR/imported_classes.txt" \
    "$TEMP_DIR/referenced_classes.txt" \
    "$TEMP_DIR/factory_classes.txt" | \
    sort | uniq > "$TEMP_DIR/used_classes.txt"

USED_CLASSES=$(wc -l < "$TEMP_DIR/used_classes.txt")
echo "Found $USED_CLASSES classes in use"

echo -e "${YELLOW}📊 Step 2: Identifying potentially unused classes...${NC}"

# Find potentially unused classes
comm -23 "$TEMP_DIR/all_classes.txt" "$TEMP_DIR/used_classes.txt" > "$TEMP_DIR/potentially_unused.txt"
UNUSED_COUNT=$(wc -l < "$TEMP_DIR/potentially_unused.txt")

if [ "$UNUSED_COUNT" -eq 0 ]; then
    echo -e "${GREEN}✅ No unused classes detected!${NC}"
    echo "All $TOTAL_CLASSES classes appear to be in use."
    exit 0
fi

echo -e "${RED}⚠️  Found $UNUSED_COUNT potentially unused classes:${NC}"
echo ""

# Categorize unused classes for better analysis
echo "Analyzing unused classes by category:"
echo ""

# Request classes
grep "Request$" "$TEMP_DIR/potentially_unused.txt" > "$TEMP_DIR/unused_requests.txt" || true
UNUSED_REQUESTS=$(wc -l < "$TEMP_DIR/unused_requests.txt")
if [ "$UNUSED_REQUESTS" -gt 0 ]; then
    echo -e "${YELLOW}📝 Request Classes ($UNUSED_REQUESTS):${NC}"
    head -5 "$TEMP_DIR/unused_requests.txt" | sed 's/^/  /'
    [ "$UNUSED_REQUESTS" -gt 5 ] && echo "  ... and $(($UNUSED_REQUESTS - 5)) more"
    echo ""
fi

# Response classes
grep "Response$" "$TEMP_DIR/potentially_unused.txt" > "$TEMP_DIR/unused_responses.txt" || true
UNUSED_RESPONSES=$(wc -l < "$TEMP_DIR/unused_responses.txt")
if [ "$UNUSED_RESPONSES" -gt 0 ]; then
    echo -e "${YELLOW}📤 Response Classes ($UNUSED_RESPONSES):${NC}"
    head -5 "$TEMP_DIR/unused_responses.txt" | sed 's/^/  /'
    [ "$UNUSED_RESPONSES" -gt 5 ] && echo "  ... and $(($UNUSED_RESPONSES - 5)) more"
    echo ""
fi

# Model classes
grep -v -E "(Request|Response|Service|Impl)$" "$TEMP_DIR/potentially_unused.txt" > "$TEMP_DIR/unused_models.txt" || true
UNUSED_MODELS=$(wc -l < "$TEMP_DIR/unused_models.txt")
if [ "$UNUSED_MODELS" -gt 0 ]; then
    echo -e "${YELLOW}🏗️  Model Classes ($UNUSED_MODELS):${NC}"
    head -5 "$TEMP_DIR/unused_models.txt" | sed 's/^/  /'
    [ "$UNUSED_MODELS" -gt 5 ] && echo "  ... and $(($UNUSED_MODELS - 5)) more"
    echo ""
fi

# Service classes
grep -E "(Service|Impl)$" "$TEMP_DIR/potentially_unused.txt" > "$TEMP_DIR/unused_services.txt" || true
UNUSED_SERVICES=$(wc -l < "$TEMP_DIR/unused_services.txt")
if [ "$UNUSED_SERVICES" -gt 0 ]; then
    echo -e "${RED}⚠️  Service Classes ($UNUSED_SERVICES):${NC}"
    head -5 "$TEMP_DIR/unused_services.txt" | sed 's/^/  /'
    [ "$UNUSED_SERVICES" -gt 5 ] && echo "  ... and $(($UNUSED_SERVICES - 5)) more"
    echo ""
fi

echo -e "${YELLOW}📋 Step 3: Safety Analysis${NC}"

# Check for critical classes that should never be deleted
CRITICAL_PATTERNS=("Client" "Factory" "Exception" "Error" "Credentials")
echo "Checking for critical classes in unused list..."

CRITICAL_FOUND=false
for pattern in "${CRITICAL_PATTERNS[@]}"; do
    if grep -q "$pattern" "$TEMP_DIR/potentially_unused.txt"; then
        echo -e "${RED}🚨 WARNING: Critical class pattern '$pattern' found in unused list!${NC}"
        grep "$pattern" "$TEMP_DIR/potentially_unused.txt" | sed 's/^/  /'
        CRITICAL_FOUND=true
    fi
done

if [ "$CRITICAL_FOUND" = true ]; then
    echo -e "${RED}⛔ Aborting cleanup due to critical classes in unused list.${NC}"
    echo "Manual review required before proceeding."
    exit 1
fi

echo -e "${YELLOW}🤔 Step 4: User Decision${NC}"
echo ""
echo "Would you like to:"
echo "1) View detailed analysis (recommended)"
echo "2) Create backup and generate removal script"
echo "3) Exit without changes"
echo ""
read -p "Enter your choice (1-3): " choice

case $choice in
    1)
        echo -e "${BLUE}📊 Detailed Analysis${NC}"
        echo "==================="
        echo ""
        echo "Complete list of potentially unused classes:"
        cat "$TEMP_DIR/potentially_unused.txt"
        echo ""
        echo "Total: $UNUSED_COUNT classes"
        
        echo ""
        read -p "Continue with backup and script generation? (y/N): " continue_choice
        if [[ ! "$continue_choice" =~ ^[Yy]$ ]]; then
            echo "Exiting without changes."
            exit 0
        fi
        ;&  # Fall through to option 2
    2)
        echo -e "${YELLOW}💾 Step 5: Creating backup...${NC}"
        mkdir -p "$BACKUP_DIR"
        
        # Create backup of potentially unused files
        while IFS= read -r class_name; do
            find "$SRC_DIR" -name "${class_name}.java" -exec cp {} "$BACKUP_DIR/" \;
        done < "$TEMP_DIR/potentially_unused.txt"
        
        BACKED_UP=$(find "$BACKUP_DIR" -name "*.java" | wc -l)
        echo "Backed up $BACKED_UP files to $BACKUP_DIR"
        
        # Generate removal script
        REMOVAL_SCRIPT="$BACKUP_DIR/remove_unused_classes.sh"
        cat > "$REMOVAL_SCRIPT" << 'EOF'
#!/bin/bash
# Generated removal script for unused classes
# Review carefully before execution!

set -e

echo "🗑️  Removing unused classes..."
echo "This action cannot be undone except by restoring from backup."
echo ""
read -p "Are you sure you want to proceed? (yes/NO): " confirm

if [ "$confirm" != "yes" ]; then
    echo "Operation cancelled."
    exit 0
fi

EOF
        
        # Add removal commands
        while IFS= read -r class_name; do
            echo "find src/main/java -name '${class_name}.java' -delete" >> "$REMOVAL_SCRIPT"
        done < "$TEMP_DIR/potentially_unused.txt"
        
        cat >> "$REMOVAL_SCRIPT" << 'EOF'

echo "✅ Unused classes removed."
echo "Run 'mvn clean compile' to verify no compilation errors."
echo "If issues occur, restore from backup in this directory."
EOF
        
        chmod +x "$REMOVAL_SCRIPT"
        
        echo ""
        echo -e "${GREEN}✅ Backup and removal script created${NC}"
        echo "📁 Backup location: $BACKUP_DIR"
        echo "🗑️  Removal script: $REMOVAL_SCRIPT"
        echo ""
        echo -e "${YELLOW}⚠️  IMPORTANT NEXT STEPS:${NC}"
        echo "1. Review the backed up files manually"
        echo "2. Verify classes are truly unused (not just missing imports)"
        echo "3. Run the removal script if you're confident"
        echo "4. Test compilation: mvn clean compile"
        echo "5. Run tests: mvn test"
        ;;
    3)
        echo "Exiting without changes."
        exit 0
        ;;
    *)
        echo "Invalid choice. Exiting."
        exit 1
        ;;
esac

echo ""
echo -e "${GREEN}🎉 Cleanup analysis complete!${NC}"
echo ""
echo "Summary:"
echo "- Total classes: $TOTAL_CLASSES"
echo "- Classes in use: $USED_CLASSES"
echo "- Potentially unused: $UNUSED_COUNT"
echo "- Backup created: $BACKUP_DIR"
echo ""
echo "Remember to test thoroughly after any deletions!"