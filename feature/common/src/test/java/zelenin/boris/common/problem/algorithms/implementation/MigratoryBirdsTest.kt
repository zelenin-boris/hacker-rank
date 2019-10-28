package zelenin.boris.common.problem.algorithms.implementation

import org.junit.Test
import org.junit.Assert.assertEquals

class MigratoryBirdsTest {
    @Test
    fun test1() {
        assertEquals(3, MigratoryBirds.calculate(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)))
    }

    @Test
    fun test2() {
        assertEquals(4, MigratoryBirds.calculate(arrayOf(1, 4, 4, 4, 5, 3)))
    }
}