package data

/** @author Kevin Germain
 * Custom data class to perform query, loop and better understand the KT language
 * */
data class Person(
        var firstName: String = "",
        var lastName: String = "",
        val city: String = "",
        val phone: String = ""
) {
    var nickName: String? = null
    val likedPeople = mutableListOf<Person>()

    fun printInfo() {
        val info = (
                "First name is -> $firstName, Nickname " +
                        "is ->( ${nickName ?: "No nickname"} )" +
                        " Last name is -> $lastName")
        println(info)
    }

    infix fun likes(other: Person) {
        likedPeople.add(other)
    }

    fun getLikedPeopleFirstName(): List<String> {
        val mPeopleName = mutableListOf<String>()
        likedPeople.add(
                Person("Jack",
                        "Dorsey",
                        "Malibu,CA,USA",
                        "+1 345 456 678")
        )
        likedPeople.forEach { people ->
            mPeopleName.add(people.firstName)
        }
        return mPeopleName
    }

    /** Custom iterator to help loop through the [likedPeople]*/
    operator fun iterator(): MutableIterator<Person> {
        return likedPeople.iterator()
    }

}
