package org.example.lesson_2

fun main() {

    val hourDeparture = 9
    val minutesOfDeparture = 39
    val pathTime = 457

    val hoursOnRoad = pathTime / 60
    val minutesOnRoad = pathTime % 60
    val hourFromMinutesConversion = (minutesOfDeparture + minutesOnRoad) / 60
    val minutesOfArrival = (minutesOfDeparture + minutesOnRoad) % 60
    val arrivalHour = hourDeparture + hoursOnRoad + hourFromMinutesConversion

    println("Время прибытия поезда: $arrivalHour:$minutesOfArrival")

}