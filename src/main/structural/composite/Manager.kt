package composite

class Manager(var name: String, var employeeId: Long, var position: String) : Employee {
    override fun showEmployeeDetails(): String {
        return "$employeeId $name"
    }
}