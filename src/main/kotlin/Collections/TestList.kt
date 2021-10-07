package Collections

fun main() {
    val paulo = Funcionario("Paulo Sérgio", 1500.0)
    val julio = Funcionario("Júlio César", 1000.0)
    val lucas = Funcionario("Lucas", 1300.0)

    val funcionarios = listOf(paulo, julio, lucas)

    funcionarios.forEach { println(it) }

    println("----------------------------")
    println(funcionarios.find { it.nome == "Paulo Sérgio" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}