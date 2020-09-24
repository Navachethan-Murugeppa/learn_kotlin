fun main(){
    val a = callMe()

    a.hello()
    a.greeting()
}
/*open class Car{
   fun speedUp(){
       println("The car is speeding up")
   }
   fun applyBrakes(){
       println("Brakes are applied")
   }
}

class Hyundai: Car(){

}

class Honda: Car(){

}

fun main(){
   val hyundai = Hyundai()
   hyundai.speedUp()
   hyundai.applyBrakes()

   val honda = Honda()
   honda.speedUp()
   honda.applyBrakes()
} */

/* open class Car(val brandName: String, val color: String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }
}

class Hyundai(brandName: String = "Hyundai", color: String = "Black") : Car(brandName, color) {

}

class Honda(brandName: String = "Honda", color: String = "white") : Car(brandName, color) {

}

fun main(){
   val hyundai = Hyundai()
   hyundai.speedUp()
   hyundai.applyBrakes()

   val honda = Honda()
   honda.speedUp()
   honda.applyBrakes()
} */

/* open class Car(val brandName: String, val color: String) {

   fun speedUp() {
       println("The car is speeding up")
   }

   fun applyBrakes() {
       println("Brakes are applied")
   }

   // Create function maxSpeed() here
   open fun maxSpeed(){
       println("I can say the max Speed")
   }
}

class Hyundai(brandName: String = "Hyundai", color: String = "Black") : Car(brandName, color) {
   // override maxSpeed() here
   override fun maxSpeed(){
       println("Hyundai speed is 150kmph")
   }
}

class Honda(brandName: String = "Honda", color: String = "White") : Car(brandName, color) {
      // override maxSpeed() here
      override fun maxSpeed(){
          println("Max speedof Honda is 180kmph")
      }
}

fun main(){
   val hyundai = Hyundai()
   hyundai.maxSpeed()

   val honda = Honda()
   honda.maxSpeed()
} */

/* interface Games{
    fun football()
    fun cricket()
    fun basketball()
}
class Sports: Games{
    override fun football(){
        println("football is played in legs")
    }
    override fun cricket(){
        println("cricket is played using bat and ball")
    }
    override fun basketball(){
        println("basket ball is played in hands and ball")
    }
}

fun main(){

    val sports = Sports()
    sports.football()
    sports.cricket()
    sports.basketball()

} */