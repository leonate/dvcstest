package demo

fun main(args: Array<String>) {
    neverEmpty("Leo")
    neverEmpty("")
}

fun neverEmpty(s: String) {
    require(s.length > 0, { "String must not be empty"})
    println("Hello $s")
}

