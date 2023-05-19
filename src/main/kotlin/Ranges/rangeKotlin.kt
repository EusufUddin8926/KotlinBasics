package Ranges

fun main(args: Array<String>) {

    //Creating Ranges using rangeTo()
    println("Creating Ranges using rangeTo()")
    for ( num in 1.rangeTo(4) ) {

        println(num)
    }

    //Creating Ranges using .. Operator
    println("Creating Ranges using .. Operator")
    for ( num in 1..4 ) {

        println(num)
    }

    //Creating Ranges using downTo() Operator
    println("Creating Ranges using downTo() Operator")
    for ( num in 4 downTo 1 ) {

        println(num)
    }

    //Kotlin step() Function
    println("Kotlin step() Function")
    for ( num in 1..10 step 2 ) {
        println(num)
    }

    //Kotlin range of Characters
    println("Kotlin range of Characters")
    for ( ch in 'a'..'d' ) {
        println(ch)
    }

    //Kotlin reversed() Function
    println("Kotlin reversed() Function")
    for ( num in (1..5).reversed() ) {
        println(num)
    }

    //Kotlin until() Function
    println("Kotlin until() Function")
    for ( num in 1 until 5 ) {
        println(num)
    }


    //last, first, step Elements
    println("last, first, step Elements")
    println((5..10).first)
    println((5..10 step 2).step)
    println((5..10).reversed().last)

    //Filtering Ranges
    println("Filtering Ranges")
    val a = 1..10
    val f = a.filter { T -> T % 2 == 0 }
    println(f)

    //Distinct Values in a Range
    println("Distinct Values in a Range")
    val distinct = listOf(1, 1, 2, 4, 4, 6, 10)
    println(distinct.distinct())

    //Range Utility Functions
    println("Range Utility Functions")
    val range = 1..10
    println(range.min())
    println(range.max())
    println(range.sum())
    println(range.average())
    println(range.count())

}