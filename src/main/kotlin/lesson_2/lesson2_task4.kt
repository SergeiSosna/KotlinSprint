package org.example.lesson_2

fun main() {

    val crystallineOre = 7
    val ironOre = 11
    val temporaryEnhancement = 0.2

    val bonusMaterialsCrystallineOre: Int = (crystallineOre * temporaryEnhancement).toInt()
    println(bonusMaterialsCrystallineOre)

    val bonusMaterialsIronOre: Int = (ironOre * temporaryEnhancement).toInt()
    println(bonusMaterialsIronOre)

}