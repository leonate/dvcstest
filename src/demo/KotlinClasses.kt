package demo

fun main(args: Array<String>) {
    val bowser = Animal("Bowser", 20.0, 13.5)
    bowser.printInfo()
    val spot = Dog("Spot", 20.0, 14.5, "Leo V")
    spot.printInfo()
    val tweety = Bird("Tweety", true)
    tweety.fly(10.0)
    val wrongAnimal = Animal("Test a", 10.0, -1.0)

}

open class Animal(val name: String, var height: Double, var weight: Double){
    init{
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) {"Animal name Can't contain Number"}
        require(height > 0) { "Height must be > 0"}
        require(weight > 0) { "Weight must be > 0"}
    }
    open fun printInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}

class Dog(name: String, height: Double, weight: Double, var owner: String): Animal(name, height, weight){
    override fun printInfo(): Unit{
        println("$name is $height tall and weighs $weight and is owned by $owner")
    }
}

interface Flyable {
    var flies: Boolean
    fun fly(distMile: Double): Unit
}

class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable {
    override fun fly(distMile: Double) {
        if(flies){
            println("$name flies $distMile")
        }else{
            println("$name does not fly")
        }
    }
}