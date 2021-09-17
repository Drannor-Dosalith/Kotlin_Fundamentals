package net.geekbinary.kotlin.fundamentals

data class Point(val x: Number, val y: Number)

fun main() {
    val a = Point(1,2)
    val b = Point(1,2)
    assert(a == b)
    assert(a !== b)
    val c: Point? = null
    assert(c == null)
}
