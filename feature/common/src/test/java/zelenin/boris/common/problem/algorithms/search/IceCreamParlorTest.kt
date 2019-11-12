package zelenin.boris.common.problem.algorithms.search

import org.junit.Assert.assertEquals
import org.junit.Test

class IceCreamParlorTest {
    @Test
    fun test1() {
        assertEquals("1 4", IceCreamParlor.calculate(IceCreamParlor.Input(arrayOf(1, 4, 5, 3, 2), 4)))
    }

    @Test
    fun test2() {
        assertEquals("1 2", IceCreamParlor.calculate(IceCreamParlor.Input(arrayOf(2, 2, 4, 3), 4)))
    }

    @Test
    fun test3() {
        assertEquals("3 5", IceCreamParlor.calculate(IceCreamParlor.Input(arrayOf(2, 7, 8, 5, 8, 3, 8), 16)))
    }

    @Test
    fun test4() {
        assertEquals("1 3", IceCreamParlor.calculate(IceCreamParlor.Input(arrayOf(5, 5, 3, 4, 4), 8)))
    }
}