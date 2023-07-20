
fun main()
{
    println("Enter the number:")
    var a = readln().toInt()
    var ans =fact(a)
    println("fact:"+ans)

}
fun fact(a:Int):Int{
    if (a==0 || a==1)
    {
        return 1;
}
    else{
        return a * fact(a-1)

    }    }