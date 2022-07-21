package factory

import factory.shapes.Circle
import factory.shapes.Rectangle
import factory.shapes.Shape
import factory.shapes.Square

object ShapeFactory { // Factory create shapes
    enum class ShapeType {
        CIRCLE, RECTANGLE, SQUARE
    }

    fun getShape(type: ShapeType): Shape {
        return when (type) {
            ShapeType.CIRCLE -> Circle()
            ShapeType.RECTANGLE -> Rectangle()
            ShapeType.SQUARE -> Square()
        }
    }
}