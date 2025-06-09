package org.example.lesson_2

fun main() {

    val hourDeparture = 9
    val minutesOfDeparture = 39
    val pathTime = 457

    val hoursOnRoad = pathTime / FORMAT_TIME
    val minutesOnRoad = pathTime % FORMAT_TIME
    val hourFromMinutesConversion = (minutesOfDeparture + minutesOnRoad) / FORMAT_TIME
    val minutesOfArrival = (minutesOfDeparture + minutesOnRoad) % FORMAT_TIME
    val arrivalHour = hourDeparture + hoursOnRoad + hourFromMinutesConversion

    println("Время прибытия поезда: %02d:%02d".format(arrivalHour,minutesOfArrival))

}

const val FORMAT_TIME = 60