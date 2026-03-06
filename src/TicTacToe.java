import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

        printBoard(board);
        int currentPlayer = 0;
        int moveCount = 0;

        while(moveCount < 9) {

            System.out.print("Player " + (currentPlayer + 1) + " Enter row number: ");
            int row = reader.nextInt();
            System.out.print("Player " + (currentPlayer + 1) + " Enter col number: ");
            int col = reader.nextInt();

            if (row > 0 && row < 4 && col > 0 && col < 4 && board[row - 1][col - 1] == ' ') {

                if (currentPlayer == 0) {
                    board[row - 1][col - 1] = 'X';
                } else {
                    board[row - 1][col - 1] = 'O';
                }

                printBoard(board);

                boolean win = checkBoard(board, row - 1, col - 1);
                if (win) {
                    System.out.println("Player " + (currentPlayer + 1) + " has won the game");
                    break;
                }

                currentPlayer = (currentPlayer + 1) % 2;
                moveCount++;

            } else {
                System.out.println("It's not a valid number");
            }
        }
        reader.close();
    }
    private static boolean checkBoard(char[][] board, int row, int col) {
        char symbol = board[row][col];
        boolean win = true;


        for (int i = 0; i < 3; i++) {
            if (symbol != board[row][i]) {
                win = false;
            }
        }
        if (win) {
            return true;
        }

        win = true;
        for (int i = 0; i < 3; i++) {
            if (symbol != board[i][col]) {
                win = false;
            }
        }
        if (win) {
            return true;
        }

        win = true;
        for (int i = 0; i < 3; i++) {
            if (symbol != board[i][i]) {
                win = false;
            }
        }
        if (win) {
            return true;
        }

        win = true;
        for (int i = 0; i < 3; i++) {
            if (symbol != board[i][2 - i]) {
                win = false;
            }
        }
        if (win) {
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println("    1   2   3");
        System.out.println("   -----------");
        for (int row = 0; row < 3; ++row) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < 3; ++col) {
                System.out.print("|");
                System.out.print(" " + board[row][col] + " ");
                if (col == 2)
                    System.out.print("|");

            }
            System.out.println();
            System.out.println("   -----------");

        }

    }

}