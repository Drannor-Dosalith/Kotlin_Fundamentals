package net.geekbinary.kotlin.fundamentals

import java.awt.Color
import java.net.InetAddress
import java.net.UnknownHostException

data class Person3(val name : String, val age : Int)

fun main(args: Array<String>) {
    val p1 = Person3("John",42)
    val p2 = Person3("Jill",24)

    val oldest: Person3 = if (p1.age > p2.age) {
        println(p1)
        p1
    } else {
        println(p2)
        p2
    }
    val utils = Utils()
    val hostAlive = utils.isValidIp("vlprodesxi02.geekbinary.net")
    println("Host alive = $hostAlive")

}

class Utils() {
    fun isValidIp(host: String) = try {
        InetAddress.getByName(host)
        true
    } catch (ex: UnknownHostException) {
        false
    }

    fun getColor(person3: Person3): Color = when (person3.age) {
        1,2 -> Color.YELLOW
        18 -> Color.red
        in 30..50 -> Color.CYAN
        else -> {
            println(person3)
            Color.BLUE
        }
    }
}