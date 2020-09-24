class Dog (var breed:String, var color: String, var age:Int )// primary constructor
{
    fun eat()
    {
        println("${breed} eat food")
    }
    fun bark()
    {   println("${breed} barks")
    }
}
fun main()
{
    val dog1 = Dog ("Labrador","brown", 10)
    dog1.eat()
    dog1.bark()

    val dog2 = Dog ("german shepard","Black", 8)
    dog2.eat()
    dog2.bark()



}