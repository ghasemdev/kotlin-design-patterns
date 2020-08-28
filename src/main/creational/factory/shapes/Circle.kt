package factory.shapes

import abstractfactory.shapes.Shape

class Circle : Shape {
    override fun draw(): String {
        return "Shape : Circle"
    }
}