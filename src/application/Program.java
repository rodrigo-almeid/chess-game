package application;

import boardgame.Board;
import boardgame.ChessPiece;
import boardgame.Position;
import chess.ChessMatch;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        System.out.println("Informe a peça a selecionar");


        sc.close();

    }
}
