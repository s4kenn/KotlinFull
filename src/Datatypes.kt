fun Datatypes() {
    /*
    var name // Error: This variable must either have a type annotation or be initialized
    name="Aditya"
    println("${name}")
    */
    var name: String
    name = "Aditya"
    println("${name}")
    // Val cannot be reassigned
    // Names can also begin with $ and _
    // Names are case sensitive
    /*
    Int --> Byte | Short | Int | Long (Diff b/w Int and Long : Int -> 2147483647 | Long -> 2147483648)
    Double --> Float | Double
    Char
    Boolean
    String
     */
    val myNum1: Float = 5.75F
    println(myNum1)
    val myNum2: Double = 19.99
    println(myNum2)
    /*
    The precision of Float is only six or seven decimal digits, while Double variables have a precision of about 15 digits.
     */
    val myNum3: Double = 12E4
    println(myNum3)
    val isKotlinFun: Boolean = true
    println("${isKotlinFun}")
    val myGrade: Char = 'B'
    println(myGrade)
    val myText: String = "Hello World"
    println(myText)
}
