package demo

fun main(args: Array<String>) {
    val s = "Hello"
    val nullS: String? = null
    println(toUpperCase(s))
    println(toUpperCase(nullS))
}

fun toUpperCase(s: String?) = s?.toUpperCase()