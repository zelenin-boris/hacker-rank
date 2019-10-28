package zelenin.boris.common.problem.algorithms.strings

import zelenin.boris.common.problem.Problem

// https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
object SherlockAndTheValidString : Problem<String, String> {
    override fun calculate(input: String): String {
        val hashMapOfChars = hashMapOf<Char, Int>()
        val hashMapOfCounts = hashMapOf<Int, Int>()

        input.forEach {
            hashMapOfChars[it] = hashMapOfChars.getOrDefault(it, 0) + 1
        }

        hashMapOfChars.values.forEach {
            hashMapOfCounts[it] = hashMapOfCounts.getOrDefault(it, 0) + 1
        }

        return when (hashMapOfCounts.size) {
            1 -> "YES"
            2 -> {
                with(hashMapOfCounts.entries) {
                    if (first().key == 1 && first().value == 1
                            || last().key == 1 && last().value == 1
                            || first().key == last().key + 1 && first().value == 1
                            || first().key == last().key - 1 && last().value == 1) "YES" else  "NO"
                }
            }
            else -> "NO"
        }
    }
}