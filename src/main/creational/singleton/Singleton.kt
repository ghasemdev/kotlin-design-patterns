package singleton

object DataBase {
    init {
        println("Initialize : $this")
    }

    fun open() = "Open data base : $this"
}