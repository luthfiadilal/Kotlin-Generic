package app

import data.Contravariant

fun main() {
    val contraVariantAny = Contravariant<Any>()
    val contraVaraintString: Contravariant<String> = contraVariantAny
    contraVaraintString.sayHello("Luthfi")

}