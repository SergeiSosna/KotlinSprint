package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val initialAmount = 70000
    val interestRate = 16.7
    val depositTerm = 20

    val finalAmount = initialAmount * (1 + interestRate / 100).pow(depositTerm.toDouble())

    println("%.3f".format(finalAmount))

}