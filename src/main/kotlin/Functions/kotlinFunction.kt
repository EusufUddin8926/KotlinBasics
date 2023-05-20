package Functions

fun main(args: Array<String>) {

    printHello()
    println("Parameters Function: " + printSum(10, 20))

    println("Return Values: " + sumTwo(100, 200))

    println("Recursive Function: " + factorial(6))
    println("Tail Recursion: " + factorialTail(10))
    println("Higher-Order Functions: " + calculate(4, 5, ::sum))
    addTwoNumber(10, 20) { myResult ->
        println("Higher-Order Functions Lambda as a last parameter: " + myResult)
    }

    mulTwoNumber(10, { mMul ->
        println("Higher-Order Functions Lambda before last parameter: " + mMul)
    }, 20)

    mulTwoNumber2(10, 20, { mMul, message ->
        println("Higher-Order Functions Lambda with multiple parameter: $mMul is $message")
    })

    mulTwoNumber3(10,20, { mMul, message ->
        println("Higher-Order Functions Lambda with Non Unit return parameter: $mMul is $message")
        mMul*2

    })


}


fun printHello() {
    println("This is simple functions!")
}

//Function Parameters
fun printSum(a: Int, b: Int): Int {

    return (a + b)
}

//Return Values
fun sumTwo(a: Int, b: Int): Int {
    val x = a + b

    return x
}

//Unit-returning Functions
fun sumTwoNumber(a: Int, b: Int): Unit {
    val x = a + b

}

//Recursive Function
fun factorial(a: Int): Int {
    val result: Int

    if (a <= 1) {
        result = a
    } else {
        result = a * factorial(a - 1)
    }

    return result
}

//Tail Recursion
fun factorialTail(a: Int, accum: Int = 1): Int {
    val result = a * accum
    return if (a <= 1) {
        result
    } else {
        factorialTail(a - 1, result)
    }
}

//Higher-Order Functions
fun sum(a: Int, b: Int) = a * b

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

//Higher-Order Functions Lambda as a last parameter
fun addTwoNumber(number1: Int, number2: Int, mSum: (Int) -> Unit) {
    val sum = number1 + number2;
    mSum(sum)
}

//Higher-Order Functions Lambda before last parameter
fun mulTwoNumber(number1: Int, mMul: (Int) -> Unit, number2: Int) {
    val mul = number1 * number2;
    mMul(mul)
}

//Higher-Order Functions Lambda with multiple parameter
fun mulTwoNumber2(number1: Int, number2: Int, mMul: (Int, String) -> Unit) {
    val mul = number1 * number2;
    mMul(mul, "Multiplication successful")
}

//Higher-Order Functions Lambda with Non Unit return parameter
fun mulTwoNumber3(number1: Int, number2: Int, mMul: (Int, String) -> Int) {
    val mul = number1 * number2;
    val result = mMul(mul, "Multiplication successful")
    println(result)
}