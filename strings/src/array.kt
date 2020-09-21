import java.util.*

fun main()
        {
            val arr = arrayOf(10, 12)
            val ar1 = arrayOf<Int>(15,19)
            println(arr[0])
            println(Arrays.toString(arr))
                    println(arr.size)
            arr[0] += ar1[0]
            arr[1] += ar1[1]
            println(Arrays.toString(arr))

        }