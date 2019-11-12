package zelenin.boris.common.problem.algorithms

import org.junit.Test
import org.junit.Assert.assertEquals
import zelenin.boris.common.problem.MinByValue

class MinByValueTest {
    @Test
    fun test0() {
        val input =MinByValue.Input(listOf(
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
                    put("с", 8)
                }
        ), "a")

        assertEquals("{с=8}", MinByValue.calculate(input))
    }

    @Test
    fun test1() {
        val input =MinByValue.Input(listOf(
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
        ), "b")

        assertEquals("{a=1, b=2, c=5}", MinByValue.calculate(input))
    }
}