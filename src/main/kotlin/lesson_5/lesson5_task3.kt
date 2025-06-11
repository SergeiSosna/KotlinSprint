package org.example.lesson_5

fun main() {

    println(
        """
        Приветствуем Вас в приложении-лотерее.Вам необходимо угадать два числа от 0 до 42.
        Для этого по очереди вводите два числа в диапазоне от 0 до 42 в окне ниже.
    """.trimIndent()
    )

    println("Введите первое число:")
    val enteredNumber1 = readln().toInt()

    println("Введите второе число:")
    val enteredNumber2 = readln().toInt()

    val hiddenNumber1 = 5
    val hiddenNumber2 = 30

    val resultText = if ((enteredNumber1 == hiddenNumber1 || enteredNumber1 == hiddenNumber2)
        && (enteredNumber2 == hiddenNumber1 || enteredNumber2 == hiddenNumber2)
    ) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if ((enteredNumber1 == hiddenNumber1 || enteredNumber1 == hiddenNumber2)
        || (enteredNumber2 == hiddenNumber1 || enteredNumber2 == hiddenNumber2)
    ) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }

    println(resultText)
    println("Загаданные числа: $hiddenNumber1 и $hiddenNumber2")

}