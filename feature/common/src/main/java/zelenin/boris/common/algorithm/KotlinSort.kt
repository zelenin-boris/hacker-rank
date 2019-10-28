package zelenin.boris.common.algorithm

class KotlinSort<T : Comparable<T>> : Sort<T> {
    override fun sort(list: List<T>) = list.sorted()
}