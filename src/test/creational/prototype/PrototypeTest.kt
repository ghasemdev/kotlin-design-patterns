package prototype

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PrototypeTest {
    @Test
    fun prototype() {
        val e1 = EmployeeRecord(7072, "jack", "software engineer", 1000.0, "Tehran Iran")
        val e2 = e1.getClone()
        val e3 = e1.copy()
        assertEquals(e1, e2)
        println(e3)
    }
}