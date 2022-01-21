package model

import Funcionario

class Diretor(
    nome: String,
     cpf: String,
     salario: Double,
     senha: Int,
    val plr:Double

) : Funcionario(nome = nome, cpf = cpf, salario = salario, senha = senha) {
   override fun bonificacao(): Double{
        return  salario * 0.1
    }

}


