package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val minNumber = 1
    val maxNumber = 10
    val randomNumber1 = Random.nextInt(minNumber, maxNumber)
    val randomNumber2 = Random.nextInt(minNumber, maxNumber)

    println(
        """
        Для входа в приложение нам необходимо проверить, не являетесь ли вы ботом.
        Для этого Вам необходимо решить следующий пример: $randomNumber1 + $randomNumber2 = 
        Ответ введите в окне ниже.
    """.trimIndent()
    )

    val sum = randomNumber1 + randomNumber2
    val answer = readln().toInt()

    if (answer == sum) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}