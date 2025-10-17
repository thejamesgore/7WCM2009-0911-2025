1. 'Z'  // char - no issues
2. "Hello"[1] // string - no issues
3. "123".toInt() // Integer - no issues
4. 10 / 0 // Int - issue cannot divide by zero
5. arrayOf(1,2,3)[3] // array out of bounds issues
6. "Kotlin".substring(1,3) // string
7. true && false // boolean can't both be true and false


fun grade(score: Int): String {
    if(score < 50){
        return "Fail"
    } else if (score < 75){
        return "Pass"
    } else  {
        return "Excellent"
    }
}

fun reachLimit(start:Int, limit:Int):Int {
    var counter = start
    while(true){
        if(counter >= limit){
            break
        }
        println("count is ${counter}")
        counter++
    }
}

fun factLoop(n: Int):Int {
    var res = 1
    for(i in 1..n){
        res *= i
    }
    return res
}
factLoop(3)

// fun factRec(n:Int):Int {

// }

fun countOccurences(word:String, ch:Char): Int {
    var count = 0
    for(i in word){
        if(i == ch){
            count++
        }
    }
    return count
}

fun concat(a:Array<Int>, b:Array<Int>):Array<Int> {

}

fun safeDivide(a:Int,b:Int):Int{
    if(b == 0){
        return -1
    }else{
        return a/b
    }
}

fun divideOrThrow(a:Int,b:Int):Int {
    try {
        return a/b
    } catch (e: ArithmeticException){
        println(${e.message})
    }
}

fun cubeOfXPlusOne(x:Int):Int = (x+1)*(x+1)*(x+1)

fun main():Unit{
    try {
        if(cubeOfXPlusOne(2) == 27)println("Pass")
    } catch (e: Exception){
Println("Fail: ${e.message}")
    }

}

class Coord(val x:Int,val y:Int):Int {
    fun add(o:Coord):Int = a.Coord(x+o.x, y+o.y)
}
/**

@param
@returns
@throws

**/
class User(val id:Int, val name:String){
    if(id <= 0) throw IllegalArgumentException
    if(!name) throw IllegalArgumentException

    id.toString()
    println("User($id,$name)")
}