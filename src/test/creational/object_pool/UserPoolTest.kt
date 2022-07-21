package object_pool

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class UserPoolTest {

    @Test
    fun objectPool() {
        println(measureTimeMillis {
            UserPool.putObject("user1", User("ghasem", 21, Token("token1234")))
        })

        assertEquals(1, UserPool.poolSize)

        val user: User
        println(measureTimeMillis {
            user = UserPool.getObject("user1")
        })
        assertEquals("ghasem", user.name)
    }
}