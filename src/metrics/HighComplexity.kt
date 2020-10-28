
fun function1(number: Int): String {
    return if (number == 0)
        "Invalid number"
    else if (number <= 5) {
        if (number == 1 || number == 2)
            "Number too lowff"
        else if (number == 3)
            "Number correct"
        else
            "Number too high but acceptable"
    } else {
        "Number too high"
    }
}
