package sem5.Game;

import java.util.Scanner;

public class CrossesVsZeros {
    
    private static final int EMPTY = 0;
    private static final int PLAYER_X = 1;
    private static final int PLAYER_O = 2;

    private static int[] board = new int[9];

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = EMPTY;
        }
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int currentPlayer = PLAYER_X;

        while (true) {
            displayBoard();
            System.out.print("Player " + (currentPlayer == PLAYER_X ? "X" : "O") + ", enter a position (1-9): ");
            int position = scanner.nextInt() - 1;

            if (position < 0 || position > 8 || board[position] != EMPTY) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[position] = currentPlayer;

            if (checkWin(currentPlayer)) {
                displayBoard();
                System.out.println("Player " + (currentPlayer == PLAYER_X ? "X" : "O") + " wins!");
                return;
            }

            if (checkDraw()) {
                displayBoard();
                System.out.println("It's a draw!");
                return;
            }

            currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
        }
    }

    private static boolean checkWin(int player) {
        // Check rows
        for (int i = 0; i < 9; i += 3) {
            if (board[i] == player && board[i + 1] == player && board[i + 2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[i] == player && board[i + 3] == player && board[i + 6] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0] == player && board[4] == player && board[8] == player) {
            return true;
        }
        if (board[2] == player && board[4] == player && board[6] == player) {
            return true;
        }

        return false;
    }

    private static boolean checkDraw() {
        for (int i = 0; i < 9; i++) {
            if (board[i] == EMPTY) {
                return false;
            }
        }
        return true;
    }

    private static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + getSymbol(board[i]) + " | " + getSymbol(board[i + 1]) + " | " + getSymbol(board[i + 2]) + " |");
            System.out.println("-------------");
        }
    }

    private static String getSymbol(int value) {
        return value == PLAYER_X ? "X" : (value == PLAYER_O ? "O" : " ");
    }
}
