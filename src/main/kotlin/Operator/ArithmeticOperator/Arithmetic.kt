package Operator.ArithmeticOperator

fun main(){
    println("Arithmetic Operator....\n")
    println("Plus....")
    var number1 = 200
    var number2 = 100

  //  var result = number1+number2
  //  println("The Sum is = $result")
    println("number1 + number2 = ${number1+number2}")
    println("number1 - number2 = ${number1-number2}")
    println("number1 * number2 = ${number1*number2}")
    println("number1 / number2 = ${number1/number2}")
    println("number1 % number2 = ${number1%number2}")

    println("\nAnother Way...\n")
    println("number1 + number2 = ${number1.plus(number2)}")
    println("number1 - number2 = ${number1.minus(number2)}")
    println("number1 * number2 = ${number1.times(number2)}")
    println("number1 / number2 = ${number1.div(number2)}")
    println("number1 % number2 = ${number1.rem(number2)}")



}