package Arrays

fun main(args: Array<String>) {
    var fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange","Apple")

    println( fruits.get(0))
    println( fruits.get(3))

    // Set the value at 3rd index
    fruits.set(3, "Guava")
    println( fruits.get(3))
    println(fruits.asList())
    println( "Size of fruits array " + fruits.size )
    println( "Size of fruits array " + fruits.count() )

    // loop an Array
    for( item in fruits ){
        println( item )
    }

    //Check if an Element Exists

    if ("Mango" in fruits){
        println( "Mango exists in fruits" )
    }else{
        println( "Mango does not exist in fruits" )
    }

    //Distinct Values from Array
    val distinct = fruits.distinct()
    for( item in distinct ){
        println( item )
    }

    // Dropping Elements from Array first
    val result = fruits.drop(2) // drops first two elements.
    for( item in result ){
        println("Dropping Elements from Array first: "+ item )
    }
    // Dropping Elements from Array last
    val result1 = fruits.dropLast(2) // drops first two elements.
    for( item in result ){
        println("Dropping Elements from Array last: "+ item )
    }

    // Checking an Empty Array
    println( "Array is empty : " + fruits.isEmpty())


}