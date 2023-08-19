package app

import data.Covariant

fun main() {
    val dataString = Covariant<String>("String")
    val dataAny: Covariant<Any> = dataString

    println(dataString.ambilData())
    println(dataAny.ambilData())
}