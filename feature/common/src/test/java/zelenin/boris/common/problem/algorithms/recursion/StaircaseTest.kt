package zelenin.boris.common.problem.algorithms.recursion

import junit.framework.Assert.assertEquals
import org.junit.Test

class StaircaseTest {
    @Test
    fun test0() {
        assertEquals(0, Staircase.calculate(0))
    }

    @Test
    fun test1() {
        assertEquals(1, Staircase.calculate(1))
    }

    @Test
    fun test3() {
        assertEquals(4, Staircase.calculate(3))
    }

    @Test
    fun test7() {
        assertEquals(44, Staircase.calculate(7))
    }
}