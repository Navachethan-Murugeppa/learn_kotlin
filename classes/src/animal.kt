class Animal (var breed: String, var color: String, var age: Int) { // primary constructor
    var name: String? = null

    constructor (breed: String, color: String, age: Int, name: String): this(breed, color, age) {
        this.name = name // secondary constructor
    }
}
fun main(){
        val dog1 = Animal("german shepard", "Black", 10 )
        val dog2 = Animal("Labrador", "Brown", 8, "rocky")

}