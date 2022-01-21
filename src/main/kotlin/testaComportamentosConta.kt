import model.Conta

fun testaComportamentosConta() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0
    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0


//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)
//
//    println(contaAlex.titular)
//    println(contaAlex.numero)
//    println(contaAlex.saldo)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    contaFran.deposita(5000.00)
    println(contaFran.saldo)


    println("depois de tirar o valor lgoo abaixo")
    contaFran.saca(valor = 300.00);
    println(contaFran.saldo)

    println("tentando tirar da conta do amigo")
    contaFran.saca(valor = 5000000.00);
    println(contaFran.saldo)



    println("Conta da fran antes ${contaFran.saldo}")
    println("Conta da alex antes ${contaAlex.saldo}")
    contaFran.transfere(contaAlex, 500.00)

    println("conta da fran depois ${contaFran.saldo}")
    println("conta da alex depois ${contaAlex.saldo}")
}