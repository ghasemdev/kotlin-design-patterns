package adapter

fun cellPhone(chargeCable: UsbTypeC): Boolean {
    return if (chargeCable.hasPower) {
        println("I've Got the Power!")
        true
    } else {
        println("No Power")
        false
    }
}

// Power outlet exposes USPlug interface
fun usPowerOutlet() = object : USPlug {
    override val hasPower: Int = 1
}

// Charger accepts EUPlug interface and exposes UsbMini interface
fun charger(plug: EUPlug) = object : UsbMini {
    override val hasPower: Power = Power.valueOf(plug.hasPower)
}

fun USPlug.toEUPlug(): EUPlug {
    val hasPower = if (hasPower == 1) "TRUE" else "FALSE"
    return object : EUPlug {
        override val hasPower: String = hasPower
    }
}

fun UsbMini.toUsbTypeC(): UsbTypeC {
    val hasPower = this.hasPower == Power.TRUE
    return object : UsbTypeC {
        override val hasPower: Boolean = hasPower
    }
}
