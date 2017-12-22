package demo

fun main(args: Array<String>) {
    println(length("Hello"))
    val a: Any = true
    val str = a as? String
    println("After cast")
    println(str!!.length)
}

fun length(any: Any): Int {
    val str = any as String
    return str.length
}