package decorator

class LoggingGetCaptain(private val repository: StarTrekRepository) : StarTrekRepository by repository {
    override fun get(starShipName: String): String {
        println("Getting captain for $starShipName")
        return repository[starShipName]
    }
}
