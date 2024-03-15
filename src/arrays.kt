fun main(args: Array<String>) {
    var myarr= arrayOf("Legend","joy",true,78,67,98f,'e')
    myarr[0]="Dreio"
    println("My name is ${myarr[0]}")
    var myintarr= arrayOf<Int>(12,56,52,0,3,-1)

    println(myintarr.sorted())
    var myfloatarr= arrayOf<Float>(56.678837378f,34.54875846578f,54.678478387f)
    println(myfloatarr.sorted())
    var mystringarr= arrayOf<String>("Liverpool","Chelsea","Newcastle","Bournemouth")
    println(mystringarr.sorted())
}