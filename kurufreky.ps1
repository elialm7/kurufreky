param (
    [Parameter(Mandatory=$true)]
    [ValidateSet("run", "test", "build-compile", "build-test", "build-deploy")]
    [string]$stage
)
$jarfolder = Join-Path -Path $PSScriptRoot -ChildPath "kurufreky-app\target"
$jarfile = Get-ChildItem -Path $jarfolder -Filter "kurufreky-app-v*.jar" | Sort-Object LastWriteTime -Descending | Select-Object -First 1
$stages = @("run", "test", "build-compile", "build-test", "build-deploy")


function checkifjarExists{
    param(
        [string]$file
    )

    begin {
        Write-Verbose "checking jar existance..."
        if($file -eq $null){
            throw "Run build first";
        }
    }
}

switch($stage){
    "run" {
         checkifjarExists -file $jarfile
    }
    "test"{
        Write-Host "testing"
    }
    "build-compile"{
        Write-Host "building and compiling"
    }
    "build-test"{
        Write-Host "building and testing"
    }
    "build-deploy"{
        Write-Host "building and deploying"
    }
}



