package zelenin.boris.common.problem

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SimpleTextEditorTest {
    @Test
    fun test1() {
        assertArrayEquals(
                arrayOf('c', 'y', 'a'),
                SimpleTextEditor.calculate(arrayOf(
                        arrayOf("1", "abc"),
                        arrayOf("3", "3"),
                        arrayOf("2", "3"),
                        arrayOf("1", "xy"),
                        arrayOf("3", "2"),
                        arrayOf("4"),
                        arrayOf("4"),
                        arrayOf("3", "1"))))

    }
}