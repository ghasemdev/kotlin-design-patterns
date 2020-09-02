package bridge

import bridge.color.Color

class Triangle(color: Color) : Shape(color) {
    override fun applyColor(): String {
        return "Triangle filled with color " + color.applyColor()
    }
}