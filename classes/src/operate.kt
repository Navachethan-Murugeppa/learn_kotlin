fun main(){
    val c = sum(10,20)
    /*val d = diff(10,20)*/
    val e = div(20,10)
    val pro = mul()
    pro.mul(10,20)
}
class mul {
    protected fun mul(a:Int, b:Int) = a*b
}