[CmdletBinding()]
param(
    [string]$GeneratedRoot = "part2/tool1-mps/languages/Ref.sandbox/source_gen",
    [string]$BlueprintRoot = "part2/tool1-mps/mps-generator-blueprint",
    [string[]]$ReferenceBackends = @("part2/ai-generated-backends-prototypes/amazon-backend", "part2/ai-generated-backends-prototypes/reddit-backend", "part2/ai-generated-backends-prototypes/youtube-backend"),
    [string]$EndpointsFile = "part2/ENDPOINTS.md",
    [string[]]$ExpectedRelationEntities = @("Product", "Order", "OrderItem", "CommentReview"),
    [switch]$RunMavenTest,
    [switch]$SkipAuthorizeHttpRequestsCheck,
    [switch]$SkipCrudUpdateEndpointsCheck,
    [switch]$FailOnIssues
)

$ErrorActionPreference = "Stop"

$RepoRoot = (Resolve-Path -LiteralPath (Join-Path $PSScriptRoot "..\..")).Path

function Resolve-RepoPath {
    param([string]$Path)
    if ([System.IO.Path]::IsPathRooted($Path)) {
        return (Resolve-Path -LiteralPath $Path -ErrorAction Stop).Path
    }
    return (Resolve-Path -LiteralPath (Join-Path $RepoRoot $Path) -ErrorAction Stop).Path
}

function Resolve-OptionalRepoPath {
    param([string]$Path)
    try {
        return Resolve-RepoPath $Path
    } catch {
        return $null
    }
}

function Get-RelativePath {
    param([string]$Path)
    if ([string]::IsNullOrWhiteSpace($Path)) {
        return "<missing>"
    }
    $fullPath = $Path
    try {
        $fullPath = (Resolve-Path -LiteralPath $Path -ErrorAction Stop).Path
    } catch {
    }
    if ($fullPath.StartsWith($RepoRoot, [System.StringComparison]::OrdinalIgnoreCase)) {
        return $fullPath.Substring($RepoRoot.Length + 1)
    }
    return $fullPath
}

function Read-Text {
    param([string]$Path)
    if (-not (Test-Path -LiteralPath $Path)) {
        return ""
    }
    return Get-Content -LiteralPath $Path -Raw
}

$script:Checks = New-Object System.Collections.Generic.List[object]

function Add-Check {
    param(
        [string]$Status,
        [string]$Area,
        [string]$Name,
        [string]$Evidence,
        [string]$Fix = ""
    )
    $script:Checks.Add([pscustomobject]@{
        Status = $Status
        Area = $Area
        Name = $Name
        Evidence = $Evidence
        Fix = $Fix
    })
}

function Test-Contains {
    param([string]$Path, [string]$Pattern)
    $text = Read-Text $Path
    return $text -match $Pattern
}

$generatedPath = Resolve-OptionalRepoPath $GeneratedRoot
$blueprintPath = Resolve-OptionalRepoPath $BlueprintRoot
$endpointsPath = Resolve-OptionalRepoPath $EndpointsFile

if ($null -eq $generatedPath) {
    Add-Check "FAIL" "Input" "Generated root exists" $GeneratedRoot "Generate the backend or pass -GeneratedRoot."
} else {
    Add-Check "PASS" "Input" "Generated root exists" (Get-RelativePath $generatedPath)
}

if ($null -eq $blueprintPath) {
    Add-Check "FAIL" "Input" "Blueprint root exists" $BlueprintRoot "Pass -BlueprintRoot with the MPS generator blueprint path."
} else {
    Add-Check "PASS" "Input" "Blueprint root exists" (Get-RelativePath $blueprintPath)
}

if ($null -ne $blueprintPath) {
    $domainMapping = Join-Path $blueprintPath "domain-field-mapping-v3.md"
    $templatesMd = Join-Path $blueprintPath "templates.md"

    if (Test-Contains $domainMapping "ResourceRelation.*JPA association") {
        Add-Check "PASS" "Blueprint" "ResourceRelation JPA mapping planned" (Get-RelativePath $domainMapping)
    } else {
        Add-Check "FAIL" "Blueprint" "ResourceRelation JPA mapping planned" (Get-RelativePath $domainMapping) "Add the ResourceRelation to JPA association mapping to the blueprint."
    }

    if (Test-Contains $templatesMd "seeds one startup user.*AuthorizationRule.*ModerationPolicy") {
        Add-Check "PASS" "Blueprint" "Policy seed planned" (Get-RelativePath $templatesMd)
    } else {
        Add-Check "WARN" "Blueprint" "Policy seed planned" (Get-RelativePath $templatesMd) "Clarify which policy entities must be seeded at startup."
    }
}

if ($null -ne $generatedPath) {
    $sourceRootCandidate = Join-Path $generatedPath "src\main\java"
    $javaSourcePath = if (Test-Path -LiteralPath (Join-Path $sourceRootCandidate "pt")) { $sourceRootCandidate } else { $generatedPath }
    $projectPath = if (Test-Path -LiteralPath (Join-Path $generatedPath "pom.xml")) {
        $generatedPath
    } elseif ($generatedPath.EndsWith("src\main\java", [System.StringComparison]::OrdinalIgnoreCase)) {
        (Resolve-Path -LiteralPath (Join-Path $generatedPath "..\..\..")).Path
    } else {
        $generatedPath
    }

    $pomPath = Join-Path $projectPath "pom.xml"
    $javaRoot = Join-Path $javaSourcePath "pt"
    $resourcesPath = Join-Path $projectPath "src\main\resources\application.properties"
    $baseJava = Join-Path $javaSourcePath "pt\isep\enorm\ref"

    if (Test-Path -LiteralPath $pomPath) {
        Add-Check "PASS" "Build" "Maven pom exists" (Get-RelativePath $pomPath)
    } else {
        Add-Check "FAIL" "Build" "Maven pom exists" (Get-RelativePath $pomPath) "Generate pom.xml at the generated backend root."
    }

    if (Test-Path -LiteralPath $javaRoot) {
        Add-Check "PASS" "Layout" "Generated Java root exists" (Get-RelativePath $javaRoot)
    } else {
        Add-Check "FAIL" "Layout" "Generated Java root exists" (Get-RelativePath $javaRoot) "Generate Java sources under the configured source root."
    }

    if (Test-Path -LiteralPath $resourcesPath) {
        Add-Check "PASS" "Layout" "Application properties exists" (Get-RelativePath $resourcesPath)
    } else {
        Add-Check "FAIL" "Layout" "Application properties exists" (Get-RelativePath $resourcesPath) "Generate application.properties and include it as a Maven resource."
    }

    foreach ($layer in @("domain\generated", "repository\generated", "service\generated", "web\generated", "security", "config")) {
        $layerPath = Join-Path $baseJava $layer
        if (Test-Path -LiteralPath $layerPath) {
            Add-Check "PASS" "Layout" "Layer exists: $layer" (Get-RelativePath $layerPath)
        } else {
            Add-Check "FAIL" "Layout" "Layer exists: $layer" (Get-RelativePath $layerPath) "Generate the missing layer to match the blueprint layout."
        }
    }

    $authController = Join-Path $baseJava "web\AuthenticationController.java"
    if ((Test-Path -LiteralPath $authController) -and (Test-Contains $authController "@RestController")) {
        Add-Check "PASS" "Web" "Concrete authentication controller exposed" (Get-RelativePath $authController)
    } else {
        Add-Check "FAIL" "Web" "Concrete authentication controller exposed" (Get-RelativePath $authController) "Generate web/AuthenticationController.java extending GeneratedAuthenticationController with @RestController and /api/auth mapping."
    }

    $securityConfig = Join-Path $baseJava "security\SecurityConfiguration.java"
    if (-not $SkipAuthorizeHttpRequestsCheck) {
        if (Test-Contains $securityConfig "authorizeHttpRequests") {
            Add-Check "PASS" "Security" "Explicit authorization rules configured" (Get-RelativePath $securityConfig)
        } else {
            Add-Check "FAIL" "Security" "Explicit authorization rules configured" (Get-RelativePath $securityConfig) "Add authorizeHttpRequests rules for auth, H2, public reads, and role-protected mutations."
        }
    }

    $generatedWebPath = Join-Path $baseJava "web\generated"
    $badRouteMatches = @()
    if (Test-Path -LiteralPath $generatedWebPath) {
        $badRouteMatches = Get-ChildItem -LiteralPath $generatedWebPath -Filter "*.java" -Recurse |
            Select-String -Pattern 'Mapping\(value = "[^"]+/id"\)|Mapping\(value = "[^"]+id"\)' |
            Where-Object { $_.Line -notmatch "\{id\}" }
    }
    if ($badRouteMatches.Count -eq 0) {
        Add-Check "PASS" "Web" "CRUD id routes use path variables" (Get-RelativePath $generatedWebPath)
    } else {
        $sample = ($badRouteMatches | Select-Object -First 3 | ForEach-Object { "$(Get-RelativePath $_.Path):$($_.LineNumber)" }) -join ", "
        Add-Check "FAIL" "Web" "CRUD id routes use path variables" $sample "Change literal id routes to {id}, for example products/{id}."
    }

    if (-not $SkipCrudUpdateEndpointsCheck) {
        $hasPutMapping = $false
        if (Test-Path -LiteralPath $generatedWebPath) {
            $hasPutMapping = $null -ne (Get-ChildItem -LiteralPath $generatedWebPath -Filter "*.java" -Recurse | Select-String -Pattern "PutMapping" | Select-Object -First 1)
        }
        if ($hasPutMapping) {
            Add-Check "PASS" "Web" "CRUD update endpoints generated" (Get-RelativePath $generatedWebPath)
        } else {
            Add-Check "WARN" "Web" "CRUD update endpoints generated" (Get-RelativePath $generatedWebPath) "Add PutMapping update endpoints if generated CRUD is expected to match the common backend shape."
        }
    }

    $domainGeneratedPath = Join-Path $baseJava "domain\generated"
    foreach ($entity in $ExpectedRelationEntities) {
        $entityPath = Join-Path $domainGeneratedPath "Generated$entity.java"
        if (-not (Test-Path -LiteralPath $entityPath)) {
            Add-Check "WARN" "Domain" "Expected relation entity exists: $entity" (Get-RelativePath $entityPath) "Adjust -ExpectedRelationEntities for this model or generate the missing entity."
            continue
        }
        if (Test-Contains $entityPath "@(ManyToOne|OneToMany|OneToOne|ManyToMany)|@JoinColumn") {
            Add-Check "PASS" "Domain" "JPA associations generated for $entity" (Get-RelativePath $entityPath)
        } else {
            Add-Check "FAIL" "Domain" "JPA associations generated for $entity" (Get-RelativePath $entityPath) "Generate ResourceRelation fields as JPA associations for this resource."
        }
    }

    $initialData = Join-Path $baseJava "config\InitialDataConfiguration.java"
    $hasAuthSeed = Test-Contains $initialData "AuthorizationRuleRepository|seedAuthorizationRule"
    $hasModerationSeed = Test-Contains $initialData "ModerationPolicyRepository|seedModerationPolicy"
    if ($hasAuthSeed -and $hasModerationSeed) {
        Add-Check "PASS" "Seed" "Authorization and moderation policies seeded" (Get-RelativePath $initialData)
    } else {
        $missing = @()
        if (-not $hasAuthSeed) { $missing += "AuthorizationRule" }
        if (-not $hasModerationSeed) { $missing += "ModerationPolicy" }
        Add-Check "FAIL" "Seed" "Authorization and moderation policies seeded" ("Missing: " + ($missing -join ", ") + " in " + (Get-RelativePath $initialData)) "Extend InitialDataConfiguration with the policy seed methods planned by the blueprint."
    }

    foreach ($policy in @("SortingPolicy", "ValidationRule", "ModerationPolicy", "AuthorizationRule", "AutomationRule", "VerificationPolicy")) {
        $policyDomain = Join-Path $baseJava "domain\$policy.java"
        $policyRepo = Join-Path $baseJava "repository\$policy`Repository.java"
        if ((Test-Path -LiteralPath $policyDomain) -and (Test-Path -LiteralPath $policyRepo)) {
            Add-Check "PASS" "Policy" "$policy entity and repository exist" "$(Get-RelativePath $policyDomain), $(Get-RelativePath $policyRepo)"
        } else {
            Add-Check "FAIL" "Policy" "$policy entity and repository exist" "$(Get-RelativePath $policyDomain), $(Get-RelativePath $policyRepo)" "Generate the missing policy artifact."
        }
    }

    $moderationModel = Join-Path $baseJava "service\generated\GeneratedModerationModel.java"
    if (Test-Contains $moderationModel "PolicySpec") {
        Add-Check "PASS" "Moderation" "Generated moderation model materialized" (Get-RelativePath $moderationModel)
    } else {
        Add-Check "WARN" "Moderation" "Generated moderation model materialized" (Get-RelativePath $moderationModel) "Generate PolicySpec and AutomationRuleSpec values from Governance and Behavior nodes."
    }

    if ((Test-Contains $moderationModel "ON_REPORT_THRESHOLD") -and (Test-Contains $moderationModel "ON_FEEDBACK_CREATE")) {
        Add-Check "PASS" "Moderation" "Policy and automation triggers materialized" (Get-RelativePath $moderationModel)
    }

    if ($RunMavenTest -and (Test-Path -LiteralPath $pomPath)) {
        Push-Location $RepoRoot
        try {
            & mvn -q -f $pomPath test
            if ($LASTEXITCODE -eq 0) {
                Add-Check "PASS" "Build" "mvn test" "Command succeeded"
            } else {
                Add-Check "FAIL" "Build" "mvn test" "Exit code $LASTEXITCODE" "Fix compilation or test failures before claiming readiness."
            }
        } catch {
            Add-Check "FAIL" "Build" "mvn test" $_.Exception.Message "Fix Maven execution or generated code errors."
        } finally {
            Pop-Location
        }
    }
}

foreach ($backend in $ReferenceBackends) {
    $backendPath = Resolve-OptionalRepoPath $backend
    if ($null -eq $backendPath) {
        Add-Check "WARN" "Reference" "Reference backend exists: $backend" $backend "Adjust -ReferenceBackends or restore the backend."
        continue
    }
    $webPath = Join-Path $backendPath "src\main\java"
    $hasAuth = $null -ne (Get-ChildItem -LiteralPath $webPath -Filter "AuthenticationController.java" -Recurse -ErrorAction SilentlyContinue | Select-Object -First 1)
    $hasErrorHandler = $null -ne (Get-ChildItem -LiteralPath $webPath -Filter "ApiExceptionHandler.java" -Recurse -ErrorAction SilentlyContinue | Select-Object -First 1)
    $hasSecurity = $null -ne (Get-ChildItem -LiteralPath $webPath -Filter "SecurityConfiguration.java" -Recurse -ErrorAction SilentlyContinue | Select-Object -First 1)
    $missing = @()
    if (-not $hasAuth) { $missing += "AuthenticationController" }
    if (-not $hasErrorHandler) { $missing += "ApiExceptionHandler" }
    if (-not $hasSecurity) { $missing += "SecurityConfiguration" }
    if ($missing.Count -eq 0) {
        Add-Check "PASS" "Reference" "Common web/security artifacts exist in $backend" (Get-RelativePath $backendPath)
    } else {
        Add-Check "WARN" "Reference" "Common web/security artifacts exist in $backend" ("Missing: " + ($missing -join ", ")) "Use this backend only as partial parity evidence."
    }
}

if ($null -ne $endpointsPath) {
    $endpointText = Read-Text $endpointsPath
    if ($endpointText -match "/api/auth/login" -and $endpointText -match "/api/moderation") {
        Add-Check "PASS" "Reference" "Endpoint catalogue available" (Get-RelativePath $endpointsPath)
    } else {
        Add-Check "WARN" "Reference" "Endpoint catalogue available" (Get-RelativePath $endpointsPath) "Keep endpoint expectations in ENDPOINTS.md explicit."
    }
}

$failCount = ($Checks | Where-Object { $_.Status -eq "FAIL" }).Count
$warnCount = ($Checks | Where-Object { $_.Status -eq "WARN" }).Count
$passCount = ($Checks | Where-Object { $_.Status -eq "PASS" }).Count
$verdict = if ($failCount -gt 0) { "FAIL" } elseif ($warnCount -gt 0) { "WARN" } else { "PASS" }

Write-Host "# REF generated backend audit"
Write-Host ""
Write-Host "Verdict: $verdict"
Write-Host "Checks: $passCount PASS, $warnCount WARN, $failCount FAIL"
Write-Host ""

foreach ($status in @("FAIL", "WARN", "PASS")) {
    $items = $Checks | Where-Object { $_.Status -eq $status }
    if ($items.Count -eq 0) {
        continue
    }
    Write-Host "## $status"
    foreach ($item in $items) {
        Write-Host "- [$($item.Status)] $($item.Area): $($item.Name) - $($item.Evidence)"
        if (-not [string]::IsNullOrWhiteSpace($item.Fix)) {
            Write-Host "  Fix: $($item.Fix)"
        }
    }
    Write-Host ""
}

if ($FailOnIssues -and $failCount -gt 0) {
    exit 1
}

