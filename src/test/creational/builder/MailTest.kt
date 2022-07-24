package builder

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MailTest {
    @Test
    fun constructor() {
        val mail = Mail(to = listOf("mail@gmail.com"), title = "What's up?")
        mail.send()
        println(mail)

        assertEquals(
            expected = Mail(to = listOf("mail@gmail.com"), title = "What's up?"),
            actual = mail
        )
    }

    @Test
    fun mailFromBuilder() {
        val mailFromBuilder = Mail.Builder()
            .to(listOf("mailFromBuilder@gmail.com"))
            .message("Hi")
            .build()
        println(mailFromBuilder)

        assertEquals(
            expected = Mail(to = listOf("mailFromBuilder@gmail.com"), message = "Hi"),
            actual = mailFromBuilder
        )
    }

    @Test
    fun mailFromDSLBuilder() {
        val mailFromDSLBuilder = Mail.Builder {
            to(listOf("mailFromDSLBuilder@gmail.com"))
            message("Hi")
        }.build()
        println(mailFromDSLBuilder)

        assertEquals(
            expected = Mail(to = listOf("mailFromDSLBuilder@gmail.com"), message = "Hi"),
            actual = mailFromDSLBuilder
        )
    }

    @Test
    fun mailFromExt() {
        val mailFromExt = mail {
            to(listOf("mailFromExt@gmail.com"))
            cc(listOf())
            title("???")
            message("Hi")
            important(true)
        }
        println(mailFromExt)

        assertEquals(
            expected = Mail(
                to = listOf("mailFromExt@gmail.com"),
                cc = listOf(),
                message = "Hi",
                title = "???",
                important = true
            ),
            actual = mailFromExt
        )
    }
}
