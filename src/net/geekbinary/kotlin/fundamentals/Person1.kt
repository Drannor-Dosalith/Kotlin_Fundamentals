package net.geekbinary.kotlin.fundamentals

data class Person1(val name: String,val age: Int) {
    constructor(s: String):this(s.substringBefore(delimiter = ":"), s.substringAfter(delimiter = ":").toInt() )
}

fun main(args: Array<String>) {
    val person = Person1("john:42")
    println(person)

}