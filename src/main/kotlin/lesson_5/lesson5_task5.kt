package org.example.lesson_5

fun main() {

    val min = 0
    val max = 42

    val hiddenNumbers = mutableSetOf<Int>()
    while (hiddenNumbers.size < 3) {
        hiddenNumbers.add((min..max).random())
    }

    val enteredNumbers = mutableListOf<Int>()
    println("Введите 3 различных числа от 0 до 42:")

    while (enteredNumbers.size < 3) {
        println("Введите число #${enteredNumbers.size + 1}")
        val enteredNumber = readln()

        if (enteredNumber.isBlank()) {
            println("Ошибка: введено пустое значение.")
            continue
        }

        val number = enteredNumber.toIntOrNull()
        if (number == null) {
            println("Ошибка: введите целое число.")
        } else if (number !in 0..42) {
            println("Ошибка: число должно быть в диапазоне от 0 до 42.")
        } else if (enteredNumbers.contains(number)) {
            println("Ошибка: это число уже было введено.")
        } else {
            enteredNumbers.add(number)
        }
    }

    val matchedNumbers = hiddenNumbers intersect enteredNumbers.toSet()
    val matchCount = matchedNumbers.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все три числа и выиграли джекпот! ")
        2 -> println("Поздравляем! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Утешительный приз! Вы угадали 1 число.")
        0 -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $hiddenNumbers")

}