package adapter

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AdapterPatternTest {
    @Test
    fun adapter() {
        val credit: CreditCard = BankCustomer()
        credit.generateBankDetails("CG", "Jakode", 2024)

        assertEquals(
            "The Account number 2024 of Jakode in CG bank is valid and authenticated for issuing the credit card.",
            credit.getCreditCard()
        )
    }
}