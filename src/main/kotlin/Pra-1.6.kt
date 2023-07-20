fun add(x: Int,y: Int): Int {
    return x+y
}
fun sub(x: Int,y: Int): Int {
    return x-y
}
fun div(x: Int,y: Int): Int {
    return x/y
}
fun mul(x: Int,y: Int): Int {
    return x*y
}
fun main() {
    val x = 449
    val y = 172
    println("Addition of $x and $y = "+ add(x,y))
    println("Subtraction of $x and $y = "+ sub(x,y))
    println("Multiplication of $x and $y = "+ mul(x,y))
    println("Division of $x and $y = "+ div(x,y))
}