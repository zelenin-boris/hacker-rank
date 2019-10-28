package zelenin.boris.common.problem

// https://www.hackerrank.com/challenges/counting-valleys/problem
object CountingValleys : Problem<String, Int> {
    override fun calculate(input: String): Int {
        var cnt = 0
        var currentLevel = 0

        input.forEach {
            when (it) {
                'D' -> currentLevel--
                'U' -> {
                    currentLevel++
                    if (currentLevel == 0) cnt++
                }
            }
        }

        return cnt
    }
}