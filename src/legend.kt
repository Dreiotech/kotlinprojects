class dreio{

    // data member
    var num1:Int=9
    var num2:Int=7

    // member function
    fun addition():Int{
        return num1+num2
    }
}

fun main(args: Array<String>) {
    // instance of my object
    val myobj=dreio()
    println(myobj.addition())
}