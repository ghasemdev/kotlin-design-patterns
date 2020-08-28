package abstractfactory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AbstractFactoryPatternTest {
    @Test
    fun abstractFactory() {
        var factory = AbstractFactory.createFactory<ColorFactory>()

        val blue = factory.getColor(ColorFactory.ColorType.BLUE)!!
        assertEquals("Color : Blue", blue.fill())
        val green = factory.getColor(ColorFactory.ColorType.GREEN)!!
        assertEquals("Color : Green", green.fill())
        val red = factory.getColor(ColorFactory.ColorType.RED)!!
        assertEquals("Color : Red", red.fill())

        factory = AbstractFactory.createFactory<ShapeFactory>()
        val circle = factory.getShape(ShapeFactory.ShapeType.CIRCLE)!!
        assertEquals("Shape : Circle", circle.draw())
        val rectangle = factory.getShape(ShapeFactory.ShapeType.RECTANGLE)!!
        assertEquals("Shape : Rectangle", rectangle.draw())
        val square = factory.getShape(ShapeFactory.ShapeType.SQUARE)!!
        assertEquals("Shape : Square", square.draw())
    }
}