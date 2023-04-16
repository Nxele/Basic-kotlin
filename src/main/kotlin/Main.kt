fun main() {
    Person()
    DataTypes()
    StringValues()
    ifElse()
    breakContinue()
}

// Methods & Variables
fun Person(){

    // Declare and asign a value
    val name = "Sizwe"
    val surname = "Nxele"
    var age = 28

    // Declare only but you need to specify the type:
    val worth : Int
    val futureWife : String

    worth = 450000000
    futureWife = "Sinenhlanhla"

    println(" Name: $name \n Surname: $surname: \n Age: $age \n worth: $worth \n FutureWife: $futureWife")
}

// DataTypes on kotlin
fun DataTypes(){
    // Declare and initialize value
    val age = 28                // Int
    val hieght = 1.5            // Double or float
    val myLetter = 'S'          // Char or Character
    val greatProgrammer = true  // boolean
    val codingName = "Vecter"   // String

    // Declare & initialise and set type
    val _age: Int = 28                // Int
    val _hieght: Double = 1.5            // Double or float
    val _myLetter: Char = 'S'          // Char or Character
    val _greatProgrammer: Boolean = true  // boolean
    val _codingName: String = "Vecter"   // String

    // Integer types : Byte, Short, Int and Long.
    // Floating point types : Float and Double

    // doing conversions
    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():

    // Conversion example
    val num1: Int = 5
    val num2:Long = num1.toLong()
    print("$num2")
}
fun StringValues(){

    // This can also be used to add numbers

    var firstName = "Sizwe"
    var lastName = "Nxele"
    println(firstName.plus(lastName))
}

fun ifElse() {
    /*Kotlin supports the usual logical conditions from mathematics:

    Less than: a < b
    Less than or equal to: a <= b
    Greater than: a > b
    Greater than or equal to: a >= b
    Equal to a == b
    Not Equal to: a != b
    You can use these conditions to perform different actions for different decisions.

    Kotlin has the following conditionals:

    Use if to specify a block of code to be executed, if a specified condition is true
    Use else to specify a block of code to be executed, if the same condition is false
    Use else if to specify a new condition to test, if the first condition is false
    Use when to specify many alternative blocks of code to be executed*/

    // new if..Else statement

    var age = 28

    var ageGroup = if (age < 23) {
        "teenage"
    } else {
        "Adult"
    }

    // Or as one statement if it has a single line
    val time = 20
    val greeting = if (time < 18) "Good day." else "Good evening."

    println(ageGroup)


    // Use can also use WHEN instead if writing if statements

    val day = 7
    val selectedDay = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        2 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(" Selected day is : $selectedDay")
}

fun loops(){

    // while loop
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    // Do while the code is executed at least once
    var z = 0
    do {
        println(i)
        i++
    }
    while (z < 5)
}
fun breakContinue(){
    var index = 15
    for(i in 1..index) {
        if(i==7){
            continue // skip this loop
        }
        if(i==13){
            break // break the loop when you found what you are loking for
        }
        println(i)
    }
}


