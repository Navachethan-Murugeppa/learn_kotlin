fun main()
{
        val a =10
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

}



