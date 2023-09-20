package com.example.composecalculatorapp

sealed class CalculatorActions {
    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operations(val operations: CalculatorOperations): CalculatorActions()

}
