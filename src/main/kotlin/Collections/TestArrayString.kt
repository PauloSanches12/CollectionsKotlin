package Collections

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Paulo"
    nomes[1] = "Julio"
    nomes[2] = "Nathan"

    nomes.forEach {
        println(it)
    }

    nomes.sort()

    for (nome in nomes){
        println(nome)
    }

    val nome2 = arrayOf("Paulo", "Julio", "Lucas")

    nome2.forEach { println(it) }

}