package com.example.citadelwallet_.ui.components

import android.content.Context
import android.widget.Toast

/**
function to show toast message
 */
fun showToast(context: Context, message: String, length: Int) {
    Toast.makeText(context, message, length).show()
}