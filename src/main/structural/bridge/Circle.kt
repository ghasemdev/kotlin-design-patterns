package bridge

import bridge.color.Color

class Circle(color: Color) : Shape(color) {
    override fun applyColor(): String {
        return "Circle filled with color " + color.applyColor()
    }
}