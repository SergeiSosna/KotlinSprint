package org.example.lesson_4

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val currentTimeOfYear = "зима"

    val analysisOfConditions = isSunny == SUNNY_WEATHER && isAwningOpen == OPEN_AWNING && airHumidity == AIR_HUMIDITY
            && currentTimeOfYear != CURRENT_TIME_OF_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $analysisOfConditions")

}

const val SUNNY_WEATHER: Boolean = true
const val OPEN_AWNING: Boolean = true
const val AIR_HUMIDITY = 20
const val CURRENT_TIME_OF_YEAR = "зима"