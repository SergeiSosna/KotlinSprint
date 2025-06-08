package org.example.lesson_1

fun main() {

    val flightTime = 6480

    // Вычисляем часы, минуты и остаток секунд
    val hours = flightTime / FORMAT_TIME
    val remainingSecondsAfterHours = flightTime % FORMAT_TIME
    val minutes = remainingSecondsAfterHours / FORMAT_TIME2
    val seconds = remainingSecondsAfterHours % FORMAT_TIME2

    // Форматируем значения до двух цифр
    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)

    // Выводим результат
    println("$formattedHours:$formattedMinutes:$formattedSeconds")

}

const val FORMAT_TIME = 3600
const val FORMAT_TIME2 = 60
