package pieces;


import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Knigth extends ChessPiece {

    public Knigth(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString (){
        return "P";
    }

    @Override
    public boolean[][] possiblemoves() {
        return new boolean[0][];
    }
}
