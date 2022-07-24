package builder

data class Mail(
    val to: List<String>,
    val cc: List<String>? = null,
    val title: String? = null,
    val message: String? = null,
    val important: Boolean = false
) {
    fun send() = println("Mail Sent")

    class Builder(initializer: Builder.() -> Unit = {}) {
        private var to: List<String> = listOf()
        private var cc: List<String>? = null
        private var title: String? = null
        private var message: String? = null
        private var important: Boolean = false

        init {
            initializer()
        }

        fun to(to: List<String>) = apply { this.to = to }
        fun cc(cc: List<String>) = apply { this.cc = cc }
        fun title(title: String) = apply { this.title = title }
        fun message(message: String) = apply { this.message = message }
        fun important(important: Boolean) = apply { this.important = important }

        fun build(): Mail {
            require(to.isNotEmpty()) { "To property is empty" }
            return Mail(to, cc, title, message, important)
        }
    }
}

fun mail(initializer: Mail.Builder.() -> Unit) = Mail.Builder(initializer).build()
