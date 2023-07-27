//Find the maximum number form the array list
 fun main(args: Array<String>) {
//    val array = intArrayOf(18,40,67,71,84)
    print("Enter the size of the array: ")
    val size = readln().toInt()
    val array = IntArray(size)
    for (i in 0 until size) {
        print("${i + 1}-element: ")
        array[i] = readln().toInt()
    }
    var max = array[0]
    for (i in 0 until array.size) {
        if (array[i] > max) {
            max = array[i]
        }
    }
    println("Maximum element among the array list:${array.contentToString()} is $max")
}