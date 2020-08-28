import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FactoryPatternTest {
    @Test
    fun shapeFactory() {
        val circle = ShapeFactory.createShape(ShapeFactory.ShapeType.CIRCLE)
        assertEquals("Shape : Circle", circle.draw())

        val rectangle = ShapeFactory.createShape(ShapeFactory.ShapeType.RECTANGLE)
        assertEquals("Shape : Rectangle", rectangle.draw())

        val square = ShapeFactory.createShape(ShapeFactory.ShapeType.SQUARE)
        assertEquals("Shape : Square", square.draw())
    }
}