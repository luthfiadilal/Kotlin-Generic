package app

fun displayLength(array: Array<*>) {
    println("Total panjang array: ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    val arrayString: Array<String> = arrayOf("Luthfi", "Adilal", "Mahbub")

    displayLength(arrayInt)
    displayLength(arrayString)
}