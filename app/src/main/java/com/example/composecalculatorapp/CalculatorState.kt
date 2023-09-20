package com.example.composecalculatorapp

data class CalculatorState(
    val firstNumber: String = "",
    val secondNumber:String = "",
    val operation: CalculatorOperations? = null
)
