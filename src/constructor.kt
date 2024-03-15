class safaristudents(val jina:String,val miaka:Int,val jinsia:String){

}

fun main(args: Array<String>) {
    val myobj=safaristudents("Scarlett",23,"Female")
    println("My name is ${myobj.jina}")
    println("I am ${myobj.miaka} years old")
    println("I am a ${myobj.jinsia}")
    val myobj1=safaristudents("Sheila",23,"Female")
    println("My name is ${myobj1.jina}")
    println("I am ${myobj1.miaka} years old")
    println("I am a ${myobj1.jinsia}")


}
