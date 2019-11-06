package zelenin.boris.common.problem.algorithms

import zelenin.boris.common.problem.Problem
import java.util.*

object FillTheArray : Problem<FillTheArray.Input, List<List<Int>>> {
    data class Input(val coordinates: Pair<Int, Int>, val newColor: Int, val array: List<List<Int>>)

    override fun calculate(input: Input): List<List<Int>> {
        if (input.array.isEmpty()) return input.array
        if (input.array[input.coordinates.second][input.coordinates.first] == input.newColor) return input.array

        val visited = hashSetOf<Pair<Int, Int>>()
        val queue: Queue<Pair<Int, Int>> = LinkedList<Pair<Int, Int>>().apply {
            add(Pair(input.coordinates.first, input.coordinates.second))
        }

        val height = input.array.size
        val width = input.array[0].size
        val oldColor = input.array[input.coordinates.second][input.coordinates.first]

        val output = mutableListOf<MutableList<Int>>()
        input.array.map {
            output.add(it.toMutableList())
        }

        while (queue.isNotEmpty()) {
            with(queue.poll()!!) {
                if (!visited.contains(this)) {
                    visited.add(this)

                    val top = Pair(this.first, this.second + 1)
                    val bottom = Pair(this.first, this.second - 1)
                    val left = Pair(this.first - 1, this.second)
                    val right = Pair(this.first + 1, this.second)

                    checkAndAddToQueue(top, queue, oldColor, input.newColor, width, height, output)
                    checkAndAddToQueue(bottom, queue, oldColor, input.newColor, width, height, output)
                    checkAndAddToQueue(left, queue, oldColor, input.newColor, width, height, output)
                    checkAndAddToQueue(right, queue, oldColor, input.newColor, width, height, output)
                }
            }
        }

        return output
    }

    private fun checkAndAddToQueue(pair: Pair<Int, Int>,
                                   queue: Queue<Pair<Int, Int>>,
                                   oldColor: Int,
                                   newColor: Int,
                                   width: Int,
                                   height: Int,
                                   output: MutableList<MutableList<Int>>) {
        if (pair.isNotOutside(width, height) &&
                output[pair.second][pair.first] == oldColor) {
            queue.add(pair)
            output[pair.second][pair.first] = newColor
        }
    }

    private fun Pair<Int, Int>.isNotOutside(width: Int, height: Int) =
            first in 0 until width && second in 0 until height
}