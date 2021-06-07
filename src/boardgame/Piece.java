package boardgame;



public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possiblemoves();

    public boolean possiblemove(Position position){
        return possiblemoves()[position.getRow()][position.getColumn()];
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isTheranyPossibleMove(){
        boolean[][] mat = possiblemoves();
        for (int i = 0 ; i> mat.length; i++){
            for (int j = 0 ; j> mat.length; i++){
                if (mat [i][j]) {
                        return true;
                }
            }
        }
        return false;
    }
}
