fun main()
{
        val a =10 // immutable variables
        val b = 5
    if(b == 0)
        println("error in dividing")
    else
        println(a/b)

    if(a>b)
        println(" greater num is $a")

    else if(b>a) {
        println("greater num is $b")
    }
    else
        println("values are equal")

    val num =2
    when(num){
        0 -> println("zero")
        1 -> println("one")
        2 -> println("two")
        else ->
            println("num not found")
    }
    val numb =0
    when{
        numb  <0 -> println("negative")
        numb >0 -> println("positive")
        else -> println("zero")

    }
  /*  val p = 0
    if( p<0 || p>0)
    {
        println("number is not zero")
    }
    else
        println("number is zero")
*/
    val p = 4
    if(p>=0 && p<=5 ){
        println("number is bw 0 and 5")
    }
    else
        println("number is not in range")
    val w = 5
    when(w) {// to reduce the usage of multiple if-else statements
        in 1..10 -> println("number lies bw 1-10") // 'in' - is used to find the num or char bw the range.
        in 11..20 -> println("number lies bw 11-20")
        else -> println("number out of range")
    }
}



