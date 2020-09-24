fun main(){
    val res1 = Restaurant("aahar",8,150)
    val res2 = Restaurant("fooddeed",7,100)
    val res3 = Restaurant("foodmania",9,200)

    var restaurantlist = mutableListOf(res1, res2)

    restaurantlist.add(res3)

    for(res in restaurantlist)
    {
        println(res)
    }

}