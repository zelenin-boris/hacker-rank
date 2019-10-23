package zelenin.boris.common.algorithms

interface Sort<T: Comparable<T>> {
    fun sort(list: List<T>): List<T>
}