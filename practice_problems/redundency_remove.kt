fun main() {
    cityWeather("Ankara", 27, 31, 82)
    cityWeather("Tokyo", 32, 36, 10)
    cityWeather("Ankara", 59, 64, 2)
    cityWeather("Ankara", 50, 55, 7)
}

fun cityWeather(cityName: String, lowTemp: Int, highTemp: Int, rainChance: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainChance%")
    println()
}
