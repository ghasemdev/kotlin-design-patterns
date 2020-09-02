package bridge

import bridge.color.Color

abstract class Shape(protected var color: Color /*implementor*/) {
    abstract fun applyColor():String
}