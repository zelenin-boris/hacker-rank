package zelenin.boris.common.problem.algorithms.recursion

import zelenin.boris.common.problem.Problem

object Fibonacci : Problem<Int, Int> {

    override fun calculate(input: Int): Int = getRecursionFibonacci(0, 1, input)

    private fun getRecursionFibonacci(first: Int, second: Int, n: Int): Int =
            when (n) {
                0 -> 0
                1 -> second
                else -> getRecursionFibonacci(second, first + second, n - 1)
            }
}