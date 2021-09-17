package net.geekbinary.kotlin.fundamentals

import java.time.LocalDateTime

data class Customer2(val name: String)

interface CustomerEventListener {
    fun customerSaved(customer2: Customer2)
    fun customerDeleted(customer2: Customer2)
}
class CustomerService2 {
    companion object Comp {
        private val listeners =  mutableListOf<CustomerEventListener>()
        @JvmStatic
        fun addListener(listener: CustomerEventListener){
            listeners.add(listener)
        }
        fun removeListener(listener: CustomerEventListener){
            listeners.remove(listener)
        }
    }
    fun save(customer2: Customer2) {
        val data = gatherData(customer2)
        data.x = 43
        data.created

        listeners.forEach { listener -> listener.customerSaved(customer2)}
    }
    fun delete(customer2: Customer2) {
        listeners.forEach { listener -> listener.customerDeleted(customer2)}
    }
    private fun gatherData(customer2: Customer2) = object {
        val created = LocalDateTime.now()
        var x = 42
    }
}

fun main(args: Array<String>) {
    val service = CustomerService2()
    val serviceCompanion = CustomerService2.Comp

    CustomerService2.addListener(object : CustomerEventListener{
        override fun customerSaved(customer2: Customer2) {
            println("$customer2 saved")
        }

        override fun customerDeleted(customer2: Customer2) {
            println("$customer2 deleted")
        }
    })
    service.save(Customer2("John Doe"))
}