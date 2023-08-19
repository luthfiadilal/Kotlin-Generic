package app

interface CanSayHello {
    fun sayHello(param: String)
}

open class Employee(val name: String, val age: Int)

class Manager : Employee("Luthfi", 12)

class VicePresident : Employee("Alex", 22), CanSayHello{
    override fun sayHello(param: String) {
        println("Hello $param, my name is $name")
    }
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello {

}

fun main() {
//    val data1 = Company(Manager())
    val data2 = Company(VicePresident())
//    val data3 = Company(Employee("Luthfi", 12))


    println(data2.employee.name)
    println(data2.employee.age)
    data2.employee.sayHello("Luthfi")



}