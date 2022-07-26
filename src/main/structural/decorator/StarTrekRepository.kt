package decorator

interface StarTrekRepository {
    operator fun get(starShipName: String): String
    operator fun set(starShipName: String, captainName: String)
}
