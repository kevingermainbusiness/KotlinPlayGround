package delegation

import kotlin.reflect.KProperty

/**
 * Kotlin provides a mechanism of delegated properties that allows delegating the calls
 * of the property set and get methods to a certain object.
 * The delegate object in this case should have the method getValue.
 * For mutable properties, you'll also need setValue.
 * */
class Example {
    var p: String by Delegate()                                               // 1

    override fun toString() = "Example Class"
}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

// Standard Delegates
class LazySample {
    init {
        println("created!")
    }

    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }
}

// Storing properties in a Map
class User(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}


fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"


    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}")
    println(" = ${sample.lazyStr}")

    val user = User(mapOf(
            "name" to "John Doe",
            "age" to 25
    ))

    println("name = ${user.name}, age = ${user.age}")
}