package zelenin.boris.common.algorithm

import org.junit.Assert.assertArrayEquals
import org.junit.Test

abstract class SortTestBase<T : Comparable<T>> {
    protected abstract fun createSort(): Sort<T>
    protected val sortInstance: Sort<T> by lazy { createSort() }
}

abstract class SortIntTestBase : SortTestBase<Int>() {
    @Test
    fun sortTestInt_Zero() {
        val sortedList = sortInstance.sort(listOf())

        assertArrayEquals(arrayOf(), sortedList.toTypedArray())
    }

    @Test
    fun sortTestInt_One() {
        val sortedList = sortInstance.sort(listOf(1))

        assertArrayEquals(arrayOf(1), sortedList.toTypedArray())
    }

    @Test
    fun sortTestInt_TwoSorted() {
        val sortedList = sortInstance.sort(listOf(1, 2))

        assertArrayEquals(arrayOf(1, 2), sortedList.toTypedArray())
    }

    @Test
    fun sortTestInt_TwoNotSorted() {
        val sortedList = sortInstance.sort(listOf(2, 1))

        assertArrayEquals(arrayOf(1, 2), sortedList.toTypedArray())
    }

    @Test
    fun sortTestInt_FiveSorted() {
        val sortedList = sortInstance.sort(listOf(1, 2, 3, 4, 5))

        assertArrayEquals(arrayOf(1, 2, 3, 4, 5), sortedList.toTypedArray())
    }

    @Test
    fun sortTestInt_FiveNotSorted() {
        val sortedList = sortInstance.sort(listOf(5, 4, 3, 2, 1))

        assertArrayEquals(arrayOf(1, 2, 3, 4, 5), sortedList.toTypedArray())
    }

    @Test
    fun sortTestInt_FiveLessThenZero() {
        val sortedList = sortInstance.sort(listOf(-5, -4, -3, -1, -2))

        assertArrayEquals(arrayOf(-5, -4, -3, -2, -1), sortedList.toTypedArray())
    }
}

abstract class SortStringTestBase : SortTestBase<String>() {
    @Test
    fun sortTestString_Five() {
        val sortedList = sortInstance.sort(listOf("e", "a", "b", "c", "d"))

        assertArrayEquals(arrayOf("a", "b", "c", "d", "e"), sortedList.toTypedArray())
    }
}

class KotlinSortIntTest : SortIntTestBase() {
    override fun createSort() = KotlinSort<Int>()
}

class KotlinSortStringTest : SortStringTestBase() {
    override fun createSort() = KotlinSort<String>()
}

class QSortIntTest : SortIntTestBase() {
    override fun createSort() = QSort<Int>()
}

class QSortStringTest : SortStringTestBase() {
    override fun createSort() = QSort<String>()
}