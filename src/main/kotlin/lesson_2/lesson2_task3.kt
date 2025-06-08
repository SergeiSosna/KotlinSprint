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

    val formatArrivalHour = String.format("%02d", arrivalHour)
    val formatMinutesOfArrival = String.format("%02d", minutesOfArrival)

    println("Время прибытия поезда: $formatArrivalHour:$formatMinutesOfArrival")

}

const val FORMAT_TIME = 60