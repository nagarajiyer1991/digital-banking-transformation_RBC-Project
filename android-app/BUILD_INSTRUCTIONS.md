# 🔨 RBC WealthPath Android - Build Instructions

## Quick APK Build (Easiest Method)

### Option 1: Use Android Studio (Recommended)
1. **Download Android Studio**: https://developer.android.com/studio
2. **Open Project**:
   ```bash
   git clone https://github.com/nagarajiyer1991/digital-banking-transformation_RBC-Project.git
   cd digital-banking-transformation_RBC-Project/android-app
   ```
3. **Open `android-app` folder in Android Studio**
4. **Build APK**: 
   - Go to `Build` → `Build Bundle(s) / APK(s)` → `Build APK(s)`
   - APK will be generated in `app/build/outputs/apk/debug/`

### Option 2: Command Line Build
```bash
# Clone repository
git clone https://github.com/nagarajiyer1991/digital-banking-transformation_RBC-Project.git
cd digital-banking-transformation_RBC-Project/android-app

# Make gradlew executable
chmod +x gradlew

# Build debug APK
./gradlew assembleDebug

# APK location: app/build/outputs/apk/debug/app-debug.apk
```

### Option 3: GitHub Actions (Automated)
I can set up GitHub Actions to automatically build the APK on every commit.

## Install APK on Android Device

### Method 1: Direct Install
1. **Download APK** to your Android phone
2. **Enable Unknown Sources**:
   - Settings → Security → Unknown Sources (Enable)
   - OR Settings → Apps → Special Access → Install Unknown Apps
3. **Install**: Tap the APK file and follow prompts

### Method 2: ADB Install
```bash
# Connect phone via USB with USB Debugging enabled
adb install app-debug.apk
```

## APK Details
- **App Name**: RBC WealthPath
- **Package**: com.rbc.wealthpath
- **Version**: 1.0
- **Min Android**: 7.0 (API 24)
- **Target Android**: 14 (API 34)
- **Size**: ~15MB
- **Permissions**: None required

## Build Requirements
- **Java**: JDK 17 or higher
- **Android SDK**: API 34
- **Gradle**: 8.1.0+
- **Kotlin**: 1.9.0

## Troubleshooting

### Build Fails?
```bash
# Clean and rebuild
./gradlew clean
./gradlew assembleDebug
```

### Missing Android SDK?
- Install Android Studio (includes SDK)
- OR install SDK Tools separately
- Set ANDROID_HOME environment variable

### Permission Errors?
```bash
chmod +x gradlew
```

## Ready-to-Use APK
**I can create a pre-built APK for you if you prefer not to build yourself.**

The app includes:
✅ Dashboard with financial health score  
✅ Goals & Savings with professional styling  
✅ Floating chat assistant  
✅ Bottom navigation  
✅ RBC branding  
✅ Mobile-optimized UI  

**Want me to build it for you using GitHub Actions?**