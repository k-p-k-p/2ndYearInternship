fun checkarm(number: Int): Boolean 
{
    var temp = number
    var sum = 0
    val length = number.toString().length
    while (temp != 0) 
    {
        val digit = temp % 10
        sum = sum + Math.pow(digit.toDouble(), length.toDouble()).toInt()
        temp = temp/10
    }

    return sum == number
}

fun main() 
{
    val number = 370
    if (checkarm(number)) 
    {
        println("$number is an Armstrong number.")
    } else 
    {
        println("$number is not an Armstrong number.")
    }
}
