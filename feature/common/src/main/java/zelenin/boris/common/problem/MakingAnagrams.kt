package zelenin.boris.common.problem

import kotlin.math.abs

// https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
object MakingAnagrams : Problem<MakingAnagrams.Input, Int> {
    class Input(val a: String, val b: String)

    override fun calculate(input: Input): Int {
        val hashMapA = hashMapOf<Char, Int>()
        val hashMapB = hashMapOf<Char, Int>()

        val touched = hashSetOf<Char>()
        var result = 0

        input.a.forEach {
            hashMapA[it] = hashMapA.getOrDefault(it, 0) + 1
        }

        input.b.forEach {
            hashMapB[it] = hashMapB.getOrDefault(it, 0) + 1
        }

        hashMapA.forEach { (key, value) ->
            touched.add(key)
            result += abs(value - hashMapB.getOrDefault(key, 0))
        }

        hashMapB.forEach { (key, value) ->
            if (!touched.contains(key)) {
                result += abs(value - hashMapA.getOrDefault(key, 0))
            }
        }

        return result
    }
}