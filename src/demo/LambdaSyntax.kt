package demo

fun main(args: Array<String>) {
    val myList = listOf(1, 2, 3, 4, 5)
    println( processList(myList, { it * it}) )
    println( processList(myList) {it * it })

    val primArray = intArrayOf(1, 2, 3, 4, 5)
    println(primArray[0]::class.qualifiedName)
    println(primArray[0].javaClass)
}

fun processList(list: List<Int>, func: (Int) -> Int) : List<Int> = list.map(func)