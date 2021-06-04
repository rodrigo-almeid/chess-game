package pieces;

import boardgame.Board;
import boardgame.ChessPiece;
import chess.Color;
import lombok.*;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString (){
        return "C";
    }
}
