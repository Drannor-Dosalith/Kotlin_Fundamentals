package net.geekbinary.kotlin.fundamentals

import java.time.LocalTime

val strings = listOf(
    "Hello World",
    "Hello\nWorld",
    "The Time is ${LocalTime.now()}",
    """We have
    multiple lines
    in this string
""",
    """We have
        |multiple lines
        |in this string
""".trimMargin()
)

fun main(args: Array<String>) {
    strings.forEach(::println)
}