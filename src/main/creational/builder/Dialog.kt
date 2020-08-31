package builder

import java.awt.Color
import java.io.File

class Dialog {
    fun showTitle() = "showing title"

    fun setTitle(text: String) = println("setting title text $text")

    fun setTitleColor(color: Color) = println("setting title color ${colorToHex(color)}")

    fun showMessage() = "showing message"

    fun setMessage(text: String) = println("setting message $text")

    fun setMessageColor(color: Color) = println("setting message color ${colorToHex(color)}")

    fun showImage(bitmapBytes: ByteArray) = println("showing image with size ${bitmapBytes.size}")

    fun show() = println("showing dialog $this")

    private fun colorToHex(color: Color) = String.format("#%02x%02x%02x", color.red, color.green, color.blue)

    class Builder(initialize: Builder.() -> Unit) {
        init {
            initialize()
        }

        private var titleHolder: TextView? = null
        private var messageHolder: TextView? = null
        private var imageHolder: File? = null

        fun title(initialize: TextView.() -> Unit) {
            titleHolder = TextView().apply { initialize() }
        }

        fun message(initialize: TextView.() -> Unit) {
            messageHolder = TextView().apply { initialize() }
        }

        fun image(initialize: () -> File) {
            imageHolder = initialize()
        }

        fun build(): Dialog {
            return Dialog().apply {
                titleHolder?.apply {
                    setTitle(text)
                    setTitleColor(color)
                    println(showTitle())
                }

                messageHolder?.apply {
                    setMessage(text)
                    setMessageColor(color)
                    println(showMessage())
                }

                imageHolder?.apply {
                    showImage(readBytes())
                }
            }
        }

        class TextView {
            var text: String = ""
            var color: Color = Color.BLACK
        }
    }
}