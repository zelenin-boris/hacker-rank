package zelenin.boris.common.algorithms

class KotlinSort<T : Comparable<T>> : Sort<T> {
    override fun sort(list: List<T>) = list.sorted()
}