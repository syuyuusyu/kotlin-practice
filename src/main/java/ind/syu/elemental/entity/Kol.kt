package ind.syu.elemental.entity

import kotlin.reflect.KProperty
import kotlin.js.*

open class Base(val name: String) {

    init { println("Initializing Base") }

    open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
        name: String,
        val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init { println("Initializing Derived") }



    var somthing:String ="sss"
        get() = "sdsd"
        set(value) { field = value }
        init {
            print("init something")
        }

    var some2:String = {
        print("sdsdsdsd")
        var a=1+1
        "aaa"
    }()

    var level :Int=1
    var multiple:Int=2
    var score:Int = {
          (if (this.level==1) 50 else 100)*multiple
    }()



    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

external fun eval(message: Any?): Unit

fun main() {

    var p1=Person("1")
    var p2=Person("2")

}

class Example {
    var p: String by Delegate("sdsdsd" )
}

class Delegate( val name: String) {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("$thisRef, thank you for delegating '${property.name}' to me!")
        return name
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun <T, R> Collection<T>.fold(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    this.forEach { accumulator = combine(accumulator, it) }
    return accumulator
}


class Person(val name:String){
    object NameComparator :Comparator<Person>{
        override fun compare(o1: Person, o2: Person): Int = o1.name.compareTo(o2.name)
    }
}

fun process(): Runnable {
    return Runnable { print("11111") }
}