/**
 * This file demonstrates use of functions
 **/
fun main(){
  usrDef()
  sum(25,75)
}

fun usrDef(){
    var num = 64
    var result= Math.sqrt(num.toDouble())
    println("the square root of $num is $result")
}

fun sum(number1: Int,number2: Int) :Int{
    val result = number1+number2
    println(result)
    return result
}