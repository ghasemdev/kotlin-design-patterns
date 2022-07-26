package decorator

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class StarTrekTest {
    @Test
    fun decorator() {
        val starTrekRepository = DefaultStarTrekRepository()
        val withValidating = ValidatingAdd(starTrekRepository)
        val withLoggingAndValidating = LoggingGetCaptain(withValidating)

        assertEquals("Jean-Luc Picard", withLoggingAndValidating["USS Enterprise"])
        assertThrows<IllegalArgumentException> {
            withLoggingAndValidating["USS Voyager"] = "Kathryn Janeway"
        }
    }
}
