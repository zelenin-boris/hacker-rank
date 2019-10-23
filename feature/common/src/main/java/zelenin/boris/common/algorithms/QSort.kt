package zelenin.boris.common.algorithms

class QSort<T : Comparable<T>> : Sort<T> {
    override fun sort(list: List<T>): List<T> {
        when (list.size) {
            0, 1 -> return list
            2 -> return if (list[0] < list[1]) list else listOf(list[1], list[0])
            else -> {
                val anchor = list[0]
                val less = mutableListOf<T>()
                val more = mutableListOf<T>()

                for (i in 1 until list.size) {
                    if (list[i] <= anchor) less.add(list[i])
                    if (list[i] > anchor) more.add(list[i])
                }

                return QSort<T>().sort(less) + anchor + QSort<T>().sort(more)
            }
        }
    }
}