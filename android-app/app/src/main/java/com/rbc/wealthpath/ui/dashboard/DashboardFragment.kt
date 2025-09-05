package com.rbc.wealthpath.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rbc.wealthpath.R

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        // Setup click listeners for quick action buttons
        setupQuickActions(view)
    }

    private fun setupQuickActions(view: View) {
        // Add goal button click handler
        // Transfer button click handler
        // This would typically open relevant screens or bottom sheets
    }
}