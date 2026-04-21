import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // Scanner (for input)
    static Scanner input = new Scanner(System.in);

    // Game state variables
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

    // UC3: Get user input
    public static int getUserInput() {

        System.out.print("Enter slot (1-9): ");
        int slot = input.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        // UC1
        char[][] board = createBoard();
        printBoard(board);

        // UC2
        toss();

        // UC3
        int userSlot = getUserInput();
        System.out.println("You selected slot: " + userSlot);
    }
}