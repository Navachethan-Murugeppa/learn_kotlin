import kotlin.math.max
fun main()
{
    val a =10
    val b =15
    val c = maxval(10,15)
    println(c)
}
fun maxval(a:Int, b:Int) : Int {
    return max(a,b)
}