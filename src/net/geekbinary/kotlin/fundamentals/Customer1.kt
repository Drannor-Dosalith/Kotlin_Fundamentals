package net.geekbinary.kotlin.fundamentals

import java.util.*
import kotlin.test.currentStackTrace

data class Customer1(val id: UUID, val name: String, val discount: Double)

object CustomerService {
    fun create(name: String, id: UUID = UUID.randomUUID(), discount: Double = 0.0) : Customer1{
        return Customer1(id,name, discount)
    }
}

fun main(args: Array<String>) {
    val c1 = CustomerService.create("john")
    val c2 = CustomerService.create(name="Jill", discount = 50.00)

    println(c1)
    println(c2)
}