open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha:Int
) {
    // deve declarar devido o tipo ser um double não pode ser retornado um unit
 /*   fun bonificacao(): Double {
            return salario * 0.1
        }*/
    fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false

    }
    open fun bonificacao(): Double{
      return  salario * 0.1
    }


}