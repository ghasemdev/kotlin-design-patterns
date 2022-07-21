package object_pool

abstract class ObjectPool<T> {
    protected val objects = hashMapOf<String, T>()
    val poolSize: Int get() = objects.size

    abstract fun getObject(key: String? = null): T
    abstract fun putObject(key: String, `object`: T)
}