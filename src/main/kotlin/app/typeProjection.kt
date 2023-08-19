package app

class Container<T>(var data: T)

fun copy(from: Container<out Any>, to: Container<Any>) {
    to.data = from.data
}

fun main() {
    val container1 = Container("Luthfi")
    val container2: Container<Any> = Container("Adilal")

    copy(container1, container2)

    println(container1.data)
    println(container2.data)
}