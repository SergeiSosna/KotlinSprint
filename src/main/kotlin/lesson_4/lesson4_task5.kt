package org.example.lesson_4

fun main() {

    println("Введите есть ли у коробля повреждения? true/false")
    val isShipDamaged: Boolean = readln().toBoolean()

    println("Введите количество экипажа на корабле:")
    val crewComposition = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val boxesOfProvisions = readln().toInt()

    println("Благоприятная ли погода для плавания? true/false")
    val isWeatherConditions = readln().toBoolean()

    val sailingConditions: Boolean = (isShipDamaged == false &&
            crewComposition in CREW_MIN..CREW_MAX &&
            boxesOfProvisions > BOXES_MIN &&
            isWeatherConditions == true || false) ||
            (isShipDamaged == true &&
                    crewComposition == CREW_MAX &&
                    isWeatherConditions == true &&
                    boxesOfProvisions >= BOXES_MIN)

    println("Может ли корабль отправиться в плавание? $sailingConditions")

}

const val CREW_MIN = 55
const val CREW_MAX = 70
const val BOXES_MIN = 50