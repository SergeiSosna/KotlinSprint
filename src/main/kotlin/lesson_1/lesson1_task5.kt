package org.example.lesson_1

fun main() {

    val flightTime = 6480

    // Вычисляем часы, минуты и остаток секунд
    val hours = flightTime / 3600
    val remainingSecondsAfterHours = flightTime % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    // Форматируем значения до двух цифр
    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)

    // Выводим результат
    println("$formattedHours:$formattedMinutes:$formattedSeconds")

}