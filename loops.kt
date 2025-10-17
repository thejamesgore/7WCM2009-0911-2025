fun sumRange(a:Int,b:Int):Int{
    var s=0
    for(i in a..b) s+=i
    return s
}

fun fact(n:Int):Int{
    var r=1
    var i=n
    while(i>1){ r*=i; i-- }
    return r
}

fun main(){
    println(sumRange(2,5))
    println(fact(5))
}
