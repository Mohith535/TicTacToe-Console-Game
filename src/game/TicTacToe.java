import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // Scanner
    static Scanner input = new Scanner(System.in);

    // Game state
    static char playerSymbol;
    static char computerSymbol;
    static String currentPlayer;

    // UC1: Create board
    public static char[][] createBoard() {

        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }

        return board;
    }

    // UC1: Print board
    public static void printBoard(char[][] board) {

        System.out.println("\nTic-Tac-Toe Board:\n");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // UC2: Toss
    public static void toss() {

        Random random = new Random();
        int tossResult = random.nextInt(2);

        if (tossResult == 0) {
            currentPlayer = "Player";
            playerSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            playerSymbol = 'O';
            computerSymbol = 'X';
        }

        System.out.println("Toss Result: " + currentPlayer + " starts!");
        System.out.println("Player Symbol: " + playerSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    // UC3: Input
    public static int getUserInput() {

        System.out.print("Enter slot (1-9): ");
        return input.nextInt();
    }

    // UC4: Convert slot
    public static int[] convertSlotToIndex(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid position! Out of bounds.");
            return false;
        }

        // Check empty cell
        if (board[row][col] != '-') {
            System.out.println("Cell already occupied!");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // UC1
        char[][] board = createBoard();
        printBoard(board);

        // UC2
        toss();

        // UC3
        int slot = getUserInput();

        // UC4
        int[] pos = convertSlotToIndex(slot);
        int row = pos[0];
        int col = pos[1];

        // UC5
        if (isValidMove(board, row, col)) {
            System.out.println("Valid move at (" + row + ", " + col + ")");
        } else {
            System.out.println("Invalid move. Try again.");
        }
    }
}