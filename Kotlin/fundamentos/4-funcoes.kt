/*  funcoes em Kotlin sao declaradas a partir da palavra reservada 'fun' abreviacao de function
ou para os bilingues 'diversao' em ingles XD */

fun main()
{ // isso é uma funcao

    fun helloworld()
    {
        return println("Hello World")
    }    

    fun sum(a : Int, b : Int) 
    { // isso é uma funcao
        val soma = a + b
        return println(soma)
    }

    sum(5,5)
    helloworld()
}
