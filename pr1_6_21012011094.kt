fun main()
{
    println("Enter the naumber:")
    val a = readln()!!.toInt()
    val b = readln()!!.toInt()
    operation(a,b)
}
fun operation(a:Int,b:Int)
{
    val sum = a+b
    val sub = a-b
    val div = a/b
    val mul = a*b
    println("Enter the Operation")
    val op = readln()
    when (op){
        '+'.toString() ->println("$sum")
        '-'.toString() ->println("$sub")
        '/'.toString() ->println("$div")
        '*'.toString() ->println("$mul")
        else->println("Enter valid number")
    }
}