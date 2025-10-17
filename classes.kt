class Coord(val x:Int, val y:Int) {
    fun add(o:Coord):Coord = Coord(x + o.x, y + o.y)
    fun scale(k:Int):Coord = Coord(x*k, y*k)
    override fun toString():String = "($x, $y)"
}

fun main(){
    val a = Coord(1,2)
    val b = Coord(3,4)
    println(a.add(b))     // (4,6)
    println(a.scale(2))   // (2,4)
}

class Rectangle(val width:Int, val height: Int){

    //computer area of rect
    fun area(): Int = width * height

    // scale the rect
    fun scale(factor: Int): Rectangle = {
        Rectangle(width* factor, height* factor)
    }

    override fun toString(): String = "Rectangle(${width}x${height})"

}

class bankAccount(var balance:Double){


    fun deposit(amount: Double){
        require(amount >= 0)
        balance += amount
    }

    fun withdraw

    override fun toString(): String = "BankAccount:(balance=$balance)"
}