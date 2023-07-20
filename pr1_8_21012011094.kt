import java.util.*

fun main()
{
    var a= arrayOf(5,15,25,35)
    //vararg
    println(Arrays.deepToString(a))
    var b = IntArray(5)
    b[0]=2
    b[1]=5
    b[2]=8
    b[3]=12
    b[4]=16
    println("array by using arrayof")
    for(i in 0 .. b.size-1)
    {

        println(""+b[i])
    }

    var c = intArrayOf(5,6,10,15,12)
    for(i in 0 .. c.size-1)
    {
        println(""+c[i])
    }
    var arr = Array<Int>(5){i:Int->i}
    for(i in 0 .. arr.size-1)
    {
        println(""+arr[i])
    }
}