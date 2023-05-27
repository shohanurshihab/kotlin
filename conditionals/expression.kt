fun main() {
    val trafficLightColor = "Black"

    var message =
            if (trafficLightColor == "Red") "Stop"
            else if (trafficLightColor == "Yellow") "Slow"
            else if (trafficLightColor == "Green") "Go" 
            else "Invalid traffic-light color"

    println(message)

    message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message)
}
