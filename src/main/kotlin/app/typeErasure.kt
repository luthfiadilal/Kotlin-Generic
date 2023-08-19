package app

class TypeErasure<T>(param: T){
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val erasure = TypeErasure("Luthfi")
    println(erasure.getData())
    val name = erasure.getData()

    val upi = erasure as TypeErasure<Int>
    val number = upi.getData()

    println(number)


}
