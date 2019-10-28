package zelenin.boris.common.problem.algorithms.strings

import junit.framework.Assert.assertEquals
import org.junit.Test

class SherlockAndTheValidStringTest {
    @Test
    fun test1() {
        assertEquals("NO", SherlockAndTheValidString.calculate("aabbcd"))
    }

    @Test
    fun test2() {
        assertEquals("NO", SherlockAndTheValidString.calculate("aabbccddeefghi"))
    }

    @Test
    fun test3() {
        assertEquals("YES", SherlockAndTheValidString.calculate("abcdefghhgfedecba"))
    }

    @Test
    fun test4() {
        assertEquals("YES", SherlockAndTheValidString.calculate("aab"))
    }

    @Test
    fun test5() {
        assertEquals("YES", SherlockAndTheValidString.calculate("abb"))
    }

    @Test
    fun test6() {
        assertEquals("YES", SherlockAndTheValidString.calculate("abbc"))
    }

    @Test
    fun test7() {
        assertEquals("YES", SherlockAndTheValidString.calculate("abbcc"))
    }

    @Test
    fun test8() {
        assertEquals("YES", SherlockAndTheValidString.calculate("aabbc"))
    }

    @Test
    fun test9() {
        assertEquals("YES", SherlockAndTheValidString.calculate("abcc"))
    }
}