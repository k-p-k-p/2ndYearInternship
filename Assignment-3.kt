fun reverseList(list: List<Int>): List<Int> {
    return list.reversed()
}

fun removeElementsLessThan(list: List<Int>, n: Int): List<Int> {
    return list.filter { it >= n }
}

fun stringsToLengthMap(list: List<String>): Map<String, Int> {
    return list.associateWith { it.length }
}

fun isSubset(subset: List<Int>, superset: List<Int>): Boolean {
    return subset.all { it in superset }
}

data class Person(val name: String, val age: Int)

fun sortPersons(persons: List<Person>): List<Person> {
    return persons.sortedWith(compareBy({ it.age }, { it.name }))
}

fun lengthOrNegativeOne(str: String?): Int {
    return str?.length ?: -1
}

fun nonNullIntegers(list: List<Int?>): List<Int> {
    return list.filterNotNull()
}

fun printUppercaseOrNull(str: String?) {
    str?.let { println(it.uppercase()) } ?: println("String is null")
}

data class User(val name: String?, val email: String?)

fun printUserDetails(user: User) {
    if (user.name == null || user.email == null) {
        println("Incomplete User")
    } else {
        println("User(name=${user.name}, email=${user.email})")
    }
}

fun filterStrings(list: List<Any>): List<String> {
    return list.mapNotNull { it as? String }
}

fun main() {
    val intList = listOf(1, 2, 3, 4, 5)
    println(reverseList(intList))

    println(removeElementsLessThan(intList, 3))

    val stringList = listOf("apple", "banana", "cherry")
    println(stringsToLengthMap(stringList))

    val sublist = listOf(1, 2)
    println(isSubset(sublist, intList))

    val persons = listOf(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 30))
    println(sortPersons(persons))

    val nullableString: String? = "Hello"
    println(lengthOrNegativeOne(nullableString))
    println(lengthOrNegativeOne(null))

    val nullableIntList = listOf(1, null, 2, null, 3)
    println(nonNullIntegers(nullableIntList))

    printUppercaseOrNull(nullableString)
    printUppercaseOrNull(null)

    val user1 = User("Alice", "alice@example.com")
    val user2 = User(null, "bob@example.com")
    printUserDetails(user1)
    printUserDetails(user2)

    val mixedList: List<Any> = listOf("apple", 1, "banana", 2, "cherry", 3)
    println(filterStrings(mixedList))
}
