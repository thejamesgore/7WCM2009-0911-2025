fun concat(a: Array<Int>, b: Array<Int>):Array<Int>{
    val res = Array(a.size + b.size){0} // Array(n){0} - New array of length n with elements 0
    for(i in a.indices) res[i]=a[i] // a.indices all valid indexes of array a and copies them to res from index i
    for(j in b.indices) res[a.size+1] = b[j] // from index length of array a plus 1 copy b
    return res
}

fun reverse(s:String):String {
    var out =""
    for(i in s.length -1 downTo 0) out += s[i]
    return out
}

fun main(){
    val nums=arrayOf(1,2,3)
    println(nums.contentDeepToString())
    println(concat(nums, arrayOf(4,5)).contentDeepToString())
    println(reverse("kotlin"))
}