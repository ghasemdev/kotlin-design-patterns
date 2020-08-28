package abstractfactory

import abstractfactory.colors.Color
import abstractfactory.shapes.Circle
import abstractfactory.shapes.Rectangle
import abstractfactory.shapes.Shape
import abstractfactory.shapes.Square

class ShapeFactory : AbstractFactory() { // Factory create shapes
    enum class ShapeType {
        CIRCLE, RECTANGLE, SQUARE
    }

    override fun getColor(type: ColorFactory.ColorType): Color? {
        return null
    }

    override fun getShape(type: ShapeType): Shape {
        return when (type) {
            ShapeType.CIRCLE -> Circle()
            ShapeType.RECTANGLE -> Rectangle()
            ShapeType.SQUARE -> Square()
        }
    }
}