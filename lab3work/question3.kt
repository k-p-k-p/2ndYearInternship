fun gcd(a: Int, b: Int): Int 
{
    var num1 = a
    var num2 = b
    
    while (num2 != 0) 
    {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }    
    return num1
}

fun main() 
{
    val number1 = 5
    val number2 = 27
    
    val Result = gcd(number1, number2)
    println("The GCD of $number1 and $number2 is $Result")
}

