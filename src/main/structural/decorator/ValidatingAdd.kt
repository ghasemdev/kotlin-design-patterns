package decorator

class ValidatingAdd(private val repository: StarTrekRepository) : StarTrekRepository by repository {
    override fun set(starShipName: String, captainName: String) {
        require(captainName.length < MAX_NAME_LENGTH) {
            "$captainName is longer than $MAX_NAME_LENGTH characters!"
        }
        repository[starShipName] = captainName
    }

    companion object {
        private const val MAX_NAME_LENGTH = 15
    }
}
