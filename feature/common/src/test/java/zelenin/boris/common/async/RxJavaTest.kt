package zelenin.boris.common.async

import org.junit.Assert.assertEquals
import org.junit.Test
import zelenin.boris.common.problem.CountingValleys

class RxJavaTest {
    @Test
    fun rx_CountingValleys_test1() {
        RxJava<String, Int>()
            .calculateAsync(CountingValleys, "UDDDUDUU")
            .subscribe {
                assertEquals(1, it)
            }
            .dispose()
    }

    @Test
    fun rx_CountingValleys_test2() {
        RxJava<String, Int>()
            .calculateAsync(CountingValleys, "DDUUDDUDUUUD")
            .subscribe {
                assertEquals(2, it)
            }
            .dispose()
    }
}