class newclass {
    var breed: String = "German Shepard"
    var colour: String = "Black"
    var age: Int = 10

    fun eat(){
        println("${breed} eat food")
    }

    fun bark(){
        println("${breed} barks")
    }
}
class Laptop{
    var ram:Int = 4
    var brand:String = "Lenovo"
    var hdd:Int = 500

    fun performComputations(){
        println("I am learning Android")
    }

}
fun main(){
    val dog = newclass()
    dog.eat()
    dog.bark()

    val laptop = Laptop()
    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputations()
}