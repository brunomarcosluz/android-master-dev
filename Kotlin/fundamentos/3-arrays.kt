// arrays em Kotlin

/* Arrays em Kotlin são representados pela classe Array<T>, é um conjunto de índices que podem ser acessados e alterados.
hoje é possível criar Arrays com as seguintes palavras reservadas:
- arrayOf
- arrayOfNulls
- emptyArray */

fun main() {

    var myArray1 = arrayOf(1,10,4,6,15)  
    var myArray2 = arrayOf<Int>(1,10,4,6,15)  
    val myArray3 = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")  
    var myArray4= arrayOf(1,10,4, "Ajay","Prakesh") 

    println(myArray1.get(0)) 
    println(myArray2.get(1))
    println(myArray3.get(2))
    println(myArray4.get(3))
}

// referencia documentacao do Kotlin sobre Arrays: https://kotlinlang.org/docs/basic-types.html#arrays