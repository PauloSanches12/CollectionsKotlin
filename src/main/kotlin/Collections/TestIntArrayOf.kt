package me.paulo

fun main() {
    val values = intArrayOf(2,4,5,6,8,9,5,7,4)

    for (valor in values) {
        println(valor)
    }

    values.forEach {
        println(it)
    }
}