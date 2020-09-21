fun main() {

    val a = "Internshala"
    val b = "Trainings"

    println(a.length) // length keyWord is used to find the length of the string
    println(b.length)

    if(a.length == b.length)
        println("length is same")
    else
        println("length is different")

    val c =100
    if( c>=100)
        println("given number is greater than or equal to 100")
    else if (c < 100)
        println("given  number is less than 100")
    else if(c >50)
        println("given number is greater than 50")
    else
        println("given number is less than 50")

    val d = arrayOf("Internshala", "Trainings")
    val e = arrayOf("Android", "App", "Developement")
    println(compareArrayLength(d, e))

    /* to use in and when as a function */
    val f =40
    findRange(f)
}
fun compareArrayLength(d:Array<String>, e:Array<String>): Boolean {
    return d.size == e.size
}
fun findRange(f:Int) {
    when(f){
        in 30..50 -> println("number lies bw 30 to 50")
        else -> println("number is out of range")
    }
}