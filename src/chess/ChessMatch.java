package chess;

import boardgame.Board;
import boardgame.ChessPiece;
import boardgame.Position;
import pieces.King;
import pieces.Rook;


public class ChessMatch {
    private Board board;

    public ChessMatch() {
       board = new Board(8,8);
        initialSetup();
    }


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; j<board.getRows(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    private void initialSetup(){
        board.placePiece(new Rook(board,Color.BLACK), new Position(2,1));
        board.placePiece(new King(board,Color.BLACK), new Position(0,4));
        board.placePiece(new King(board,Color.WHITE), new Position(7,4));
    }
}
