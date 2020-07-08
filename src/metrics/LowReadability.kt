fun fibsq(int: Int): ArrayList<Int> {
    val arr = arrayListOf<Int>(0, 1, 1)
    var i = 1
    while (i < int - 2) {
        arr.add(arr[i++] + arr[i])
    }
    return arr
}
