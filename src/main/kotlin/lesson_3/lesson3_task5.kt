package org.example.lesson_3

fun main() {

    val input = "D2-D4;0"

    val parts = input.split(";")
    val moveParts = parts[0]
    val moveNumber = parts.getOrNull(1)?.toIntOrNull()?:0

    val moves = moveParts.split("-")
    val moveFromWhere = moves[0]
    val moveWhere = moves[1]

    println("Откуда ход:$moveFromWhere")
    println("Куда ход:$moveWhere")
    println("Номер хода:$moveNumber")

}