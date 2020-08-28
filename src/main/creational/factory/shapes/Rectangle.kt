package factory.shapes

import abstractfactory.shapes.Shape

class Rectangle : Shape {
    override fun draw(): String {
        return "Shape : Rectangle"
    }
}