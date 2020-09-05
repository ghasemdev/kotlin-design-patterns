package composite

import java.lang.StringBuilder

class Company : Employee {
    private val employeeList: MutableList<Employee> = ArrayList()

    override fun showEmployeeDetails(): String {
        val builder = StringBuilder()
        employeeList.forEach { builder.append("${it.showEmployeeDetails()}\n") }
        return builder.toString()
    }

    fun addEmployee(employee: Employee) {
        employeeList.add(employee)
    }

    fun removeEmployee(employee: Employee) {
        employeeList.remove(employee)
    }
}