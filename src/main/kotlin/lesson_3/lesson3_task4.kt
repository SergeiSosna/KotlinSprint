package org.example.lesson_3

fun main() {

    var moveFromWhere = "E2"
    var moveWhere = "E4"
    var moveNumber = 1

    println("$moveFromWhere-$moveWhere;$moveNumber")

    moveFromWhere = "D2"
    moveWhere = "D${2 + 1}"
    moveNumber++

    println("$moveFromWhere-$moveWhere;$moveNumber")

}