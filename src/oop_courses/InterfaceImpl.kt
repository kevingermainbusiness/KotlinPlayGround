package oop_courses

interface TakeAction {

    fun onAdd(sum: Int)

    fun printStuff() {
        print("Stuff!")
    }
}

fun main() {

    fun addTwoItems(a: Int, b: Int) = println(a + b)

    fun addTwoItems(a: Int, b: Int, action: TakeAction) = action.onAdd((a + b))

    addTwoItems(12, 32, object : TakeAction {
        override fun onAdd(sum: Int) {
            print(sum)
        }
    })
}