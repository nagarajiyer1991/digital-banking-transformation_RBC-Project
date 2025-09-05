# RBC WealthPath Android App

A mobile-friendly Android version of the RBC WealthPath banking application, featuring the same color scheme, functionality, and design as the web version.

## Features

### 🎯 Core Functionality
- **Dashboard**: Financial health score, account balances, recent activity, and quick actions
- **Goals & Savings**: Track savings goals, create new goals, daily challenges, and progress monitoring
- **Spending Insights**: (To be implemented)
- **Financial Education**: (To be implemented) 
- **Recommendations**: (To be implemented)
- **Floating Chat Assistant**: Interactive financial assistant with smart responses

### 🎨 Design & UI
- **RBC Branding**: Official RBC blue color scheme (#006AC2)
- **Professional Cards**: Material Design cards with gradients and shadows
- **Mobile-First**: Optimized for mobile viewing and interaction
- **Bottom Navigation**: Easy tab switching between main sections
- **Responsive Layout**: Adapts to different screen sizes

### 💬 Chat Assistant
- **Floating Action Button**: Always accessible chat assistant
- **Smart Responses**: Contextual replies based on user queries
- **Financial Guidance**: Help with balances, budgets, goals, and investments
- **Bottom Sheet Dialog**: Clean, modern chat interface

## Technical Stack

- **Language**: Kotlin
- **UI Framework**: Android Views with Material Design 3
- **Architecture**: MVVM with Navigation Component
- **Charts**: MPAndroidChart for data visualization
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 34 (Android 14)

## Project Structure

```
android-app/
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── java/com/rbc/wealthpath/
│       │   ├── MainActivity.kt
│       │   ├── ChatDialogFragment.kt
│       │   └── ui/
│       │       ├── dashboard/DashboardFragment.kt
│       │       └── goals/GoalsFragment.kt
│       ├── res/
│       │   ├── layout/
│       │   │   ├── activity_main.xml
│       │   │   ├── fragment_dashboard.xml
│       │   │   ├── fragment_goals.xml
│       │   │   └── dialog_chat.xml
│       │   ├── values/
│       │   │   ├── colors.xml
│       │   │   ├── themes.xml
│       │   │   └── strings.xml
│       │   ├── drawable/
│       │   │   ├── gradient_rbc_blue.xml
│       │   │   ├── message_bubbles.xml
│       │   │   └── circles.xml
│       │   └── navigation/
│       │       └── mobile_navigation.xml
│       └── AndroidManifest.xml
```

## Key Features Implemented

### Dashboard Fragment
- Welcome card with financial health score (8.2/10)
- Quick stats grid (Total Balance: $25,430.50, Monthly Savings: $3,210)
- Recent activity feed with transaction history
- Quick action buttons (Add Goal, Transfer)

### Goals & Savings Fragment
- Professional header with stats (3 Active Goals, $22,200 Total Saved, 76% Avg Progress)
- Create new goal form with Material Design inputs
- Goal progress cards (Emergency Fund 90%, Vacation Fund 52%, Down Payment 85%)
- Daily challenge system with point rewards

### Chat System
- Floating Action Button for easy access
- Bottom sheet dialog with RBC branding
- Smart response system recognizing keywords:
  - "balance" → Account balance information
  - "budget" → Spending and budget insights  
  - "goals" → Savings goals progress
  - "investment" → Investment recommendations
- Message bubbles with proper styling and animations

### Design System
- RBC Blue (#006AC2) primary color scheme
- Material Design 3 components
- Professional gradients and shadows
- Consistent typography and spacing
- Mobile-optimized touch targets

## Installation & Setup

1. Open in Android Studio
2. Sync project with Gradle files
3. Run on device or emulator (minimum API 24)

## Color Scheme

- **Primary**: RBC Blue (#006AC2)
- **Primary Dark**: RBC Blue Dark (#00559C)  
- **Secondary**: Success Green (#28a745)
- **Background**: Light Gray (#f5f7fa)
- **Cards**: White (#ffffff)
- **Text Primary**: Dark Blue (#1c5aa0)
- **Text Secondary**: Gray (#666666)

## Future Enhancements

- [ ] Implement Spending Insights fragment
- [ ] Add Financial Education content
- [ ] Create Recommendations system
- [ ] Add data persistence with Room database
- [ ] Implement proper API integration
- [ ] Add biometric authentication
- [ ] Push notifications for goals and challenges
- [ ] Dark theme support
- [ ] Accessibility improvements

---

**Built with ❤️ for RBC customers**