#!/bin/bash
# Script to add CAP_TRAINING source files to GitHub repository
# Usage: bash add_to_git.sh <path-to-Training-repo>

if [ -z "$1" ]; then
    echo "Usage: bash add_to_git.sh <path-to-Training-repo>"
    echo "Example: bash add_to_git.sh /c/Users/Arya/OneDrive/Documents/Training"
    exit 1
fi

TRAINING_REPO="$1"
CAP_SOURCE="C:\Users\Arya\OneDrive\Documents\CAP_TRAINING"

# Check if Training repo exists
if [ ! -d "$TRAINING_REPO" ]; then
    echo "Error: Training repo not found at $TRAINING_REPO"
    exit 1
fi

echo "=== Adding CAP_TRAINING Source Files to GitHub ==="
echo "Source: $CAP_SOURCE"
echo "Destination: $TRAINING_REPO"
echo ""

# Navigate to Training repo
cd "$TRAINING_REPO"

# Check if it's a git repository
if [ ! -d ".git" ]; then
    echo "Error: $TRAINING_REPO is not a git repository"
    echo "Please initialize git first: git init"
    exit 1
fi

# Create module directories
echo "Creating module directories..."
mkdir -p Basics_of_Java Collections DSA Practice Spring

# Copy src directories (using powershell for Windows paths)
echo "Copying source files..."
powershell -Command "
\$source = 'C:\Users\Arya\OneDrive\Documents\CAP_TRAINING'
\$dest = '$TRAINING_REPO'

Copy-Item \"\$source\Basics_of_Java\src\" \"\$dest\Basics_of_Java\src\" -Recurse -Force
Copy-Item \"\$source\Collections\src\" \"\$dest\Collections\src\" -Recurse -Force
Copy-Item \"\$source\DSA\src\" \"\$dest\DSA\src\" -Recurse -Force
Copy-Item \"\$source\Parctice\src\" \"\$dest\Practice\src\" -Recurse -Force
Copy-Item \"\$source\Spring\src\" \"\$dest\Spring\src\" -Recurse -Force

Write-Host 'Files copied successfully!'
"

# Git operations
echo ""
echo "Staging files in git..."
git add Basics_of_Java/src Collections/src DSA/src Practice/src Spring/src

echo ""
echo "Checking git status..."
git status

echo ""
echo "=== Ready to commit! ==="
echo "Run the following command to commit:"
echo "git commit -m 'Add source files from CAP_TRAINING modules'"
echo ""
echo "Then push to GitHub:"
echo "git push origin main"


