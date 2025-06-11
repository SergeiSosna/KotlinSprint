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

    val sailingConditions: Boolean = (isShipDamaged == false && crewComposition in 55..70 &&
            boxesOfProvisions > 50 && isWeatherConditions == true || false) || (isShipDamaged == true
            && crewComposition == 70 && isWeatherConditions == true && boxesOfProvisions >= 50)

    println("Может ли корабль отправиться в плавание? $sailingConditions")
}