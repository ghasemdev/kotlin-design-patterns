package singleton

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LoggerTest {
    @Test
    fun log() {
        Logger.log("Hello World")
        Logger.log("Hello Kotlin")
        assertEquals(Logger, Logger)
    }
}
