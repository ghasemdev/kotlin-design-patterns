package factory

import abstractfactory.shapes.Circle
import abstractfactory.shapes.Rectangle
import abstractfactory.shapes.Shape
import abstractfactory.shapes.Square

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