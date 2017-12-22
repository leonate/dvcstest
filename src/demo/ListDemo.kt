package demo

fun main(args: Array<String>) {
    val nonNulls = listOfNotNull(null, "a", "b", "c")
    println(nonNulls)
    println(nonNulls.size)
}