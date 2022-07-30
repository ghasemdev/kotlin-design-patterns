package adapter

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PhoneTest {
    @Test
    fun adapter() {
        val isCellPhoneCharge = cellPhone(charger(usPowerOutlet().toEUPlug()).toUsbTypeC())
        assertEquals(true, isCellPhoneCharge)
    }
}
