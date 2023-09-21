package com.example.composecalculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composecalculatorapp.ui.theme.ComposeCalculatorAppTheme
import com.example.composecalculatorapp.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorAppTheme {
                val viewModel = viewModels<CalculatorViewModel>()
                val state = viewModel.value.state
                val buttonSpacing = 8.dp
                Calculator(
                    state = state,
                    modifier = Modifier.fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp),
                    onAction = viewModel.value::onAction,
                    buttonSpacing = buttonSpacing
                )
            }
        }
    }
}

