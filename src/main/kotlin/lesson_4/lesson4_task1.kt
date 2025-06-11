package org.example.lesson_4

fun main() {

    val tablesBookedForToday = 13
    val tablesBookedForTomorrow = 9

    println("Доступность столиков на сегодня:${tablesBookedForToday < NUMBER_OF_TABLES}\nДоступность столиков на сегодня:${tablesBookedForTomorrow < NUMBER_OF_TABLES}")

}

const val NUMBER_OF_TABLES = 13