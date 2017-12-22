package demo

fun main(args: Array<String>) {
    val myList = listOf(1, 2, 3, 4, 5)
    val doubled: (Int) -> Int = { x -> x * 2 }
    applyAndPrint(myList, doubled)
    applyAndPrint(myList, { x -> x * 10 })
    println(doubled(100))
    val sum = fun(x: Int, y: Int) = x + y
    println(sum(1,2))
    val lambda1 = {println ("Hello world")}
    lambda1()
    val sumMoreConcise: (Int, Int) -> Int = {x, y -> x + y }
    val sumLessConcise = {x: Int, y: Int -> x + y }
    val aSumFunc : (Int, Int) -> Int
    aSumFunc = sumLessConcise
    println(aSumFunc(5, 7))
}

fun applyAndPrint(list: List<Int>, func: (Int) -> Int) {
    for (i in list) {
        println(func(i))
    }
}