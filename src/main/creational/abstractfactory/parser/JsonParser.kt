package abstractfactory.parser

import abstractfactory.server.ServerConfiguration
import java.io.File

object JsonParser : Parser() {
    override fun from(file: File): ServerConfiguration {
        val regex = """(\s|\{|}|"|,)*""".toRegex()
        val lines = file.readLines()
        val propertyStrings = lines.map { it.replace(regex, EMPTY) }.subList(2, lines.lastIndex - 1)
        return server(propertyStrings)
    }

    private const val EMPTY = ""
}
