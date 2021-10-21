// Declarando variáveis em Kotlin

fun main(){

    // para declaramos variáveis utilizamos a palavra reservada 'val'

    val x = 10
    val y = 5

    println(x)
    println(x)

    
/* Variáveis nessa linguagem não podem ser nulas, para inferir o valor nulo nas
variáveis é necessário incluir o ponto de interrogação '?' */

// declarando uma variável nula:

    class Pessoa(val primeio: String,
             val meio: String?, // note o '?' aqui
             val ultimo: String)

val Faustao = Pessoa("Fausto", null, "Silva") 

}
