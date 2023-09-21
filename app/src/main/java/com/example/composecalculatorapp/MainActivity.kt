package com.example.composecalculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.ui.unit.dp
import com.example.composecalculatorapp.ui.theme.ComposeCalculatorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorAppTheme {
                val viewModel = viewModels<CalculatorViewModel>()
                val state = viewModel.value.state
                val buttonSpacing = 8.dp
            }
        }
    }
}

