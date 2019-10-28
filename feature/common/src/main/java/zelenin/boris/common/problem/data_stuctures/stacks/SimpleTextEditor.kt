package zelenin.boris.common.problem.data_stuctures.stacks

import zelenin.boris.common.problem.Problem
import java.util.*

// https://www.hackerrank.com/challenges/simple-text-editor/problem
sealed class Command

data class UndoAppendCommand(val start: Int, val end: Int) : Command()
data class UndoDeleteCommand(val string: String) : Command()

object SimpleTextEditor : Problem<Array<Array<String>>, Array<Char>> {

    private val stringBuilder = StringBuilder()
    private val stack = Stack<Command>()

    private fun append(s: String) {
        stringBuilder.append(s)
        stack.push(UndoAppendCommand(stringBuilder.length - s.length, stringBuilder.length))

        println(stringBuilder.toString())
    }

    private fun delete(i: Int) {
        stack.push(UndoDeleteCommand(stringBuilder.substring(stringBuilder.length - i, stringBuilder.length)))
        stringBuilder.delete(stringBuilder.length - i, stringBuilder.length)

        println(stringBuilder.toString())
    }

    private fun print(i: Int) {
        println(stringBuilder[i - 1])
        output.add(stringBuilder[i - 1])
    }

    private fun undo() {
        if (stack.empty()) return

        when (val command = stack.pop()) {
            is UndoAppendCommand -> {
                stringBuilder.delete(command.start, command.end)
            }
            is UndoDeleteCommand -> {
                stringBuilder.append(command.string)
            }
        }

        println(stringBuilder.toString())
    }

    override fun calculate(input: Array<Array<String>>): Array<Char> {
        input.forEach {
            when (it[0]) {
                "1" -> append(it[1])
                "2" -> delete(it[1].toInt())
                "3" -> print(it[1].toInt())
                "4" -> undo()
            }
        }

        return output.toTypedArray()
    }

    private val output = mutableListOf<Char>()
}
