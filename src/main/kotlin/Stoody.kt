import model.Conta

fun main() {

    println("Bem vindo ao Bytebank")
/*
    testaLacos()
*/

    val alex = Funcionario(
        nome = " Alex",
        cpf = "123123213123",
        salario = 1000.00
    )
    println("nome ${alex.nome}")
    println("nome ${alex.cpf}")
    println("nome ${alex.salario}")
    println("nome ${alex.bonificacao()}")

}









