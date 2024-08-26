fun Frequency(input: String): IntArray 
{
    val freq = IntArray(26) { 0 }
    for (char in input) 
    {
        if (char.isLetter()) 
        {
            val index = char.lowercaseChar() - 'a'
            freq[index]++
        }
    }

    return freq
}

fun main() 
{
    val input = "hi! my name is sadyant."
    val freq = Frequency(input)
    println("Frequency of letters in \"$input\":")
    for (i in freq.indices) 
    {
        if (freq[i] > 0) 
        {
            println("${('a' + i)}: ${freq[i]}")
        }
    }
}

