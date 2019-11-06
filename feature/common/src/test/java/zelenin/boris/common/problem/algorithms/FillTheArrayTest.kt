package zelenin.boris.common.problem.algorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class FillTheArrayTest {
    @Test
    fun testEmpty() {
        val input = arrayListOf<List<Int>>()
        val output = arrayListOf<List<Int>>()

        assertEquals(output.toString(),
                FillTheArray.calculate(FillTheArray.Input(Pair(0, 0), 2, input)).toString())
    }

    @Test
    fun test1() {
        val input = arrayListOf<List<Int>>(
                arrayListOf(0, 0, 1),
                arrayListOf(0, 1, 1),
                arrayListOf(1, 1, 1)
        )

        val output = arrayListOf<List<Int>>(
                arrayListOf(2, 2, 1),
                arrayListOf(2, 1, 1),
                arrayListOf(1, 1, 1)
        )

        assertEquals(output.toString(),
                FillTheArray.calculate(FillTheArray.Input(Pair(0, 0), 2, input)).toString())
    }

    @Test
    fun test2() {
        val input = arrayListOf<List<Int>>(
                arrayListOf(1, 0, 1),
                arrayListOf(0, 0, 0),
                arrayListOf(1, 0, 1)
        )

        val output = arrayListOf<List<Int>>(
                arrayListOf(1, 2, 1),
                arrayListOf(2, 2, 2),
                arrayListOf(1, 2, 1)
        )

        assertEquals(output.toString(),
                FillTheArray.calculate(FillTheArray.Input(Pair(1, 1), 2, input)).toString())
    }

    @Test
    fun test3() {
        val input = arrayListOf<List<Int>>(
                arrayListOf(1, 1, 1),
                arrayListOf(1, 1, 1),
                arrayListOf(0, 0, 0)
        )

        val output = arrayListOf<List<Int>>(
                arrayListOf(1, 1, 1),
                arrayListOf(1, 1, 1),
                arrayListOf(2, 2, 2)
        )

        assertEquals(output.toString(),
                FillTheArray.calculate(FillTheArray.Input(Pair(2, 2), 2, input)).toString())
    }

    @Test
    fun testBig() {
        val input = arrayListOf<List<Int>>(
                arrayListOf(1, 1, 1, 1),
                arrayListOf(1, 1, 1, 1),
                arrayListOf(0, 0, 0, 0),
                arrayListOf(0, 0, 0, 0),
                arrayListOf(1, 1, 1, 1)
        )

        val output = arrayListOf<List<Int>>(
                arrayListOf(1, 1, 1, 1),
                arrayListOf(1, 1, 1, 1),
                arrayListOf(2, 2, 2, 2),
                arrayListOf(2, 2, 2, 2),
                arrayListOf(1, 1, 1, 1)
        )

        assertEquals(output.toString(),
                FillTheArray.calculate(FillTheArray.Input(Pair(2, 2), 2, input)).toString())
    }
}