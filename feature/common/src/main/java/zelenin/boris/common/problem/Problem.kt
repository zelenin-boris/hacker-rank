package zelenin.boris.common.problem

interface Problem<in INPUT, out OUTPUT> {
    fun calculate(input: INPUT): OUTPUT
}