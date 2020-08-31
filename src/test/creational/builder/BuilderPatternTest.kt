package builder

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.awt.Color
import java.io.File

class BuilderPatternTest {
    @Test
    fun builder() {
        val dialog = Dialog.Builder {
            title {
                text = "Dialog Title"
            }
            message {
                text = "Dialog Message"
                color = Color.RED
            }
            image {
                File.createTempFile("image", "jpg")
            }
        }.build()
        dialog.show()

        assertEquals("showing title", dialog.showTitle())
        assertEquals("showing message", dialog.showMessage())
    }
}