package zelenin.boris.common.problem.algorithms.implementation

import zelenin.boris.common.problem.Problem

// https://www.hackerrank.com/challenges/counting-valleys/problem
object CountingValleys : Problem<String, Int> {
    override fun calculate(input: String): Int {
        var cnt = 0
        var currentLevel = 0

        input.forEach {
            when (it) {
                'D' -> currentLevel--
                'U' -> {
                    currentLevel++
                    if (currentLevel == 0) cnt++
                }
            }
        }

        return cnt
    }
}