import data.Person

interface PersonInfoProvider {

    val providerInfo: String

    fun printInfo(person: Person) {
        person.firstName = "Kevin"
        person.lastName = "Germain"
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionID(): String
}

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "Nice info"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Another string from printInfo")
    }

    override fun getSessionID(): String {
        return "Session ID"
    }
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSessionID()
}