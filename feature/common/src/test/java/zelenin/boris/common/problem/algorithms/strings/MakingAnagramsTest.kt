package zelenin.boris.common.problem.algorithms.strings

import junit.framework.Assert.assertEquals
import org.junit.Test

class MakingAnagramsTest {
    @Test
    fun test1() {
        assertEquals(4, MakingAnagrams.calculate(MakingAnagrams.Input("cde", "abc")))
    }
}