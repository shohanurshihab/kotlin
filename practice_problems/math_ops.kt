fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = sub(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(fn: Int, sn: Int): Int {
    val result = fn + sn
    return result
}
// Define sub() function below this line
fun sub(fn: Int, sn: Int): Int {
    val result = fn - sn
    return result
}
