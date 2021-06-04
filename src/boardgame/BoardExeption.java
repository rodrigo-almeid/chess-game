package boardgame;

public class BoardExeption extends RuntimeException{

    private static final long serialVersionUID = 1L;

    BoardExeption(String msg){
        super(msg);
    }
}
