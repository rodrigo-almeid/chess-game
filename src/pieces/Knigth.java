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

    public boolean[][] possiblemoves() {
        int r = 1;
        int c = 0;
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        mat[position.getRow() + r][(position.getColumn())+ c] = true;
        return mat;
    }
}
