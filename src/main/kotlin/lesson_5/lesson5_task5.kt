package org.example.lesson_5

fun main() {

    val min = 0
    val max = 42

    val hiddenNumbers = (min..max).shuffled().take(WINNING_NUMBERS).toSet()

    val enteredNumbers = mutableListOf<Int>()
    println("Введите $WINNING_NUMBERS различных числа от $min до $max:")

    while (enteredNumbers.size < WINNING_NUMBERS) {
        println("Введите число #${enteredNumbers.size + 1}")
        val enteredNumber = readln()

        if (enteredNumber.isBlank()) {
            println("Ошибка: введено пустое значение.")
            continue
        }

        val number = enteredNumber.toIntOrNull()
        if (number == null) {
            println("Ошибка: введите целое число.")
        } else if (number !in min..max) {
            println("Ошибка: число должно быть в диапазоне от $min до $max.")
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
        1 -> println("Утешительный приз! Вы угадали одно число.")
        0 -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $hiddenNumbers")

}

const val WINNING_NUMBERS = 3