package zelenin.boris.common.problem.algorithms.implementation

import org.junit.Test
import org.junit.Assert.assertEquals

class CountingValleysTest {
    @Test
    fun test1() {
        assertEquals(1, CountingValleys.calculate("UDDDUDUU"))
    }

    @Test
    fun test2() {
        assertEquals(2, CountingValleys.calculate("DDUUDDUDUUUD"))
    }
}