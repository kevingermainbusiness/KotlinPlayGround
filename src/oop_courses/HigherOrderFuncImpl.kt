package oop_courses

open class OurProgram {

    var additionLambda: (Int, Int) -> Int = { res1, res2 -> res1 + res2 }

    open fun addTwoNumbers() = println(additionLambda(10, 2))


}

fun main() {
    OurProgram().addTwoNumbers()
}