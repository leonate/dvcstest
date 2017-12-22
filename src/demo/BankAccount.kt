package demo

open class BankAccount(var balance: Double){
    constructor() : this(0.0)

    open fun deposit(amount: Double) {
        balance += amount
    }

    open fun withdraw(amount: Double){
        balance -= amount
    }
    fun transfer(amount: Double, other: BankAccount){
        withdraw(amount)
        other.deposit(amount)
    }
}

class SavingsAccount(var interestRate: Double) : BankAccount() {
    fun addInterest() {
        val interest = balance * interestRate / 100
        deposit(interest)
    }
}

class CheckingAccount(var initialBalance: Double) : BankAccount(initialBalance) {
    var transactionCount = 0

    companion object {
        private val FREE_TRANSACTIONS = 3
        private const val TRANSACATION_FEE = 2.0
    }

    override fun deposit(amount: Double) {
        super.deposit(amount)
        transactionCount++
    }

    override fun withdraw(amount: Double) {
        super.withdraw(amount)
        transactionCount++
    }
    fun deductFees(){
        if (transactionCount > FREE_TRANSACTIONS){
            val fees = TRANSACATION_FEE * (transactionCount - FREE_TRANSACTIONS)
            super.withdraw(fees)
        }
        transactionCount = 0
    }
}

fun main(args: Array<String>) {
    val momsSavings = SavingsAccount(0.5)
    val dadsChecking = CheckingAccount(100.0)
    momsSavings.deposit(10000.0)
    momsSavings.transfer(2000.0, dadsChecking)
    dadsChecking.withdraw(1500.0)
    dadsChecking.withdraw(80.0)
    momsSavings.transfer(1000.0, dadsChecking)
    dadsChecking.withdraw(400.0)
    println("Mom's savings balance = \$${momsSavings.balance}")
    println("Dads checking balance = \$${dadsChecking.balance}")
}