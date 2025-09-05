#!/bin/bash

echo "🚀 Starting RBC WealthPath servers..."

# Start main server on port 8080
echo "📱 Main app will be available on port 8080"
python3 -m http.server 8080 &

# Start backup server on port 8000  
echo "💻 Backup server on port 8000"
python3 -m http.server 8000 &

echo "✅ Servers started!"
echo "🌐 Access your app at:"
echo "   - Main: https://[codespace-url]-8080.app.github.dev"
echo "   - Mobile: https://[codespace-url]-8080.app.github.dev/mobile.html"

wait