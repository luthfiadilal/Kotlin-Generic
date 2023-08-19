package app

import data.Function
import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Luthfi", 12)
    myDataString.printData()

    val function = Function("Generic")
    function.sayHello<String>("Kotlin")




}