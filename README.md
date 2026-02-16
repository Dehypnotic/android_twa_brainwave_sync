# Brainwave Sync (TWA)

This wraps the PWA at `https://dehypnotic.github.io/pwa-brainwave-sync/` in a Trusted Web Activity.

## Configuration

- **Package Name**: `com.dehypnotic.brainwavesync`
- **URL**: `https://dehypnotic.github.io/pwa-brainwave-sync/`
- **Asset Links**: Must be served at `https://dehypnotic.github.io/.well-known/assetlinks.json`

## Assets

- Launcher icons have been generated in `app/src/main/res/mipmap-*` using the 192px PWA icon.

## Release Build

The `release` build type is configured in `app/build.gradle`. It expects:
1. A keystore file named `release-key.jks` in the `app` directory.
2. Environment variables: `KEYSTORE_PASSWORD`, `KEY_ALIAS`, `KEY_PASSWORD`.

To build a release APK:
```powershell
./gradlew.bat assembleRelease
```

## Digital Asset Links (Required for Play Store)

1. Generate your release signing key.
2. Run `keytool -list -v -keystore your-key.jks` to get the SHA-256 fingerprint.
3. Update `pwa-brainwave-sync/.well-known/assetlinks.json` with this fingerprint.
4. Push that file to your GitHub Pages repository.
5. Verify it at `https://digitalassetlinks.googleapis.com/v1/assetlinks:check?sourceApiRoot=https://dehypnotic.github.io&sourceWeb.site=https://dehypnotic.github.io&targetAndroidApp.packageName=com.dehypnotic.brainwavesync&relation=delegate_permission/common.handle_all_urls`
