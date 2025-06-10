package org.example.lesson_2

fun main() {

    val crystallineOre = 7
    val ironOre = 11
    val temporaryEnhancement = 20

    val bonusMaterialsCrystallineOre: Int = (crystallineOre * temporaryEnhancement / 100)
    println(bonusMaterialsCrystallineOre)

    val bonusMaterialsIronOre: Int = (ironOre * temporaryEnhancement / 100)
    println(bonusMaterialsIronOre)

}