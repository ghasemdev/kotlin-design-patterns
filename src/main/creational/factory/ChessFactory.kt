package factory

object ChessFactory {
    fun createPiece(notation: String): ChessPiece {
        val (type, file, rank) = notation.toCharArray()
        return when (type) {
            'p' -> Pawn(file, rank)
            'q' -> Queen(file, rank)
            else -> throw UnknownPiece(type.toString())
        }
    }
}
