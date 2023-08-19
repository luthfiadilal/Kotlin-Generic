package data

class Contravariant<in T> {
    fun sayHello(param: T) {
        println("Hello $param")
    }
}