package org.example.lesson_3

fun main() {

    val input = "D2-D4;0"

    val parts = input.split(";","-")
    val moveFromWhere = parts[0]
    val moveWhere = parts[1]
    val moveNumber = parts.getOrNull(2)?.toIntOrNull()?:0

    println("Откуда ход:$moveFromWhere")
    println("Куда ход:$moveWhere")
    println("Номер хода:$moveNumber")

}