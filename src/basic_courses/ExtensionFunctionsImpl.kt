package basic_courses

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = items.joinToString { it.name }

fun <T> T?.nullSafeToString() = this?.toString() ?: "THIS VARIABLE IS NULL"

fun main() {

    val order = Order(
            listOf(
                    Item("Bread", 25.0F),
                    Item("Wine", 29.0F),
                    Item("Water", 12.0F)
            )
    )

    val emptyVariable: Collection<*>? = null

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
    println(emptyVariable.nullSafeToString())

}