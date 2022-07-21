package abstract_factory

import abstract_factory.colors.Color
import abstract_factory.shapes.Shape

abstract class AbstractFactory {
    abstract fun getColor(type: ColorFactory.ColorType): Color?
    abstract fun getShape(type: ShapeFactory.ShapeType): Shape?

    companion object {
        inline fun <reified T : AbstractFactory> createFactory(): AbstractFactory = when (T::class) {
            ShapeFactory::class -> ShapeFactory()
            ColorFactory::class -> ColorFactory()
            else -> throw IllegalArgumentException()
        }
    }
}