package abstractfactory

import abstractfactory.colors.Blue
import abstractfactory.colors.Color
import abstractfactory.colors.Green
import abstractfactory.colors.Red
import abstractfactory.shapes.Shape

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