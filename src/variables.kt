fun main(args: Array<String>) {
  //  mutable variable/schangable

    var myname="Dreio"
    myname="Legend"
    println("My name is " + myname)
    println("My name is $myname")

   // immutable variables
    // school="eMobilis"
    val school="eMobilis"
   // school="MIT"
    println("I learn coding at $school")

    var num1=56
    var num2=24

    println("The sum of $num2 and $num1 is ${num2+num1}")
    println("The difference of $num1 and $num2 is ${num1-num2}")
    println("The product of $num2 and $num1 is ${num2*num1}")
    println("The quotient of $num1 and $num2 is ${num1/num2}")
}
