package org.example.lesson_2

fun main() {

    val permanentEmployees = 50
    val employeeSalary = 30000
    val interns = 30
    val internSalary = 20000
    val allEmployeesSalary = permanentEmployees * employeeSalary
    val totalSalaryExpenses = (interns * internSalary) + allEmployeesSalary
    val averageSalary = totalSalaryExpenses / (permanentEmployees + interns)
    println("Расходы на выплату зарплаты постоянных сотрудников: $allEmployeesSalary")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")

}