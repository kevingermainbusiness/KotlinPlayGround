package basic_courses

import data.Person

/**
 * @author Kevin Germain
 * */
fun main() {
    val kevin = Person() // creating an instance of the Person class

    val florina = Person("Florina", "Montenescu",
            "New York, NY", "+1 456 678 234")

    val jack = Person("Jack", "Dorsey",
            "Malibu,CA,USA", "+1 345 456 678")

    val gary = Person("Gary", "Vaynerchuck",
            "Boston,GA", "+1 546 789 234")

    val mine = Person("Mine", "Jamsly-Love",
            "Lascahobas,Centre", "+509 12 34 5678")

    kevin codesWith florina // using the infix function codesWith

    kevin.codesWith(jack, gary, mine) // this one is not an infix function

    println(kevin.getCodePartnerFirstNames()[3])

}