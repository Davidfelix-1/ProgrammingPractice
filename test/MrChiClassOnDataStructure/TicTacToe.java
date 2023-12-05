package MrChiClassOnDataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    private char[][]board;
    private  char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'x';
        initializeBoard();
    }
    public void initializeBoard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <3 ; j++) {
                board[i][j]='-';
            }
        }
    }
    private void printBoard(){
        System.out.println("----------------");
        for (int i = 0; i <3 ; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }
    private  boolean isBoardFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return  true;
    }
    private  boolean isGameOver(){
        return hasPlayerWon('X')||hasPlayerWon('0')||
                isBoardFull();
    }
    private boolean hasPlayerWon(char player){
        for (int i = 0; i <3 ; i++) {
            if(board[i][0]==player&&board[i][1]==player&&board[i][2]==player){
                return true;
            }
        }
        for (int i = 0; i <3 ; i++) {
            if(board[0][i]==player&&board[i][i]==player&&board[2][i]==player){
                return true;
            }
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return true;
        }
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
            return true;
        }
        return  false;
    }
    private  void  makeMove(int row, int col){
        if (row >=0 && row < 3 && col >=0 && col <3 && board[row][col]=='-') {
            board[row][col]=currentPlayer;
            currentPlayer=(currentPlayer=='X')?'0':'X';
        }
    }
    public  void  playGame(){
        Scanner scanner = new Scanner(System.in);
        while(isGameOver()){
            printBoard();
            System.out.print("Player"+currentPlayer+", enter your move (row and column)");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            makeMove(row, col);
        }
        printBoard();
        if(hasPlayerWon('X'));{
            System.out.println("Player X wins!");
        }
        if (hasPlayerWon('0')){
            System.out.println("Player 0 wins!");
        }
        else {
            System.out.println("its a tie!");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }


}
