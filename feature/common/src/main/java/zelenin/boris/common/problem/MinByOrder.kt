package zelenin.boris.common.problem

object MinByOrder : Problem<MinByOrder.Input, String> {

    data class Input(val table: List<HashMap<String, Int>>, val columns: List<String>)

    override fun calculate(input: Input): String {
        var listOfResults = input.table.toMutableList()
        val columnIterator = input.columns.iterator()

        while (listOfResults.size != 1 && columnIterator.hasNext()) {
            val column = columnIterator.next()
            var minValue = Int.MAX_VALUE
            val newResults = mutableListOf<HashMap<String, Int>>()
            listOfResults.forEach { value ->
                val currentValue = value.getOrDefault(column, 0)
                if (currentValue < minValue) {
                    minValue = currentValue
                    newResults.clear()
                    newResults.add(value)
                } else if (currentValue == minValue) {
                    newResults.add(value)
                }
            }

            listOfResults = newResults
        }

        return listOfResults[0].toString()
    }
}