fun main() {
    Person()
    DataTypes()
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