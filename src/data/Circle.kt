package data

import java.lang.Exception
import kotlin.random.Random

class NegativeRadiusException : Exception("The radius can't be negative.")

open class MyShape(val shape: String) {
    var name = ""

    init {
        name = shape
    }
}

class Circle(private val radius: Double) : MyShape("Circle") {

    companion object {

        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            print(radius)
            return Circle(radius)
        }
    }

    init {
        if (radius < 0) throw NegativeRadiusException()
    }

    fun printRadius() = println("$shape is created with radius: $radius")

    fun area() = radius * radius * 3.14

    fun perimeter() = 2 * radius * 3.14

    fun printArea() = println("$shape is created with area: ${area()}")

    fun printPerimeter() = println("$shape is created with perimeter: ${perimeter()}")

    fun printRandomCircles() = randomCircle()
}