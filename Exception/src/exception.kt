fun main(){
    val d = arrayOf(1, 2, 3, 4)
    try{
        d[4] = 7
    }
    catch (e: ArrayIndexOutOfBoundsException)
    {

    }
    finally {
        println(d[2])
    }
    /* another exception handling */
    val arr = arrayOf(0, 100, 200, 300, 400, 500)
    try {
        println(arr[6])
    }
    catch(e: Exception){
        println("index 6 is out of range")
    }
    /* another exception handling */
    var str: String? = "Hello Kotlin"
    println(str)
    str =null
    println(str?.length)
    println(str!!.length)
    /* usage of Elvis operator (?:) */
    var x = null
    println(x?:"0.0")
    /* to remove null in the mutable list */
    var arr = mutableListOf(1, null, 2, 4, null, 6, 8, 10, null)
    arr.add(7, 12)
    println(arr.filterNotNull())
}