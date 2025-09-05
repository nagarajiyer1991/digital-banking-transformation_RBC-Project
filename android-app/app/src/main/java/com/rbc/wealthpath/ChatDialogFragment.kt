package com.rbc.wealthpath

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ChatDialogFragment : BottomSheetDialogFragment() {

    private lateinit var messagesContainer: LinearLayout
    private lateinit var messageInput: EditText
    private lateinit var sendButton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        messagesContainer = view.findViewById(R.id.messages_container)
        messageInput = view.findViewById(R.id.message_input)
        sendButton = view.findViewById(R.id.send_button)

        // Add initial bot message
        addBotMessage("🎉 Welcome to RBC Financial Assistant! I can help with balances, budgets, goals, and more!")

        // Setup send button
        sendButton.setOnClickListener {
            sendMessage()
        }

        // Setup close button
        view.findViewById<ImageButton>(R.id.close_button).setOnClickListener {
            dismiss()
        }
    }

    private fun sendMessage() {
        val message = messageInput.text.toString().trim()
        if (message.isNotEmpty()) {
            addUserMessage(message)
            messageInput.text.clear()

            // Simulate bot response
            android.os.Handler(android.os.Looper.getMainLooper()).postDelayed({
                respondToUser(message)
            }, 800)
        }
    }

    private fun addUserMessage(message: String) {
        val messageView = layoutInflater.inflate(R.layout.item_user_message, messagesContainer, false)
        messageView.findViewById<TextView>(R.id.message_text).text = message
        messagesContainer.addView(messageView)
        scrollToBottom()
    }

    private fun addBotMessage(message: String) {
        val messageView = layoutInflater.inflate(R.layout.item_bot_message, messagesContainer, false)
        messageView.findViewById<TextView>(R.id.message_text).text = message
        messagesContainer.addView(messageView)
        scrollToBottom()
    }

    private fun respondToUser(userMessage: String) {
        val lowerMessage = userMessage.lowercase()
        val response = when {
            lowerMessage.contains("balance") || lowerMessage.contains("account") -> 
                "🏦 Your test account shows $25,430.50 CAD. In the real app, this would show your actual RBC account balances. Would you like to see recent transactions?"
            
            lowerMessage.contains("budget") || lowerMessage.contains("spending") -> 
                "📊 Your test budget shows 38% savings rate with $5,240 monthly expenses. Housing & Utilities: $2,100. The real app would show your actual spending patterns from WealthPath!"
            
            lowerMessage.contains("goal") || lowerMessage.contains("saving") -> 
                "🎯 Test goals: Emergency Fund 90% complete ($18,000/$20,000), Vacation Fund 52% complete ($4,200/$8,000). The real app connects to your actual financial goals!"
            
            lowerMessage.contains("investment") || lowerMessage.contains("invest") -> 
                "📈 Based on your test financial health score of 8.2/10, you might consider balanced growth portfolios. The real assistant would analyze your actual RBC investment accounts!"
            
            lowerMessage.contains("hello") || lowerMessage.contains("hi") -> 
                "👋 Hello! This is the test version of the RBC Financial Assistant. I can help with account questions, budget planning, savings goals, and investment guidance. Try asking about any of these topics!"
            
            else -> 
                "💡 You asked: \"$userMessage\". This test bot recognizes keywords like 'balance', 'budget', 'goals', and 'investment'. The real RBC assistant would provide personalized responses based on your actual account data!"
        }
        
        addBotMessage(response)
    }

    private fun scrollToBottom() {
        messagesContainer.parent?.let { parent ->
            if (parent is androidx.core.widget.NestedScrollView) {
                parent.fullScroll(View.FOCUS_DOWN)
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog
        dialog.behavior.peekHeight = 600
        return dialog
    }
}