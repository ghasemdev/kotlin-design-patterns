package abstractfactory.property

data class IntProperty(
    override val name: String,
    override val value: Int
) : Property
