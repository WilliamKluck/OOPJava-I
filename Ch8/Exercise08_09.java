import java.util.Scanner;
public class Exercise08_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'1','2','3'},
						{'4','5','6'},
						{'7','8','9'}};
		char winner = playTicTacToe(board);
		
		System.out.print("The winner is " + winner);
	}
		
	public static char playTicTacToe(char[][] board) {
		int turn = 1;
		boolean isGameOver = false;
		
		System.out.println("X goes first.");
		printBoard(board);
		while(isGameOver == false) {
			nextMove(board, turn);
			turn *= -1;
			printBoard(board);
			if(isWinner(board)) {
				isGameOver = true;
			}
		}
		char winner;
		if (turn == -1) {
			winner = 'X';
		}
		else {
			winner = 'O';
		}
		return winner;
	}
	
	public static void nextMove(char[][] board, int turn) {
		Scanner input = new Scanner(System.in);
		char symbol;
		if (turn == 1) {
			symbol = 'X';
		}
		else {
			symbol = 'O';
		}
		
		System.out.println(symbol + "'s turn. Enter an numbered space: ");
		boolean isValid = true;
		while(isValid) {
			isValid = false;
			int number = input.nextInt();
			int row, column;
			do {
			switch (number) {
			case 1: row = 0; column = 0; break;
			case 2: row = 0; column = 1; break;
			case 3: row = 0; column = 2; break;
			case 4:	row = 1; column = 0; break;
			case 5: row = 1; column = 1; break;
			case 6: row = 1; column = 2; break;
			case 7: row = 2; column = 0; break;
			case 8: row = 2; column = 1; break;
			case 9: row = 2; column = 2; break;
			default: row = -1; column = -1; 
			System.out.println("Incorrect input: type a number(1-9)");
			}}while(row < 0);
			if (board[row][column] != 'X' && board[row][column] != 'O') {
				board[row][column] = symbol;
			}
			else {
				System.out.println("Incorrect input: Space already taken");
				isValid = true;
			}
		}
	}
	
	public static void printBoard(char[][] board) {
		System.out.printf("%-2c | %c | %c%n"
				        + "---|---|---%n"
				        + "%-2c | %c | %c%n"
				        + "---|---|---%n"
				        + "%-2c | %c | %c%n", 
				        board[0][0], board[0][1], board[0][2],
				        board[1][0], board[1][1], board[1][2],
				        board[2][0], board[2][1], board[2][2]);
	}
	
	public static boolean isWinner(char[][] board) {
		//check rows and columns
		for (int row = 0; row < board.length; row++) {
			int rowCount = 0;
			int columnCount = 0;
			for (int column = 0; column < board[row].length - 1; column++) {
				if(board[row][column] == board[row][column+1] && board[row][column] != ' ') {
					rowCount++;
				}
				if((board[column][row]) == (board[column+1][row]) && board[column][row] != ' ') {
					columnCount++;
				}
				if (columnCount == 2) {
					return true;
				}
				if(rowCount == 2) {
					return true;
				}
			}
		}
		//check diagonals
		int majorCount = 0;
		int minorCount = 0;
		for (int rowcol = 0; rowcol < board.length-1; rowcol++) {
			if(board[rowcol][rowcol] == board[rowcol+1][rowcol+1]) {
				majorCount++;
			}
			if(board[rowcol][board.length - 1 - rowcol] == board[rowcol + 1][board.length - rowcol - 2]) {
				minorCount++;
			}
			if(majorCount == 2) {
				return true;
			}
			if(minorCount == 2) {
				return true;
			}
		}
		return false;
	}
}
