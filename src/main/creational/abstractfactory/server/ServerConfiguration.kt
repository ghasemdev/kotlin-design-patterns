package abstractfactory.server

import abstractfactory.property.Property

interface ServerConfiguration {
    val properties: List<Property>
}
