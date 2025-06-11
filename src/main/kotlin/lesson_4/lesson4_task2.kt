package org.example.lesson_4

fun main() {

    val weightCargo1 = 20
    val volumeCargo1 = 80
    val weightCargo2 = 50
    val volumeCargo2 = 100

    val correspondence =(WEIGHT_MIN_AVERAGE < weightCargo1) && (weightCargo1 <= WEIGHT_MAX_AVERAGE)
            && (volumeCargo1 < VOLUME_MAX_AVERAGE)

    println("Груз1 с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории 'Average':$correspondence")
    println("Груз2 с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average': " +
            "${(WEIGHT_MIN_AVERAGE < weightCargo2) && (weightCargo2 <= WEIGHT_MAX_AVERAGE) 
                    && (volumeCargo2 < VOLUME_MAX_AVERAGE)}")

}

const val WEIGHT_MIN_AVERAGE = 35
const val WEIGHT_MAX_AVERAGE = 100
const val VOLUME_MAX_AVERAGE = 100