fun main()
{
    println("Enter month number:")
    var a= readLine()!!.toInt()
    when(a)
    {
        1->println("Jan")
        2->println("Feb")
        3->println("Mar")
        4->println("Apr")
        5->println("May")
        6->println("Jun")
        7->println("Jul")
        8->println("Aug")
        9->println("Sep")
        10->println("Oct")
        11->println("Nov")
        12->println("Dec")
    }
}