package factory

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ChessFactoryTest {
    @Test
    fun factory() {
        val notations = listOf("pa8", "qc3")
        val pieces = mutableListOf<ChessPiece>()
        for (n in notations) {
            pieces.add(ChessFactory.createPiece(n))
        }
        println(pieces)
        assertEquals(mutableListOf(Pawn('a', '8'), Queen('c', '3')), pieces)

        assertThrows<UnknownPiece> {
            ChessFactory.createPiece("za1")
        }
    }
}
