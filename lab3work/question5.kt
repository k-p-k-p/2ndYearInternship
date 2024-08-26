fun isDuckNumber(number: Int): Boolean 
{
    if (number <= 0) {
        return false
    }
    
    var temp = number
    var hasZero = false
    
    while (temp > 0) {
        val currentDigit = temp % 10
        if (currentDigit == 0) {
            hasZero = true
            break 
        }
        temp /= 10
    }
    
    return hasZero && number.toString()[0] != '0' 
}

fun main() 
{
    val number = 709
    val isDuck = isDuckNumber(number)
    if (isDuck) {
        println("$number is a duck number.")
    } else {
        println("$number is not a duck number.")
    }
}
i
