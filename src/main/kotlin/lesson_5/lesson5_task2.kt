package org.example.lesson_5

fun main() {

    println("Введите год своего рождения:")

    val yearOfBirth = readln().toInt()
    val currentYear = 2025
    val userAge = currentYear - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY){
        println("Show special content")
    }else if (userAge ==16 || userAge ==17){
        println("Show limit content")
    }else{
        println("Back to main screen")
    }

}

const val AGE_OF_MAJORITY = 18