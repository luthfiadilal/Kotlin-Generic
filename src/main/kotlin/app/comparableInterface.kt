package app

class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity)
    }
}

fun main() {
    val fruit1 = Fruit("Apple", 10)
    val fruit2 = Fruit("Orange", 10)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
    println(fruit1 > fruit2)
    println(fruit1 >= fruit2 )
}