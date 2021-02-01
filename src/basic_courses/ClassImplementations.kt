package basic_courses

import data.Person

fun main() {
    val kevin = Person()
    val jack = Person("Jack", "Dorsey", "Malibu,CA,USA", "+1 345 456 678")

    kevin codesWith jack
    println(kevin.getCodePartnerFirstName())

}