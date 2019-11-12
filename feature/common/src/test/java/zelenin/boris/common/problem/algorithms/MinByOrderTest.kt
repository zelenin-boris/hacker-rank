package zelenin.boris.common.problem.algorithms

import org.junit.Assert.assertEquals
import org.junit.Test
import zelenin.boris.common.problem.MinByOrder

class MinByOrderTest {
    @Test
    fun test0() {
        val input = MinByOrder.Input(listOf(
                hashMapOf<String, Int>().apply {
                    put("a", 0)
                    put("b", 2)
                    put("c", 3)
                },
                hashMapOf<String, Int>().apply {
                    put("a", 1)
                    put("b", 2)
                    put("c", 5)
                },
                hashMapOf<String, Int>().apply {
                    put("b", 8)
                }
        ), listOf("a", "b"))

        assertEquals("{a=0, b=2, c=3}", MinByOrder.calculate(input))
    }

    @Test
    fun test1() {
        val input = MinByOrder.Input(listOf(
                hashMapOf<String, Int>().apply {
                    put("a", 0)
                    put("b", 2)
                    put("c", 3)
                },
                hashMapOf<String, Int>().apply {
                    put("a", 1)
                    put("b", 2)
                    put("c", 5)
                },
                hashMapOf<String, Int>().apply {
                    put("c", 8)
                }
        ), listOf("b", "a"))

        assertEquals("{c=8}", MinByOrder.calculate(input))
    }
}