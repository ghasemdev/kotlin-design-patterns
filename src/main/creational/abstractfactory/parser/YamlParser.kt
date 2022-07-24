package abstractfactory.parser

import abstractfactory.server.ServerConfiguration
import java.io.File

object YamlParser : Parser() {
    override fun from(file: File): ServerConfiguration {
        val propertyStrings = file.readLines().drop(1).map { it.trim() }
        return server(propertyStrings)
    }
}
