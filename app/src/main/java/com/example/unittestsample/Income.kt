package com.example.unittestsample

class Income {

    fun calculateNetIncome(income: Double, taxRate: Double): Double {
        return income - (income * taxRate)
    }

    fun calculateIncomeTax(income: Double, taxRate: Double): Double {
        return income * taxRate
    }
}