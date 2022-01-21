package model

import Funcionario

class Gerente(
    nome: String,
     cpf: String,
     salario: Double,
     senha: Int,

) : Funcionario(nome = nome, cpf = cpf, salario = salario, senha = senha) {

}


