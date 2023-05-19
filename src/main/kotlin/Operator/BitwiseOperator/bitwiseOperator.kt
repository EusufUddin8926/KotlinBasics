package Operator.BitwiseOperator

fun main(args: Array<String>) {
    var x:Int = 60	  // 60 = 0011 1100
    var y:Int = 13	  // 13 = 0000 1101
    var z:Int

    z = x.shl(2)       // 240 = 1111 0000
    println("x.shl(2) = " +  z)

    z = x.shr(2)       // 15 = 0000 1111
    println("x.shr(2) = " +  z)

    z = x.and(y)       // 12 = 0000 1100
    println("x.and(y)  = " +  z)

    z = x.or(y)        // 61 = 0011 1101
    println("x.or(y)  = " +  z)

    z = x.xor(y)       // 49 = 0011 0001
    println("x.xor(y)  = " +  z)

    z = x.inv()        // -61 = 1100 0011
    println("x.inv()  = " +  z)
}