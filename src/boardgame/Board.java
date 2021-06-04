package boardgame;



public class Board {
    private  int rows;
    private  int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns){
        if(rows <1 || columns < 1){
            throw new BoardExeption("Favor informar um tabuleiro maior que 0");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }
    public Piece piece(int row, int column){
        if (!positionExists(row,column)){
            throw new BoardExeption("Posição não existe no tabuleiro");
        }
        return pieces[row][column];
    }
    public Piece piece(Position position){
        if (!positionExists(position)){
            throw new BoardExeption("Posição não existe no tabuleiro");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardExeption ("já existe uma peça nesta posição");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    private boolean positionExists(int row,int column){
        return row >=0 && row < rows && column >=0 && column <columns;
    }
    public boolean positionExists(Position position){
       return positionExists(position.getRow(),position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardExeption("Posição não existe no tabuleiro");
        }
        return piece(position)!= null;
    }

}
