class Matrix(private val data: Array<IntArray>, private val name: String){
    init {
        printMatrix()
    }
    fun printMatrix() {
        val rows: Int = data.size
        val columns: Int = data[0].size
        println("Matrix $name:")
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                print(data[i][j])
                print(" ")
            }
            println()
        }
    }
    operator fun plus(other: Matrix): Matrix {
        val rows: Int = data.size
        val columns: Int = data[0].size
        val resultData = Array(rows) { IntArray(columns) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                resultData[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(resultData, "$name + ${other.name}")
    }
    operator fun minus(other: Matrix): Matrix {
        val rows: Int = data.size
        val columns: Int = data[0].size
        val resultData = Array(rows) { IntArray(columns) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                resultData[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(resultData, "$name - ${other.name}")
    }
    operator fun times(other: Matrix): Matrix {
        val rows: Int = data.size
        val columns: Int = data[0].size
        val resultData = Array(rows) { IntArray(other.data[0].size) }
        for (i in 0 until rows) {
            for (j in 0 until other.data[0].size) {
                var sum = 0
                for (k in 0 until columns) {
                    sum += this.data[i][k] * other.data[k][j]
                }
                resultData[i][j] = sum
            }
        }
        return Matrix(resultData, "$name * ${other.name}")
    }
}
fun main(args: Array<String>) {
    val matrixA = Matrix(arrayOf(intArrayOf(1, 3, 4), intArrayOf(6, 7, 8), intArrayOf(5, 7, 9)), "1")
    val matrixB = Matrix(arrayOf(intArrayOf(2, 4, 6), intArrayOf(1, 3, 5), intArrayOf(6, 7, 8)), "2") // Corrected to 2x3 matrix

    matrixA + matrixB
    matrixA - matrixB
    matrixA * matrixB
}