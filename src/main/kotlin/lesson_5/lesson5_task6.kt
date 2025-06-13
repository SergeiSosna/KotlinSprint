package org.example.lesson_5

fun main() {

    println(
        """
        Приветствуем Вас в приложении по расчету Индекса Массы Тела (ИМТ).
        Для произведения необходимых расчетов в окне ниже введите свой вес и рост.
        Вес необходимо ввести в киллограмах, а рост в сантиметрах.
        """.trimIndent()
    )

    println("Введите вес (в киллограммах):")
    val userWeight = readln().toFloat()

    println("Введите рост (в сантиметрах):")
    val userHeight = readln().toFloat()

    val userHeightInMeters = userHeight / CENTIMETERS_IN_A_METER

    val bmi = userWeight / (userHeightInMeters * userHeightInMeters)

    val bmiResult = when {
        bmi < BMI_MIN -> "Ваш ИМТ: ${"%.2f".format(bmi)}. Недостаточная масса тела."
        bmi < BMI_AVERAGE -> "Ваш ИМТ: ${"%.2f".format(bmi)}. Нормальная масса тела."
        bmi < BMI_MAX -> "Ваш ИМТ: ${"%.2f".format(bmi)}. Избыточная масса тела."
        else -> "Ваш ИМТ: ${"%.2f".format(bmi)}. Ожирение."
    }

    println(bmiResult)

}

const val CENTIMETERS_IN_A_METER = 100
const val BMI_MIN = 18.5
const val BMI_AVERAGE = 25
const val BMI_MAX = 30