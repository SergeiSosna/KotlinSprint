package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val initialAmount = 70000
    val interestRate = 0.167
    val depositTerm = 20

    val finalAmount = initialAmount * (1 + interestRate).pow(depositTerm.toDouble())
    val formatedFinalAmount = "%.3f".format(finalAmount)

    println(formatedFinalAmount)

}