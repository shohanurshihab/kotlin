fun birthdayGreeting(name: String = "Rover", age: Int): String {
    var nk= age + 3;
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $nk years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun main() {
    println(birthdayGreeting(age= 5))
    println(birthdayGreeting(age = 2, name = "Rex"))
}
