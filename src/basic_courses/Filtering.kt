package basic_courses

import data.Shape

/**
 * @param T represents all types
 * @author Kevin Germain
 */
inline fun <T> List<T>.customFilter(crossinline evaluatesToTrue: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    this.customForEach { item ->
        if (evaluatesToTrue(item)) resultList.add(item)
    }
    return resultList
}

/**A custom implementation of the forEach extension function
 * made to better understand extensions in KT
 * [action] is a higher-order function that gets [T] as a parameter
 * each time an iteration occurs [T] gets its value (in this case T = element)
 * */
inline fun <T> Iterable<T>.customForEach(action: (T) -> Unit) {
    for (element in this) action(element)
}

inline fun List<Shape>.customShapeFilter(crossinline evaluatesToTrue: (Shape) -> (Boolean)): List<Shape> {
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (evaluatesToTrue(shape)) resultList.add(shape)
    }
    return resultList
}

inline fun List<Int>.sumUpIntegers(crossinline evaluatesToTrue: (Int) -> Boolean): List<Int> {
    val resultList = mutableListOf<Int>()
    var addUp = 0
    for (value in this) {
        if (evaluatesToTrue(value)) {
            addUp += value
            resultList.add(addUp)
        }
    }
    return resultList
}

