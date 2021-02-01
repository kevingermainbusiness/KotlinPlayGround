package basic_courses

class Animal(val name: String)

/**
 * You can define your own iterators in your classes
 * by implementing the Iterator operator in them
 * */
class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

}