package abstractfactory.parser

import abstractfactory.UnknownPropertyException
import abstractfactory.property.IntProperty
import abstractfactory.property.Property
import abstractfactory.property.StringProperty
import abstractfactory.server.ServerConfiguration
import abstractfactory.server.ServerConfigurationImpl
import java.io.File

abstract class Parser {
    abstract fun from(file: File): ServerConfiguration

    private fun property(prop: String): Property {
        val (name, value) = prop.split(":")

        return when (name) {
            "port" -> IntProperty(name, value.trim().toInt())
            "environment" -> StringProperty(name, value.trim())
            else -> throw UnknownPropertyException("Unknown property:$name")
        }
    }

    protected fun server(propertyStrings: List<String>): ServerConfiguration {
        val parsedProperties = mutableListOf<Property>()
        for (p in propertyStrings) {
            parsedProperties += property(p)
        }
        return ServerConfigurationImpl(parsedProperties)
    }
}
