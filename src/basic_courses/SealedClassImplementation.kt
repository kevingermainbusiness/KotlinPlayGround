package basic_courses

/**
 * @param sealed lets you restrict the use of inheritance.
 * Once you declare a class sealed, it can only be subclassed from inside
 * the same file where the sealed class is declared.
 * It cannot be subclassed outside of the file where
 * the sealed class is declared.
 * */

sealed class Mammal(val name: String)

class Cat(catName: String) : Mammal(catName)
class Human(humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}