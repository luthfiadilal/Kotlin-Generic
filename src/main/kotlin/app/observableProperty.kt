package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObervableProperty<T>(param: T) : ObservableProperty<T>(param){
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int){
    var brand: String by LogObervableProperty(brand)
    var year: Int by LogObervableProperty(year)
    var owner: String by Delegates.notNull<String>()
    var description: String by Delegates.vetoable(""){ property, oldValue, newValue ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable(""){property, oldValue, newValue ->
        println("After change ${property.name} from $oldValue to $newValue")
    }

}

fun main() {
    val car = Car("Toyota", 2019)

    car.brand = "Wuling"
    println(car.brand)

    car.year = 2020
    println(car.year)

    car.description = "Desc"
    println(car.description)

    car.other = "other"
    println(car.other)

    println(car.owner)
}