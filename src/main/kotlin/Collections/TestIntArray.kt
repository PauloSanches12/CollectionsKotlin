package me.paulo

fun main() {
    val values = IntArray(5)

    values[0] = 0
    values[1] = 1
    values[2] = 2
    values[3] = 3
    values[4] = 4

    for (valor in values){
        println(valor)
    }
println("---------------------")
    values.forEach { valor ->
        println(valor)
    }
println("---------------------")
    for (index in values.indices){
        println(values[index])
    }
println("----------------------")
    values.sort()

    for (valor in values){
        println(valor)
    }
}