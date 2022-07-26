package decorator

class DefaultStarTrekRepository : StarTrekRepository {
    private val starShipCaptains = mutableMapOf("USS Enterprise" to "Jean-Luc Picard")

    override fun get(starShipName: String): String {
        return starShipCaptains[starShipName] ?: "Unknown"
    }

    override fun set(starShipName: String, captainName: String) {
        starShipCaptains[starShipName] = captainName
    }
}
