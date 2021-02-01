package oop_courses


abstract class Person {

    open var name: String = "Kevin"
    open var age: Int = 21
    open var height: Float = 1.50F

    open fun getAge() = println(age)
    fun getName() = println(name)
    fun getHeight() = println(height)

    abstract fun takeAction()
}


class Human : Person() {

    override var name: String = "Germain Kevin"
    override var age: Int = 22
    override var height: Float = 1.7F

    override fun takeAction() {
        getAge()
        getName()
        getHeight()
    }
}

fun main() {
    Human().takeAction()
}