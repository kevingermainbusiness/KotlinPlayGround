package collections

import data.Person

/**
 * Functions associateBy and groupBy build maps from the elements of a collection indexed by
 * the specified key. The key is defined in the keySelector parameter.
 * You can also specify an optional valueSelector to define what will
 * be stored in the value of the map element.
 * The difference between associateBy and groupBy is how they process objects with the same key:
 * associateBy uses the last suitable element as the value.
 * groupBy builds a list of all suitable elements and puts it in the value.
 * The returned map preserves the entry iteration order of the original collection.
 * */
object AssociateGroupByCollections {

    private val people = listOf(
            Person(firstName = "John", city = "Boston", phone = "+1-888-123456"),
            Person(firstName = "Sarah", city = "Munich", phone = "+49-777-789123"),
            Person(firstName = "Svyatoslav", city = "Saint-Petersburg", phone = "+7-999-456789"),
            Person(firstName = "Vasilisa", city = "Saint-Petersburg", phone = "+7-999-123456"))

    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(Person::phone, Person::city)
    val peopleCities = people.groupBy(Person::city, Person::firstName)
}

fun main() {
    println(AssociateGroupByCollections.phoneBook)
    println(AssociateGroupByCollections.cityBook)
    println(AssociateGroupByCollections.peopleCities)
}