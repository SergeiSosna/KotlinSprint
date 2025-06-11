package org.example.lesson_4

fun main() {

    val sunnyWeatherToday = true
    val openAwningAtTheMoment = true
    val airHumidity = 20
    val currentTimeOfYear = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых?\nНаличие солнечной погоды: ${sunnyWeatherToday == SUNNY_WEATHER}\nОткрытый тент: ${openAwningAtTheMoment == OPEN_AWNING}\nВлажность воздуха:${airHumidity == AIR_HUMIDITY}\nТекущее время года:${currentTimeOfYear != CURRENT_TIME_OF_YEAR}")


}

const val SUNNY_WEATHER: Boolean = true
const val OPEN_AWNING: Boolean = true
const val AIR_HUMIDITY = 20
const val CURRENT_TIME_OF_YEAR = "зима"