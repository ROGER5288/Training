# PowerShell script to add CAP_TRAINING source files to GitHub repository
# Usage: .\add_to_git.ps1 -TrainingRepoPath "C:\path\to\Training"

param(
    [Parameter(Mandatory=$true)]
    [string]$TrainingRepoPath
)

$CAP_SOURCE = "C:\Users\Arya\OneDrive\Documents\CAP_TRAINING"

Write-Host "=== Adding CAP_TRAINING Source Files to GitHub ===" -ForegroundColor Green
Write-Host "Source: $CAP_SOURCE"
Write-Host "Destination: $TrainingRepoPath"
Write-Host ""

# Check if Training repo exists
if (-not (Test-Path $TrainingRepoPath)) {
    Write-Host "Error: Training repo not found at $TrainingRepoPath" -ForegroundColor Red
    exit 1
}

# Check if it's a git repository
if (-not (Test-Path "$TrainingRepoPath\.git")) {
    Write-Host "Error: $TrainingRepoPath is not a git repository" -ForegroundColor Red
    Write-Host "Please initialize git first: git init"
    exit 1
}

# Create module directories
Write-Host "Creating module directories..." -ForegroundColor Yellow
@("Basics_of_Java", "Collections", "DSA", "Practice", "Spring") | ForEach-Object {
    $dir = Join-Path $TrainingRepoPath $_
    if (-not (Test-Path $dir)) {
        New-Item -ItemType Directory -Path $dir -Force | Out-Null
    }
}

# Copy src directories
Write-Host "Copying source files..." -ForegroundColor Yellow

$modules = @(
    @{ src = "Basics_of_Java"; dest = "Basics_of_Java" },
    @{ src = "Collections"; dest = "Collections" },
    @{ src = "DSA"; dest = "DSA" },
    @{ src = "Parctice"; dest = "Practice" },
    @{ src = "Spring"; dest = "Spring" }
)

foreach ($module in $modules) {
    $sourcePath = Join-Path $CAP_SOURCE $module.src "src"
    $destPath = Join-Path $TrainingRepoPath $module.dest "src"

    if (Test-Path $sourcePath) {
        Write-Host "  Copying $($module.src)/src..." -ForegroundColor Cyan
        Copy-Item -Path $sourcePath -Destination $destPath -Recurse -Force
    } else {
        Write-Host "  Warning: Source not found: $sourcePath" -ForegroundColor Yellow
    }
}

Write-Host ""
Write-Host "Files copied successfully!" -ForegroundColor Green

# Git operations
Write-Host ""
Write-Host "Staging files in git..." -ForegroundColor Yellow
Set-Location $TrainingRepoPath

git add "Basics_of_Java/src" "Collections/src" "DSA/src" "Practice/src" "Spring/src" 2>&1

Write-Host ""
Write-Host "Checking git status:" -ForegroundColor Yellow
git status

Write-Host ""
Write-Host "=== Ready to commit! ===" -ForegroundColor Green
Write-Host "Run the following commands in PowerShell:"
Write-Host ""
Write-Host 'git commit -m "Add source files from CAP_TRAINING modules' -ForegroundColor Cyan
Write-Host ''
Write-Host '- Added Basics_of_Java/src with fundamental Java concepts'
Write-Host '- Added Collections/src with collections framework examples'
Write-Host '- Added DSA/src with data structures and algorithms'
Write-Host '- Added Practice/src with practice problems'
Write-Host '- Added Spring/src with Spring framework examples"' -ForegroundColor Cyan
Write-Host ""
Write-Host "git push origin main" -ForegroundColor Cyan


