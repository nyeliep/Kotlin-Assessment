fun main(args: Array<String>) {

    random("iameimana")
    println(StringVowel("Maria"))
    multiples()
    val accountDeets =CurrentAccount("0113704422","giel",45700.00)

accountDeets.details()
    accountDeets.withdraw(4556.00)










}


//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun random(str: String){
    val firstChar = str.first()
    val lastChar = str.last()
    val length = str.length

    println(firstChar)
    println(lastChar)
    println(length)
}

fun StringVowel(str: String): Boolean {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return str.isNotEmpty() && vowels.contains(str.first().toLowerCase())
}


//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
///4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun passWord(password: String) {

    if (password.length <= 8) {
        println("not a password")
    } else if (password.length > 16) {
        println("not a password")
    }
}

    //3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
// multiples of both 6 and 8 it should print out “Bingo!” (5pts)
//
fun multiples() {
        for (i in 1..1000) {
            if (i % 6 == 0 && i % 8 == 0) {
                println("Bingo!")
            } else if (i % 6 == 0) {
                println("multiple of 8")
            } else if (i % 6 == 0) {
                println("multiples of 6")
            }
        }
}
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
class CurrentAccount(var accountNumber: String, var accountName: String, var balance: Double) {
    fun deposit(amount: Double) {
                balance = +amount
                println("currentBalance is $balance")
            }
    fun withdraw(amount: Double) {
                balance = -amount
                println("balance after withdrawal is $balance")
            }
    fun  details() {
                println("Account number $accountNumber with balance $balance is operated by $accountName")
            }
        }
//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)




