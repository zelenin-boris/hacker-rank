package zelenin.boris.common.problem.algorithms.recursion

import junit.framework.Assert.assertEquals
import org.junit.Test

class FibonacciTest {
    @Test
    fun test0() {
        assertEquals(0, Fibonacci.calculate(0))
    }

    @Test
    fun test1() {
        assertEquals(1, Fibonacci.calculate(1))
    }

    @Test
    fun test3() {
        assertEquals(2, Fibonacci.calculate(3))
    }

    @Test
    fun test6() {
        assertEquals(8, Fibonacci.calculate(6))
    }
}