package net.geekbinary.kotlin.fundamentals

class Person (val name: String, var age: Int) {
    fun nextAge(): Int {
        return age + 1
    }

    fun isOlderThan(other: Person): Boolean {
        return other.age < age
    }

    override fun toString(): String {
        return "$name is $age years old"
    }

    override fun equals(other: Any?): Boolean {
        return (other is Person && other.name == name )
    }
}

fun main(args: Array<String>) {
    val person1: Person = Person(name = "John Doe", age = 42)
    val person2: Person = Person(name = "John Doe", age = 2)

    println(person1 == person2)
}