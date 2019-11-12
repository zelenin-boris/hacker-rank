package zelenin.boris.common.problem.algorithms.search

import zelenin.boris.common.problem.Problem

// https://www.hackerrank.com/challenges/ctci-ice-cream-parlor
object IceCreamParlor : Problem<IceCreamParlor.Input, String> {
    data class Input(val cost: Array<Int>, val money: Int)

    override fun calculate(input: Input): String {
        val hashMap = hashMapOf<Int, Int>()

        input.cost.forEachIndexed { index, key ->
            hashMap[input.money - key]?.let {
                return "$it ${index + 1}"
            }
            hashMap.compute(key) { _, value ->
                value ?: index + 1
            }
        }

        return ""
    }
}