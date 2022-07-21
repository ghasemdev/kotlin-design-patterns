package abstract_factory

import abstract_factory.colors.Blue
import abstract_factory.colors.Color
import abstract_factory.colors.Green
import abstract_factory.colors.Red
import abstract_factory.shapes.Shape

class ColorFactory : AbstractFactory() { // Factory create color
    enum class ColorType {
        BLUE, GREEN, RED
    }

    override fun getColor(type: ColorType): Color {
        return when (type) {
            ColorType.BLUE -> Blue()
            ColorType.GREEN -> Green()
            ColorType.RED -> Red()
        }
    }

    override fun getShape(type: ShapeFactory.ShapeType): Shape? {
        return null
    }
}