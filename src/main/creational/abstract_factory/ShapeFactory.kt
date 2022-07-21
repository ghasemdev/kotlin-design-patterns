package abstract_factory

import abstract_factory.colors.Color
import abstract_factory.shapes.Circle
import abstract_factory.shapes.Rectangle
import abstract_factory.shapes.Shape
import abstract_factory.shapes.Square

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