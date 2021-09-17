package net.geekbinary.kotlin.fundamentals

interface Greeter {
    fun hello(name: String): String
}

abstract class Person2 (val name:String): Greeter {
    abstract val age: Int
    override fun hello(name: String) = "Hello $name I'm ${this.name} and I'm ${this.age}"
    abstract fun goodbye():String
}

class Customer(val id: Int, name: String, age: Int) : Person2(name) {
    override val age: Int = age
    override fun goodbye(): String = "Goodbye!"
}

fun main(args: Array<String>) {
    val customer = Customer(1, "The Man", 32)
    println(customer.hello("Drannor"))
    println(customer.goodbye())
}