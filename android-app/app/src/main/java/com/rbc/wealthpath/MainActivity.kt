package com.rbc.wealthpath

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        
        // Setup bottom navigation with navigation controller
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_dashboard,
                R.id.navigation_goals,
                R.id.navigation_spending,
                R.id.navigation_education,
                R.id.navigation_recommendations
            )
        )
        navView.setupWithNavController(navController)

        // Setup floating chat button
        val fabChat: FloatingActionButton = findViewById(R.id.fab_chat)
        fabChat.setOnClickListener {
            showChatDialog()
        }

        // Setup notification button
        findViewById<android.widget.ImageView>(R.id.btn_notifications).setOnClickListener {
            Toast.makeText(this, "No new notifications", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showChatDialog() {
        val chatDialog = ChatDialogFragment()
        chatDialog.show(supportFragmentManager, "chat_dialog")
    }
}