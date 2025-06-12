package org.example.lesson_4

fun main() {

    val day = 5

    val isArmsAndAbsDay = (day % 2) == 1

    val arms: Boolean = isArmsAndAbsDay
    val legs: Boolean = !isArmsAndAbsDay
    val back: Boolean = isArmsAndAbsDay
    val abs: Boolean = !isArmsAndAbsDay

    println(
        """
        Упражнения для рук:   $arms
        Упражнения для ног:   $legs
        Упражнения для спины: $back
        Упражнения для пресса:$abs
    """.trimIndent()
    )
}