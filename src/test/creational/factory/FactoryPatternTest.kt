package factory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FactoryPatternTest {
    @Test
    fun factory() {
        val circle = ShapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE)
        assertEquals("Shape : Circle", circle.draw())

        val rectangle = ShapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE)
        assertEquals("Shape : Rectangle", rectangle.draw())

        val square = ShapeFactory.getShape(ShapeFactory.ShapeType.SQUARE)
        assertEquals("Shape : Square", square.draw())
    }
}