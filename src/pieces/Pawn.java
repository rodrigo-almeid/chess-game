package pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString (){
        return "C";
    }
    @Override
    public boolean[][] possiblemoves() {
        return new boolean[0][];
    }
}
