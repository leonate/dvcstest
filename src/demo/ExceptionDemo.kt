package demo

fun main(args: Array<String>) {
    val name = "Leon"
    val empty = null
    var name2: String?
    name2 = name
    val str = name2 ?: fail("Name required")
    println(str)
    val text: String = "55a"
    val number = try {
        Integer.parseInt(text)
    }catch(e: NumberFormatException){
        println("In catch")
        return
    }
    finally{
        println("In finally")
    }
    println("Final line")
}

fun fail(message: String): String {
    throw IllegalArgumentException(message)
}
