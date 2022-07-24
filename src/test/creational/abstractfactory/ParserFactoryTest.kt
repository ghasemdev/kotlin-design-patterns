package abstractfactory

import abstractfactory.parser.JsonParser
import abstractfactory.parser.YamlParser
import abstractfactory.property.IntProperty
import abstractfactory.property.StringProperty
import abstractfactory.server.ServerConfigurationImpl
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

class ParserFactoryTest {
    @Test
    fun yaml() {
        val path = "src/test/creational/abstractfactory/configure.yml"
        val serverConfig = YamlParser.from(File(path))
        println(serverConfig)
        assertEquals(
            expected = ServerConfigurationImpl(
                listOf(
                    IntProperty(name = "port", value = 8080),
                    StringProperty(name = "environment", value = "production")
                )
            ),
            actual = serverConfig
        )
    }

    @Test
    fun json() {
        val path = "src/test/creational/abstractfactory/configure.json"
        val serverConfig = JsonParser.from(File(path))
        println(serverConfig)
        assertEquals(
            expected = ServerConfigurationImpl(
                listOf(
                    IntProperty(name = "port", value = 8080),
                    StringProperty(name = "environment", value = "production")
                )
            ),
            actual = serverConfig
        )
    }
}
