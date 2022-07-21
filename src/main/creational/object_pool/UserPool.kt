package object_pool

object UserPool : ObjectPool<User>() {

    override fun getObject(key: String?): User {
        require(poolSize > 0) { "Pool is empty" }
        return key?.let { objects[key] } ?: objects.values.last()
    }

    override fun putObject(key: String, `object`: User) {
        objects[key] = `object`
    }
}