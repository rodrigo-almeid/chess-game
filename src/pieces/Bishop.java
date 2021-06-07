package pieces;


import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {
    public Bishop(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString (){
        return "B";
    }
    @Override
    public boolean[][] possiblemoves() {
        return new boolean[0][];
    }

}
