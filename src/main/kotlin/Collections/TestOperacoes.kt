package me.paulo

fun main () {
    val salarios = doubleArrayOf(1000.0, 2500.0, 5000.0)

    for (salario in salarios){
        println(salario)
    }

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    salarioMaiorQue2500.forEach { println(it) }
}