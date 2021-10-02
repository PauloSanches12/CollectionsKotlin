package me.paulo

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 4000.0



    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("------------------------------------")

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
    println("------------------------------------")
    println(salarios.count{ it in 2000.0..5000.0 })

    println("------------------------------------")
    println(salarios.find { it == 1100.0 })

    println("------------------------------------")
    println(salarios.any() { it == 1100.0 })
}