fun main()
{
  /*  /* to print numbers in decreasing order */
    for(i in 10 downTo 1)
    {
    println(i)}  */

      // write your code here
      var sum = 0
      for(i in 0..50)
      {
          sum += i
      }
      println(sum)
      var j = 1
      var sumw = 0
      while(j<= 50)
      {
          sumw += j
          j++
      }
      println(sumw)

      var sumd = 0
      var k = 0
      do{
          sumd += k
          k++
      }while(k <= 50)
      println(sumd)

/*

    // write your code here
    for(k in 100 downTo 1 step 2)
    {
        print(k)
    }
    var i = 100
    while(i >= 1)
    {
        print(i)
        i -= 2
    }
    var j = 100
    do{
        print(j)
        j -= 2
    }while(j>= 1) // to print even numbers from 100 to 1

     for(k in 99 downTo 1 step 2)
    {
        print(k)
    }
    var i = 99
    while(i >= 0)
    {
        print(i)
        i -= 2
    }
    var j = 99
    do{
        print(j)
        j -= 2
    }while(j>= 0) // to print odd numbers from 100 to 1


 */
    /*var arr = arrayOf(10, 15, 20, 25)
    for(b in arr)
        println(i) // to print all array elements
*/
val listOfString = listOf("Lionel messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
println(listOfString)
val myMutableList = mutableListOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
println(myMutableList)

val myArrayList = arrayListOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
println(myArrayList)

    myMutableList.add("Harry Kane")   // c

    myMutableList.remove("Wayne Rooney")  //d

    myMutableList.add(1, "Neymar Jr.")  //e

    print(myMutableList)


}
