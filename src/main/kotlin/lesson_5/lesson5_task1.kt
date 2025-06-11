package org.example.lesson_5

fun main() {

    println("""
        Для входа в приложение нам необходимо проверить, не являетесь ли вы ботом.
        Для этого Вам необходимо решить следующий пример: 4 + 3 = 
        Ответ введите в окне ниже.
    """.trimIndent())

    val answer = readln().toInt()

    if (answer == 7){
        println("Добро пожаловать!")
    }else{
        println("Доступ запрещен.")
    }

}