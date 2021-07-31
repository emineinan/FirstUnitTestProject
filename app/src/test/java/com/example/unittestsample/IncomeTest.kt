package com.example.unittestsample

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class IncomeTest {

    private lateinit var income: Income

    @Before
    fun setup() {
        income = Income()
    }

    @After
    fun teardown(){

    }

    @Test
    fun calculateNetIncome() {
        val netIncome = income.calculateNetIncome(500.0, 0.15)
        assertThat(netIncome).isEqualTo(425)
    }

    @Test
    fun calculateIncomeTax() {
        val incomeTax = income.calculateIncomeTax(100.0, 0.15)
        assertThat(incomeTax).isEqualTo(15)
    }
}