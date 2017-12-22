package demo

fun main(args: Array<String>) {
    val map = mutableMapOf<Int, Any?>()
    val map2 = mutableMapOf(1 to "Leo", 2 to "Alena")
    map[1] = "Gleb"
    map[2] = 39
    println("Map size: ${map.size}")
    map.put(3, "Gdansk")
    map.remove(2)
    for ((x, y) in map) {
        println("Key: $x Value: $y")
    }
}