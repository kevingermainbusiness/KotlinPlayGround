package basic_courses

fun printMessageWithPrefix(message: String, prefix: String = "Guy") =
        println("$prefix likes $message")


fun sum(x: Int, y: Int): Int = x + y

/**
 * @param str gets repeated for as many
 * @param Int is specified
 * */
operator fun Int.times(str: String) = str.repeat(this)

/**
 * @param other gets paired with whatever
 * @param String is specified
 * */
infix fun String.onto(other: String) = Pair(this, other)

/**
 * The substring function returns a new made string named "substring"
 * specified by the given [range] of indices, like so: substring(0...10).
 * For any
 * @param String we call with this get(range: IntRange) method,
 * we will generate a substring with the given range.
 * */
operator fun String.get(range: IntRange) = substring(range)
val str = "Always forgive your enemies; nothing annoys them so much."

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

/**
 * We use the star to enter the entries varargs as varargs of Strings
 * Instead of Array<String>
 **/
fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printAllWithPrefix(
            "Hello", "Hallo", "Salut", "Hola", "你好",
            prefix = "Greeting: "
    )
    log("A", "B", "C", "D", "E", "F", "G")
}