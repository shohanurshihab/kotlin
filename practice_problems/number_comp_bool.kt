fun main() {
    println(screenTimeComparison(timeSpentToday = 200, timeSpentYesterday = 220))
}

fun screenTimeComparison(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {

    val status = timeSpentToday > timeSpentYesterday
    return status
}
