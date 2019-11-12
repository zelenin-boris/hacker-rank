package zelenin.boris.common.problem

object MinByValue : Problem<MinByValue.Input, String> {

    data class Input(val hashSet: List<HashMap<String, Int>>, val column: String)

    override fun calculate(input: Input): String {
        var minValue = Int.MAX_VALUE
        lateinit var resultHashMap: HashMap<String, Int>

        input.hashSet.forEach {
            with(it.getOrDefault(input.column, 0)) {
                if (this <= minValue) {
                    minValue = this
                    resultHashMap = it
                }
            }
        }

        return resultHashMap.toString()
    }
}