public class TicTacToe {

    // Method to create and initialize board
    public static char[][] createBoard() {

        char[][] board = new char[3][3];

        // Initialize board with '-'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }

        return board;
    }

    // Method to print board
    public static void printBoard(char[][] board) {

        System.out.println("Tic-Tac-Toe Board:\n");

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create board
        char[][] board = createBoard();

        // Display board
        printBoard(board);
    }
}