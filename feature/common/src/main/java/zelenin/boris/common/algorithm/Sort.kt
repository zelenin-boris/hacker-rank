package zelenin.boris.common.algorithm

interface Sort<T: Comparable<T>> {
    fun sort(list: List<T>): List<T>
}