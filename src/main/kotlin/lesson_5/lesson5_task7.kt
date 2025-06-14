package org.example.lesson_5

fun main() {

    println(
        """
        Приветствуем Вас в приложении Калькулятор топлива.
        Оно расчитывает стоимость топлива для поездки в зависимости от расхода автомобиля и текущей цены на бензин.
        Для расчета Вам необходимо ввести некоторые данные (расстояние поездки, расход и стоимость топлива.)
    """.trimIndent()
    )

    println("Введите расстояние поездки (в километрах):")
    val travelDistance = readln().toFloat()

    println("Введите расход топлива на 100 км (в литрах):")
    val fuelConsumption = readln().toFloat()

    println("Текущую цену за литр топлива:")
    val fuelCost = readln().toFloat()

    val fuelForTheTrip = (travelDistance * fuelConsumption) / FUEL_FORMAT
    val totalFuelCost = fuelForTheTrip * fuelCost

    println(
        "Общее количество необходимого топлива:${"%.2f".format(fuelForTheTrip)}.\n" +
                "Итоговая стоимость поездки:${"%.2f".format(totalFuelCost)}"
    )

}

const val FUEL_FORMAT = 100