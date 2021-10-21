// Declarando variáveis em Kotlin

fun main(){

    // para declaramos variáveis utilizamos a palavra reservada 'val' ou 'var'

    val x = 10
    var y = 5

    println(x)
    println(x)

// val vs var 

/* Variáveis em Kotlin podem ser declaradas de duas formas diferentes
val e var, val: trata-se de variáveis imutáveis ou "finais", podem ser inicializadas
apenas uma vez, já a var é o oposto de sua irmã, ela é mutável e pode ser inicializada
quantas vezes necessário */

// Observação: O valor de Val é imutável porém o tipo não 
// referência: https://qastack.com.br/programming/44200075/val-and-var-in-kotlin 
 
fun main(){
     val name = "Bruno Marcos Luz" // imutável
     println("Your name is: $name")

     var Address : String? = "Brazil, Sao Paulo" // mutável
     println("Your Address is: $Address ?")
}
    
/* Variáveis nessa linguagem não podem ser nulas, para inferir o valor nulo nas
variáveis é necessário incluir o ponto de interrogação '?' */

// declarando uma variável nula:

    class Pessoa(val primeio: String,
             val meio: String?, // note o '?' aqui
             val ultimo: String)

val Faustao = Pessoa("Fausto", null, "Silva") 

}
