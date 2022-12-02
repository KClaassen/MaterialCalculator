package com.example.android.materialcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.android.materialcalculator.ui.theme.MaterialCalculatorTheme
import com.example.android.materialcalculator.presentation.CalculatorScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialCalculatorTheme {
                CalculatorScreen()
            }
        }
    }
}