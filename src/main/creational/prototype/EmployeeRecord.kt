package prototype

data class EmployeeRecord(
    var id: Long,
    var name: String,
    var designation: String,
    var salary: Double,
    var address: String
) : Prototype {
    override fun getClone(): Prototype {
        return EmployeeRecord(id, name, designation, salary, address)
    }
}