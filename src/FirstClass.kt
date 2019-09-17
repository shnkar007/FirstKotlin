//class FirstClass {
import java.util.Scanner;

    fun main(): Unit{
       val description = "Master"
     //Type Conversion
       val intval = 10
       val val2: Long = intval.toLong()
        println("enter your name")
       val name = readLine()
       println("Name you entered is  $name")
       println(intval.compareTo(val2)!=0)
       val asc = Array(5) { i->i*2}
        for(item in asc){
            println(item)
        }
    var something = "Babuji Maharaj"
        println("\n")
        println("Babuji $description\n")
        println("Array First Element "+asc[0])
        println("\n")
        println(val2)
        scanread()
    }
     fun scanread(){
         val read = Scanner(System.`in`)
         println("Enter age")
         var age= read.nextInt()
         println(age)
     }
//}