package factory

data class Queen(
    override val file: Char,
    override val rank: Char
) : ChessPiece
