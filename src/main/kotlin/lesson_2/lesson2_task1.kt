package org.example.lesson_2

fun main() {

    val numberOfStudents = 4
    val studentScores1 = 3
    val studentScores2 = 4
    val studentScores3 = 3
    val studentScores4 = 5

    val arithmeticMean: Float = (studentScores1 + studentScores2 + studentScores3 + studentScores4) / numberOfStudents.toFloat()
    val formatedArithmeticMean = "%.2f".format(arithmeticMean)

    println(formatedArithmeticMean)

}