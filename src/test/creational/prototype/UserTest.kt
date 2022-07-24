package prototype

import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertTrue

class UserTest {
    // In real application this would be a database of users
    private val allUser = mutableListOf(
        User(
            name = "Ali",
            role = Role.ADMIN,
            permissions = setOf("edit", "delete"),
            tasks = listOf("edit_users", "delete_users")
        )
    )

    @Test
    fun prototype() {
        fun createUser(name: String, role: Role) {
            for (user in allUser) {
                if (user.role == role) {
                    allUser += user.copy(name = name)
                    return
                }
            }
            // Handle case that no other user with such a role exists
        }
        createUser(name = "Reza", role = Role.ADMIN)
        val reza = User(
            name = "Reza",
            role = Role.ADMIN,
            permissions = setOf("edit", "delete"),
            tasks = listOf("edit_users", "delete_users")
        )
        assertContains(allUser, element = reza)
        assertTrue { reza.hasPermission("edit") }
        assertTrue { reza.hasPermission("delete") }
    }
}
