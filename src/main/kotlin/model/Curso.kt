package model

class Conta() {
    lateinit var titular: String
    var numero = 0
    var saldo = 0.0


    fun transfere(outraConta: Conta, valor: Double) {
        saca(valor)
        outraConta.deposita(valor)

    }


    fun deposita(valor: Double) {

        saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor

        } else {
            println("Saque em excesso")
        }

    }
}