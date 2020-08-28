package factory.shapes

import abstractfactory.shapes.Shape

class Square : Shape {
    override fun draw(): String {
        return "Shape : Square"
    }
}