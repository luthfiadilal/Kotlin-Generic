package data

class Covariant<out T>(val data: T) {
    fun ambilData(): T {
        return data
    }
}