package bridge

import bridge.color.GreenColor
import bridge.color.RedColor
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BridgePatternTest {
    @Test
    fun bridge() {
        val redTriangle: Shape = Triangle(RedColor())
        assertEquals("Triangle filled with color red.",redTriangle.applyColor())

        val greenTriangle: Shape = Triangle(GreenColor())
        assertEquals("Triangle filled with color green.",greenTriangle.applyColor())

        val redCircle: Shape = Circle(RedColor())
        assertEquals("Circle filled with color red.",redCircle.applyColor())

        val greenCircle: Shape = Circle(GreenColor())
        assertEquals("Circle filled with color green.",greenCircle.applyColor())
    }
}