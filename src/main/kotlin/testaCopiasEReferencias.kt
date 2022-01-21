package model

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++





    fun testaCondicoes(saldo: Double) {
        if (saldo > 0.0) {
            println("conta é positiva")
        } else if (saldo == 0.0) {
            println("conta é neutra")
        } else {
            println("conta é negativa")
        }
        when {
            saldo > 0.0 -> println("conta é positiva")
            saldo == 0.0 -> println("conta é neutra")
            else -> println("conta é negativa")
        }
    }
}