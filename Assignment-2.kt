// Functions
// Q1. Write a function that takes two integers and returns the larger of the two.
// Q2. Write a function sumOfList that takes a list of integers and returns the sum of all elements.
// Q3. Implement a function named isPalindrome that checks whether a given string is a palindrome (reads the same backward as forward).
// Q4. Create a function factorial that takes an integer n and returns the factorial of n using recursion.

// Class
// 1. Define a BankAccount class with properties accountNumber and balance. Implement methods deposit and withdraw to modify the balance, and getBalance to return the current balance.
// 2. Inheritance and Polymorphism:
// Create an abstract class Shape with an abstract method area. Create two subclasses Rectangle and Circle that implement the area method. Add another method perimeter in both subclasses and demonstrate polymorphism.
// 3. Interface Implementation:
// Create an interface Drawable with a method drawInfo. Implement this interface in two classes Square and Triangle and print the info about the shapes.

//fn qn 1
fun largerOfTwo(a: Int, b: Int): Int {
    return if (a > b) a else b
}
//fn qn 2
fun sumOfList(numbers: List<Int>): Int {
    return numbers.sum()
}
//fn qn 3
fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}
//fn qn 4
fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}
//classes qn 1
class BankAccount(val accountNumber: String, var balance: Double) {

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        } else {
            println("Insufficient funds")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}
//classes qn 2
abstract class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}
//clases qn 3
interface Drawable {
    fun drawInfo()
}

class Square(private val side: Double) : Drawable {
    override fun drawInfo() {
        println("Square with side $side")
    }
}

class Triangle(private val base: Double, private val height: Double) : Drawable {
    override fun drawInfo() {
        println("Triangle with base $base and height $height")
    }
}

fun main() {
  //functions qn 1
  println(largerOfTwo(3, 7))
  //functions qn 2
  val numbers = listOf(1, 2, 3, 4, 5)
  println(sumOfList(numbers)) 
  //functions qn 3
  println(isPalindrome("racecar")) 
  println(isPalindrome("hello"))
  //functions qn 5
  println(factorial(5))
  
  
  //classes qn 1
  val account = BankAccount("123456", 1000.0)
    account.deposit(500.0)
    account.withdraw(200.0)
    println(account.getBalance()) 
  
  //classes qn 2
  val shapes: List<Shape> = listOf(Rectangle(3.0, 4.0), Circle(5.0))

    for (shape in shapes) {
        println("Area: ${shape.area()}")
        println("Perimeter: ${shape.perimeter()}")
    }
  
  //classes qn 3
    val drawables: List<Drawable> = listOf(Square(4.0), Triangle(3.0, 5.0))

    for (drawable in drawables) {
        drawable.drawInfo()
    }
}
