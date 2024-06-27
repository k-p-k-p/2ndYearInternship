// 1.	Print the pattern
 
// 2.	Check if the number is Armstrong number or not
// 3.	Find the GCD of two numbers using Euclidean method
// 4.	Find the frequency of letters in a string
// 5.	Check if a number is duck number or not

    fun duck(){
        var number = 4252026
        var duck = 0
        while(number>0){
            if(number%10 == 0){
                duck = 1
            }
            number = number/10
        }
        println(if(duck==1) "duck number" else "not a duck number")
    }
    fun pattern(){
        var rows = 5
        for (i in 1..rows) {
        for (s in 1..rows-i) {
            print(" ")
        }
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
    for (i in rows downTo 1) {
        for (s in 1..rows-i) {
            print(" ")
        }
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
    }
    fun frequency(){
        var number = 4252626
        var copy = number
        var frequency = 0
        for(i in 0..9){
            frequency = 0
            copy = number
            while(copy>0){
                if(copy%10 == i){
                    frequency++
                }
                copy = copy/10
            }
            println("frequency of $i : $frequency")
        }

    }
    fun gcd(){
        var a = 25
        var b = 15
        var num1 = a
    	var num2 = b
    	while (num2 != 0) {
        	val temp = num2
        	num2 = num1 % num2
        	num1 = temp
    	}
        println("gcd of $a and $b is $num1")
    }
    fun armstrong() {
    	var sum = 0
    	val num = 153
    	var temp = num
    	var digit = 0

    	while (temp > 0) {
	        digit = (temp % 10).toInt()
	        sum += digit * digit * digit
	        println(digit)
	        temp /= 10
	    }
	println(if (sum == num) "armstrong" else "Not an armstrong")
    }


    fun main() {
    var num = 1212121
    var original = num
   	var rev = 0
    while(num>0){
        rev = rev * 10 + num % 10
        num = num / 10
        println(rev)
    }
    println(if(original==rev) "Pallindrome" else "Not a pallindrome")
    duck()
    pattern()
    frequency()
    armstrong()
    gcd()
   }


