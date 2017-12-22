package demo

import java.util.*

fun main(args: Array<String>) {
    val secretNumber: Int

    secretNumber = (Math.random() * 999 + 1).toInt()
    val keyboard = Scanner(System.`in`)
    var guess: Int

    do {
        println("Enter a guess (1-1000): ")
        guess = keyboard.nextInt()
        when {
            guess == secretNumber -> println("Your guess is correct!")
            guess < secretNumber -> println("Your guess is smaller than the secret number")
            guess > secretNumber -> println("Your guess is greater than the secret number")
        }
    } while (guess != secretNumber)

}
