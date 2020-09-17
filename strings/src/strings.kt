fun main()
{
    val s = "hello"

    val t : String = "how are you?"

    var a = "hi"

    var stringLength = t.length

    val stringindex = t.get(10)

    println(s)
    println(t)
    println(stringLength)
    println(stringindex)
    println(a)
    //string templates
    val q = 10
    println("value is $q")
    println("sub string is '${t.subSequence(0,3)}'")
}