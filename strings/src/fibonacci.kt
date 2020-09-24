fun main() {

    // write your code here
    var i =0
    var j =1
    var k=0
    print("$i,$j")
    for(s in 1..8) {
        k = i + j
        print(", $k")
        i = j
        j = k
    }

        val listOfMathSymbol = listOf('+', '-', '*', '/')
        for(i in listOfMathSymbol)
        {
            val output = doOperation(50, 70, i)
            println("The solution of operation $i is $output")
        }

}
fun doOperation(a:Int, b:Int, operator: Char ): Int {
    var c = 0
    if (operator == '+') {
        c = a + b
    }
    if (operator == '-') {
        c = a - b
    }
    if (operator == '*') {
        c = a * b
    }
    if (operator == '/') {
        if (b != 0) {
            c = a / b
        } else {
            c = 0
        }
    }
    return c
}