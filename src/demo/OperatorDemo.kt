package demo

data class Point(val x: Int, val y: Int)
{
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun unaryMinus(): Point {
        return Point(-x, -y)
    }

    override fun equals(obj: Any?): Boolean {
        println("In equals")
        if (obj === this ) return true
        if (obj !is Point) return false
        return obj.x ==x && obj.y == y
    }
}

fun main(args: Array<String>) {
    var point = Point(1,2)
    println(point)
    point += Point(3,4)
    println(point)
    println(-point)

    val p1 = Point(1,2)
    val p2 = Point(1,2)
    println("$p1 == $p2 : ${p1 == p2}")
}