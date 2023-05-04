package Expresstion

fun main(){
    val age:Int = 10

    if (age > 18) {
        print("Adult")
    } else {
        print("Minor")
    }
    println("\nAnother Way...")

    val result = if (age > 18) {
        "Adult"
    } else {
        "Minor"
    }
    println(result)


    println("\nNested If...")
    val nestedresult = if (age > 12) {
        if ( age > 12 && age  < 20 ){
            "Teen"
        }else{
            "Adult"
        }
    } else {
        "Minor"
    }
    print("The value of result : $nestedresult")
}