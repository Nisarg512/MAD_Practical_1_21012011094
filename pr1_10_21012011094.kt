class Car(type:String, model:String, owner:String, miles:Int, price:Int, cprice:Int){
    var a:String = type
    var b=model
    var c = owner
    var d:Int = miles
    var e:Int = price
    var f:Int = cprice

    fun getCarPrice(){
        println("Car Information: $a , $b\nCar Owner: $c\nMiles Driven: $d\nOriginal Car Price: $e, Current Car Price: $f ")
    }
}
fun main() {
    var cars = arrayOf(Car("KIA","2018","Nisarg",155,500000, 88950),
            Car("PORSHE","2019","Parth",15,200000, 399800),
            Car("BMW","2017","Harsh",150,1080000, 1079000),
            Car("Maruti", "2020", "Het", 180, 4000000, 3998000))

    println("Creating Car Class Object car1 in next line")

    println("Object of class is created and Init is called.\n-----")
    for (i in cars)
    {
        i.getCarPrice()
    }
}
