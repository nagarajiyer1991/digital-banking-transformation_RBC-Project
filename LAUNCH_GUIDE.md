# 🚀 RBC WealthPath Launch Guide

## Web Application (Live Now!)

### 🌐 Web App URLs
- **Main App**: https://nagarajiyer1991.github.io/digital-banking-transformation_RBC-Project/resources/mockups/rbc-wealthpath-final2.html
- **Test Chatbox**: https://nagarajiyer1991.github.io/digital-banking-transformation_RBC-Project/test-chatbox.html

### ✅ Web Features Ready
- Professional Goals & Savings section with refined styling
- Dashboard with financial health score (8.2/10)
- All 5 tabs: Dashboard, Goals & Savings, Spending Insights, Financial Education, Recommendations
- Floating chatbox with RBC Financial Assistant
- Mobile responsive design
- RBC blue branding throughout

---

## 📱 Android Application 

### 🛠️ How to Launch Android App

#### Option 1: Android Studio (Recommended)
1. **Install Android Studio**: Download from [developer.android.com](https://developer.android.com/studio)
2. **Clone the repository**:
   ```bash
   git clone https://github.com/nagarajiyer1991/digital-banking-transformation_RBC-Project.git
   cd digital-banking-transformation_RBC-Project/android-app
   ```
3. **Open in Android Studio**:
   - Open Android Studio
   - Click "Open an Existing Project"
   - Select the `android-app` folder
   - Wait for Gradle sync to complete
4. **Run the app**:
   - Connect an Android device (API 24+) or start an emulator
   - Click the green "Run" button
   - App will install and launch automatically

#### Option 2: Command Line Build
```bash
# Navigate to android-app directory
cd android-app

# Build debug APK
./gradlew assembleDebug

# Install on connected device
./gradlew installDebug
```

#### Option 3: Generate Release APK
```bash
# Build release APK (for distribution)
./gradlew assembleRelease

# APK will be generated at:
# app/build/outputs/apk/release/app-release-unsigned.apk
```

### 📋 Android App Requirements
- **Minimum Android Version**: 7.0 (API 24)
- **Target Android Version**: 14 (API 34)
- **Permissions**: None required
- **Size**: ~15MB

### ✨ Android Features
- **Bottom Navigation**: 5 main sections with smooth transitions
- **Dashboard**: Financial health score, balance cards, recent activity
- **Goals & Savings**: Professional header, goal creation, progress tracking
- **Floating Chat**: RBC Financial Assistant with smart responses
- **Material Design**: Professional cards, gradients, RBC branding
- **Mobile Optimized**: Touch-friendly interface, responsive layouts

---

## 🎯 Demo Instructions

### Web App Demo:
1. Visit the live URL
2. Navigate through all 5 tabs
3. Click the floating chat button (bottom-right)
4. Try asking about "balance", "budget", "goals", or "investment"
5. Test on mobile by resizing browser window

### Android App Demo:
1. Launch app in Android Studio or on device
2. Tap through bottom navigation tabs
3. Try creating a new goal in Goals & Savings
4. Tap floating chat button for financial assistant
5. Test daily challenge completion

---

## 🚀 Deployment Options

### Web App (Already Live ✅)
- **Current**: GitHub Pages hosting
- **URL**: https://nagarajiyer1991.github.io/digital-banking-transformation_RBC-Project/
- **Status**: Ready for production use

### Android App Options

#### 1. Internal Testing
- Build APK and share directly with team
- Use Android Studio for development testing
- Firebase App Distribution for team distribution

#### 2. Google Play Store (Future)
- Create Google Play Console account
- Generate signed release APK
- Upload to Play Store for review
- Requires app signing, privacy policy, and store assets

#### 3. Enterprise Distribution
- RBC internal app store
- MDM (Mobile Device Management) deployment
- Direct APK distribution to company devices

---

## 📊 Technical Specifications

### Web Application
- **Framework**: Vanilla HTML5, CSS3, JavaScript
- **Charts**: Chart.js for data visualization
- **Styling**: CSS Grid, Flexbox, CSS Gradients
- **Responsive**: Mobile-first design
- **Browser Support**: Chrome, Firefox, Safari, Edge

### Android Application
- **Language**: Kotlin
- **Framework**: Android Views with Material Design 3
- **Architecture**: MVVM with Navigation Component
- **Charts**: MPAndroidChart
- **Min SDK**: API 24 (Android 7.0)
- **Target SDK**: API 34 (Android 14)

### Color Scheme (Both Platforms)
- **Primary**: RBC Blue (#006AC2)
- **Secondary**: Success Green (#28a745)
- **Background**: Light Gray (#f5f7fa)
- **Cards**: White with subtle gradients

---

## ⚡ Quick Launch Commands

### Start Web Demo:
```bash
# Open in browser
open https://nagarajiyer1991.github.io/digital-banking-transformation_RBC-Project/resources/mockups/rbc-wealthpath-final2.html
```

### Build Android App:
```bash
# Navigate to project
cd android-app

# Build and install
./gradlew assembleDebug installDebug

# Or open in Android Studio
studio android-app/
```

---

**🎉 Both web and Android versions are ready for launch with identical functionality and RBC branding!**