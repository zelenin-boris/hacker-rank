package zelenin.boris.common.problem.algorithms.recursion

import zelenin.boris.common.problem.Problem

// https://www.hackerrank.com/challenges/ctci-recursive-staircase
object Staircase : Problem<Int, Int> {
    private val preCalculated = hashMapOf<Int, Int>()

    override fun calculate(input: Int): Int =
            (getRecursionStaircase(input) % 10000000007).toInt()

    private fun getRecursionStaircase(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            2 -> 2
            3 -> 4
            else -> {
                val calculatedMinus1 = preCalculated[n - 1] ?: run {
                    val recursiveCalculate = getRecursionStaircase(n - 1)
                    preCalculated[n - 1] = recursiveCalculate
                    recursiveCalculate
                }

                val calculatedMinus2 = preCalculated[n - 2] ?: run {
                    val recursiveCalculate = getRecursionStaircase(n - 2)
                    preCalculated[n - 2] = recursiveCalculate
                    recursiveCalculate
                }

                val calculatedMinus3 = preCalculated[n - 3] ?: run {
                    val recursiveCalculate = getRecursionStaircase(n - 3)
                    preCalculated[n - 3] = recursiveCalculate
                    recursiveCalculate
                }

                calculatedMinus1 + calculatedMinus2 + calculatedMinus3
            }
        }
    }
}


//2 -> 2
//3 -> 4
//4 -> {F(3) + F(2) + F(1)} = 4 + 2 + 1 = 7
//5 -> {F(4) + F(3) + F(2)} = 7+ 4 + 2 = 13
//6 -> {F(5) + F(4) + F(3)} = 13 + 7 + 4 = 24
//7 -> {F(6) + F(5) + F(4)} = 24 + 13 + 7 = 44