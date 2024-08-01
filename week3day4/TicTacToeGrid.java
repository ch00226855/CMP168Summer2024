package week3day4;

// Data manager for Tic Tac Toe game
public class TicTacToeGrid {
	
	private char[][] boardData;
	private boolean player1turn;
	
	public TicTacToeGrid() {
		// Initialize the board data.
		boardData = new char[3][3];
		for (int row = 0; row < boardData.length; row++) {
			for (int col = 0; col < boardData[row].length; col++) {
				boardData[row][col] = ' ';
			}
		}
		
		player1turn = true;
	}
	
	public void placeMarker(int row, int col) {
		
		if (boardData[row][col] != ' ') {
			// If there is already a marker, do nothing.
			return;
		} else {
			// If the cell is currently empty:
			// - determine what marker to use.
			// - add the marker to the data
			boardData[row][col] = player1turn ? 'X' : 'O';
			player1turn = !player1turn;
		}
	}
	
	public String getGameStatus() {
		// If there are three makers of the same type in a row,
		// then someone is winning
		for (int i = 0; i < boardData.length; i++) {
			if ((boardData[i][0] == boardData[i][1] && 
				boardData[i][1] == boardData[i][2]) ) {
				if (boardData[i][0] == 'X') {
					return "Player1Win";
				} else if (boardData[i][0] == 'O') {
					return "Player2Win";
				}
			}
		}
		
		// If there are three makers of the same type in a column,
		// then someone is winning
		for (int i = 0; i < boardData.length; i++) {
			if ((boardData[0][i] == boardData[1][i] && 
				boardData[1][i] == boardData[2][i]) ) {
				if (boardData[0][i] == 'X') {
					return "Player1Win";
				} else if (boardData[0][i] == 'O') {
					return "Player2Win";
				}
			}
		}
		
		// If one diagonal is filled by one player, then this person
		// wins the game.
		if (boardData[0][0] == boardData[1][1] &&
			boardData[1][1] == boardData[2][2]) {
			if (boardData[0][0] == 'X') {
				return "Player1Win";
			} else if (boardData[0][0] == 'O') {
				return "Player2Win";
			}
		}
		
		if (boardData[0][2] == boardData[1][1] &&
			boardData[1][1] == boardData[2][0]) {
			if (boardData[0][2] == 'X') {
				return "Player1Win";
			} else if (boardData[0][2] == 'O') {
				return "Player2Win";
			}
		}
		
		// If the board is full (and none of the above happens),
		// then the game ends with a draw.
		boolean isBoardFull = true;
		for (int row = 0; row < boardData.length; row++) {
			for (int col = 0; col < boardData[row].length; col++) {
				if (boardData[row][col] == ' ') {
					isBoardFull = false;
				}
			}
		}
		
		if (isBoardFull) {
			return "Draw";
		} else {
			return "Ongoing";
		}
	}
	
	public char getMarker(int row, int col) {
		return boardData[row][col];
	}

}
