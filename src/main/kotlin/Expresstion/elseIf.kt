package Expresstion

fun main(){
    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time>10 && time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    println("Another Example...\n")
    println("Enter Number: ")
    val number: Int = Integer.valueOf(readLine())

    if (number<10){
        println("Good Morning")
    }else if (number>10 && number<20){
        println("Good Noon")
    }else{
        println("Good Evening")
    }
}