// arrays em Kotlin

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
