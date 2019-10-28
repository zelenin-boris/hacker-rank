package zelenin.boris.common.problem

import junit.framework.Assert.assertEquals
import org.junit.Test

class AlternatingCharactersTest {
    @Test
    fun test1() {
        assertEquals(3, AlternatingCharacters.calculate("AAAA"))
    }

    @Test
    fun test2() {
        assertEquals(4, AlternatingCharacters.calculate("BBBBB"))
    }

    @Test
    fun test3() {
        assertEquals(0, AlternatingCharacters.calculate("ABABABAB"))
    }

    @Test
    fun test4() {
        assertEquals(0, AlternatingCharacters.calculate("BABABA"))
    }

    @Test
    fun test5() {
        assertEquals(4, AlternatingCharacters.calculate("AAABBB"))
    }
}