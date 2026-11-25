# Moon Client (Fabric)

A client-side Fabric mod project for Minecraft 1.21.11.

## Included starter features
- Moon Client configuration screen (Right Shift)
- HUD toggle/settings scaffolding
- Custom skin URL setting scaffolding (local preview/override hook; not a Mojang account skin upload)
- HUD/module framework starter
- GitHub Actions build workflow

This is a starter foundation, not a complete Feather-equivalent client yet. Feature modules must be implemented and tested against the target Minecraft/Fabric version.

## Build
Use Java 21 and run:
- Windows: `gradlew.bat build`
- Linux/macOS: `./gradlew build`

Built jar: `build/libs/`
