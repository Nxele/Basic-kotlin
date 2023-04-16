// Classes & Objects
/*
Kotlin - What are Classes and Objects?
Classes and objects are the two main aspects of object-oriented programming.
Look at the following illustration to see the difference between class and objects:

Everything in Kotlin is associated with classes and objects, along with its properties and functions. For example: in real life, a car is an object. The car has properties, such as brand, weight and color, and functions, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

Example 1
class   objects    properties
Fruit   Apple      color
        Banana     size
        Mango      weight

Example 2
class   objects    properties    methods / functions
car     BMW        Make          Drive
        Mclaren    Model         Brake
        Porsche    Year          Spin
                   Color
                   Engine
*/
open class Car { // or class Car(var brand: String, var model: String, var year: Int)
    lateinit var make : String
    lateinit var model : String
    var year : Int = 0
    val engine = true

    fun displayCar(){
        println(" Make : ${make} \n model ${model} \n Year ${year} \n Engine ${engine}")
    }
}

// Use the open keyword in front of the superclass/parent, to make this the class other classes should inherit properties and functions from.
open class Motorbike: Car(){ // subclass motorbike inherit from car
}

class Bus : Car(){
}

fun main(){
    val myFirstCar = Car() // creating

    myFirstCar.make = "BMW"
    myFirstCar.model = "E92 M3"
    myFirstCar.year = 2013

    myFirstCar.displayCar()

    val mybike = Motorbike() // creating a new object for motorbike which inherit all Car properties and methods
    mybike.make = "BMW"
    mybike.model = "S1000 RR"
    mybike.year = 2022

    mybike.displayCar()

    var myBus = Bus()
}