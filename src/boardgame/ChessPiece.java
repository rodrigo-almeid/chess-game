package boardgame;

import chess.Color;

public class ChessPiece extends Piece{
    private Color color;

    public ChessPiece(Position position, Board board, Color color) {
        super(position, board);
        this.color = color;
    }

    public ChessPiece(Board board, Color color) {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
