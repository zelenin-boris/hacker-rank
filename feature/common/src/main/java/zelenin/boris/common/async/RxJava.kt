package zelenin.boris.common.async

import io.reactivex.Observable
import zelenin.boris.common.problem.Problem

class RxJava<INPUT, OUTPUT> {
    fun calculateAsync(problem: Problem<INPUT, OUTPUT>, input: INPUT):
            Observable<OUTPUT> =
            Observable.fromCallable<OUTPUT> {
                problem.calculate(input)
            }
}