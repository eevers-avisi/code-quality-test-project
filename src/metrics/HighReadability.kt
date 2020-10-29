
/**
 * Callculates and returns the fibonacci sequence
 * See https://en.wikipedia.org/wiki/Fibonacci_number for more information regarding the fibonacci sequence
 *
 *
 * @param limit digits of the fibonacci sequence to calculate. A limit lower than 3 has no effect.
 * @return ArrayList containing *limit* digits of the fibonacci sequence, with a minimum size of 3: (0, 1, 1)
 */
fun fibonacciSequenceUpTo(limit: Int): ArrayList<Int> {
    val fibonacciSeqToAnEvenLongerNameThatIsQuiteUnreadable = arrayListOf<Int>(0, 1, 1)
    var index = 1
    // -2 As the index starts two positions behind the number that is calculated in the while loop
    while (index < limit - 2) {
        fibonacciSeqToAnEvenLongerNameThatIsQuiteUnreadable.add(fibonacciSeqToAnEvenLongerNameThatIsQuiteUnreadable[index++] + fibonacciSeqToAnEvenLongerNameThatIsQuiteUnreadable[index])
    }
    return fibonacciSeqToAnEvenLongerNameThatIsQuiteUnreadable
}
