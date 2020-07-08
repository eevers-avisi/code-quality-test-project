
fun function2(number: Int): String {
    return when (number) {
        0 -> "Invalid number"
        1, 2 -> "Number too low"
        3 -> "Number correct"
        4, 5 -> "Number too high but acceptable"
        else -> "Number too high"
    }
}
