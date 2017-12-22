package demo

class Student(val name: String, var school: String = "none"){
    var age = 25
        get() = field
        set(value){
            if(value >=0 ) field = value
        }

    override fun toString(): String {
        return "Person $name"
    }

    val home = "Ukraine"

    var city : String = "n/a"
        set(value) {
            field = value
        }

}

fun main(args: Array<String>) {
    val p = Student("Leon")
    println(p.name)
    p.age = -10
    println(p.age)
    p.age = 30
    println(p.age)
    println(p.school)
    p.school = "second"
    println(p.school)
    println(p.home)
    println(p.city)
    p.city="Kiev"
    println(p.city)
}