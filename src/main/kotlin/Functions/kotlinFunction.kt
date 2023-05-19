package Functions

fun main(args: Array<String>) {

    printHello()
    println("Parameters Function: "+printSum(10, 20))

    println("Return Values: "+ sumTwo(100,200))

    println("Recursive Function: "+ factorial(6))
    println("Tail Recursion: "+ factorialTail(10))


}


fun printHello(){
    println("This is simple functions!")
}

//Function Parameters
fun printSum(a:Int, b:Int){

    println(a + b)
}

//Return Values
fun sumTwo(a:Int, b:Int):Int{
    val x = a + b

    return x
}

//Unit-returning Functions
fun sumTwoNumber(a:Int, b:Int):Unit{
    val x = a + b

}

//Recursive Function
fun factorial(a:Int):Int{
    val result:Int

    if( a <= 1){
        result = a
    }else{
        result = a*factorial(a-1)
    }

    return result
}

//Tail Recursion
fun factorialTail(a: Int, accum: Int = 1): Int {
    val result= a * accum
    return if (a <= 1) {
        result
    } else {
       factorialTail(a-1, result)
    }
}