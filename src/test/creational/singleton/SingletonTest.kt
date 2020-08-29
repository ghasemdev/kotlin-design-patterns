package singleton

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SingletonTest {
    @Test
    fun singleton() {
        val db1 = DataBase.open()
        println(db1)
        val db2 = DataBase.open()
        println(db2)
        assertEquals(db1, db2)
    }
}