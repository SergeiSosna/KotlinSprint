package org.example.lesson_1

fun main() {

    val flightTime = 6480

    // Вычисляем часы, минуты и остаток секунд
    val hours = flightTime / FORMAT_TIME
    val remainingSecondsAfterHours = flightTime % FORMAT_TIME
    val minutes = remainingSecondsAfterHours / FORMAT_TIME2
    val seconds = remainingSecondsAfterHours % FORMAT_TIME2

    // Выводим результат
    println("%02d:%02d:%02d".format(hours,minutes,seconds))

}

const val FORMAT_TIME = 3600
const val FORMAT_TIME2 = 60
