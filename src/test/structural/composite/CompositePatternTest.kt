package composite

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CompositePatternTest {
    @Test
    fun composite() {
        val engDirectory = Company()
        val developer = Developer("jack", 100, "Developer")
        engDirectory.addEmployee(developer)

        val accDirectory = Company()
        val manager = Manager("elias", 200, "Sr Manager")
        accDirectory.addEmployee(manager)

        val directory = Company()
        directory.addEmployee(engDirectory)
        directory.addEmployee(accDirectory)
        directory.showEmployeeDetails()

        assertEquals("100 jack", directory.showEmployeeDetails().split("\n")[0])
    }
}