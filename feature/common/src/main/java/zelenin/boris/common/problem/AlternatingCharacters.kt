package zelenin.boris.common.problem

// https://www.hackerrank.com/challenges/alternating-characters/problem
object AlternatingCharacters : Problem<String, Int> {
    override fun calculate(input: String): Int {
        var prev = ' '
        var result = 0

        input.forEach {
            if (prev != it) {
                prev = it
            } else {
                result++
            }
        }

        return result
    }
}