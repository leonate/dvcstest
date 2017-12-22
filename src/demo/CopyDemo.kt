package demo

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val c1 = Client("Leon", 80)
    val c2 = c1.copy(postalCode = 365)
    println(c1)
    println(c2)
}