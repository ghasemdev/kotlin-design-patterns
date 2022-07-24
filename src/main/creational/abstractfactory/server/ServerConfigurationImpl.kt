package abstractfactory.server

import abstractfactory.property.Property

data class ServerConfigurationImpl(
    override val properties: List<Property>
) : ServerConfiguration
