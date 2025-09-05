package com.rbc.wealthpath;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView textView = new TextView(this);
        textView.setText("RBC WealthPath\n\nWelcome to your banking app!");
        textView.setTextSize(24);
        textView.setPadding(50, 50, 50, 50);
        
        setContentView(textView);
    }
}