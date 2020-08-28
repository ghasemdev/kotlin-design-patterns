interface Shape {
    fun draw(): String
}

class Circle : Shape {
    override fun draw(): String {
        return "Shape : Circle"
    }
}

class Rectangle : Shape {
    override fun draw(): String {
        return "Shape : Rectangle"
    }
}

class Square : Shape {
    override fun draw(): String {
        return "Shape : Square"
    }
}

object ShapeFactory { // Factory create shapes
    enum class ShapeType {
        CIRCLE, RECTANGLE, SQUARE
    }

    fun createShape(type: ShapeType): Shape {
        return when (type) {
            ShapeType.CIRCLE -> Circle()
            ShapeType.RECTANGLE -> Rectangle()
            ShapeType.SQUARE -> Square()
        }
    }
}