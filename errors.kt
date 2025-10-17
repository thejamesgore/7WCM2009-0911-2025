
fun safeDivide(a:Int,b:Int):Int =
    if(b==0) -1 else a/b

fun divideOrThrow(a:Int,b:Int):Int{
    if(b==0) throw ArithmeticException("Divide by zero")
    return a/b
}


// fun main(){
//     assertEquals(2, safeDivide(4,2))
//     assertEquals(-1, safeDivide(1,0))
//     assertFails { divideOrThrow(1,0) }
//     println("All tests passed!")


// }


fun main (){
    if( safeDivide(4,2) != 2) println("Test failed!") else println("Test Passed")

    try {
        divideOrThrow(1,0)
        println("Expected exception but not thrown")
    } catch (e: Exception) {
        println("Exception thrown ${e.message}")
    }
}