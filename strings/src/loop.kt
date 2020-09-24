fun main()
{
    for(i in 1..10) //for loop
    {
        println(i)
    }
    var j =1
   /* while(j<= 10) // while loop
    {
        println(j)
        j++
    }
    var k =1
    do// do-while loop

    {
        println(k)
        k++
    } while(k<=10) */
    val a = arrayOf("a", "b", "c", "d", "e", "f")
    for(l in 0..a.size - 1)
    {
        println(a[l]) // println("${a[l]}") can also be used
    }
    /* to increase step size */
    for(r in 1..10 step 2)
    {
        println(r)
    }
    var p =1
    while(p<= 10)
    {
        println(p)
        p+=2
    }
    var t = 1
    do{
        println(t)
        t+=2
    }while(t<=10)
}