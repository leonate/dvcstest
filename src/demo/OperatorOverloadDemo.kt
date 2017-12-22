package demo

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Person) compareTo(other) == 0
        else false
    }

}

fun main(args: Array<String>) {
    val p1 = Person("Leo", "Vysochyn")
    val p2 = Person("Leo", "W")
    println(p1 <= p2)
}