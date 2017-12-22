package demo

fun main(args: Array<String>) {
    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }
    val mult3 = makeMathFunc(3)
    println("7 * 3 = ${mult3(7)}")
    val multiply2 = {num1: Int -> num1 * 2 }
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2, multiply2)


}

fun makeMathFunc(num1: Int) = { num2: Int -> num1 * num2 }

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }
}