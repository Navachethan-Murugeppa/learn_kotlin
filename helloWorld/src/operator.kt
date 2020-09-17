fun main()
{
        val a=10
        val b=15    //Initializing the values of a and b

        var result : Boolean

        result = a==b // eual to
        println(result )

            result = a!=b // not eual to
                println(result)

    result = a>b // greater than
    println(result)

    result = a<b // lesser than
    println(result)

    result = a<=b // lesser than or equal to
    println(result)

    result = a>=b // greater than or equal to
    println(result)

    /* assignment operators */
    var x=10
    var z = 15
    //assign operator
    z=x
    println(z)

   var  y=13

    y+=x //add operator
    println(y)
    var s=13
    s-=x // minus operator
    println(s)

    var e = 13.0f
    e/=x // div operator
    println(e)

    var f=9

    f%=x //mod operator
    println(f)

    println("increment and decrement operators")

    var w =9
    println(++w)
    println(w++)

    var r = 5
    r--
    println(r)
    --r
    println(r)

}