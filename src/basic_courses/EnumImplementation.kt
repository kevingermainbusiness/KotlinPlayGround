package basic_courses

/**
 * @author Kevin Germain
 * Goal is to work around this class for a better understanding of it
 * */
enum class Color(private val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)

    fun getRgbPosition(): Int {
        return when (this) {
            RED -> 0
            GREEN -> 1
            BLUE -> 2
            YELLOW -> 3
        }
    }

    fun getRgbCode(): String? {
        return when (this.ordinal) {
            0 -> {
                println("Contains Red")
                "0xFF0000"
            }
            1 -> {
                println("Contains Green")
                "0x00FF00"
            }
            2 -> {
                println("Contains Blue")
                "0x0000FF"
            }
            3 -> {
                println("Contains Yellow")
                "0xFFFF00"
            }
            else -> null
        }
    }

    val colorItemsCount = values().size
}

fun main() {
    val red = Color.RED
    val green = Color.GREEN
    val blue = Color.BLUE
    val yellow = Color.YELLOW

    println(red.containsRed())
    println(green.containsRed())
    println(blue.containsRed())
    println(yellow.containsRed())
    println(red.getRgbCode())
    println(green.getRgbPosition())
    println(blue.colorItemsCount)
}