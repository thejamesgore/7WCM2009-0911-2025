fun sq(x:Int):Int = x*x
fun cube(x:Int):Int = x*x*x
fun max(a:Int,b:Int):Int = if(a>b) a else b
fun hyp(a:Double,b:Double):Double = kotlin.math.sqrt(a*a + b*b)

fun main(){
    println("sq(5) = ${sq(5)}")
    println("max(2,9) = ${max(2,9)}")
    println("hyp(3,4) = ${hyp(3.0,4.0)}")
}
