package zelenin.boris.common.problem

import java.util.*

// https://www.hackerrank.com/challenges/migratory-birds/problem
object MigratoryBirds : Problem<Array<Int>, Int> {
    override fun calculate(input: Array<Int>): Int {
        val hashMap = hashMapOf<Int, Int>()
        val treeSet = TreeSet<Int>()
        var max = Int.MIN_VALUE

        input.forEach {
            val current = hashMap.getOrDefault(it, 0) + 1
            hashMap[it] = current
            if (current > max) {
                max = current
                treeSet.clear()
                treeSet.add(it)
            } else if (current == max) {
                treeSet.add(it)
            }
        }

        return treeSet.first()
    }
}