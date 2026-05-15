package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidMoveException {
        Scanner reader = new Scanner(System.in);

        Board board = new Board();

        System.out.println(board);
        while (!board.isEnded()) {

            int player = board.getCurrentPlayer();

            int row = 0, col = 0;
            boolean invalidRow = false;
            do {
                System.out.print("Player " + player + " enter row number:");
                try {
                    row = Integer.valueOf(reader.nextLine());
                    invalidRow = false;
                }catch (NumberFormatException nfe) {
                    System.out.println("Invalid integer");
                    invalidRow = true;
                }
            }while (invalidRow);

            boolean invalidCol = false;
            do {
                System.out.print("Player " + player + " enter column number:");
                try {
                    col = Integer.valueOf(reader.nextLine());
                    invalidCol = false;
                }catch (NumberFormatException nfe){
                    System.out.println("Invalid integer");
                    invalidCol = true;
                }
            }while (invalidCol);





            try {
                board.move(row, col);
            }catch (InvalidMoveException ime){
                System.out.printf(ime.getMessage());
            }
            System.out.println(board);
        }


        reader.close();
    }


}