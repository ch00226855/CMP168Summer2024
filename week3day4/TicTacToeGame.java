package week3day4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// GUI application
public class TicTacToeGame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton[][] board;
	private TicTacToeGrid grid;
	
	public TicTacToeGame() {
		// Create the grid object.
		grid = new TicTacToeGrid();
		
		// Initialize the button array
		board = new JButton[3][3];
		
		// Initialize all JButton's
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = new JButton("");
				board[row][col].setPreferredSize(new Dimension(200, 200));
				board[row][col].addActionListener(this);
			}
		}
		
		// Create a layout manager
		this.setLayout(new GridBagLayout());
		
		// Add all components to the frame
		GridBagConstraints constraints = new GridBagConstraints();
		
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				constraints.gridx = col;
				constraints.gridy = row;
				this.add(board[row][col], constraints);
			}
		}
	}
	
	public static void main(String[] args) {
		TicTacToeGame window = new TicTacToeGame();
		window.setTitle("Tic Tac Toe");
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Determine the row and col index of the button
		int buttonRow = -1;
		int buttonCol = -1;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (e.getSource() == board[row][col]) {
					buttonRow = row;
					buttonCol = col;
				}
			}
		}
		
		// Invoke placeMarker() from the grid object.
		grid.placeMarker(buttonRow, buttonCol);
		
		// Invoke getMarker() and update the display
		board[buttonRow][buttonCol].setFont(
				new Font("SansSerif", Font.PLAIN, 150));
		board[buttonRow][buttonCol].setText(
				"" + grid.getMarker(buttonRow, buttonCol));
		
		// Invoke getGameStatus() and determine what to do next
		switch(grid.getGameStatus()) {
		case "Player1Win":
			JOptionPane.showMessageDialog(this, "Player 1 wins the game!");
			handleEndGame();
			break;
		case "Player2Win":
			JOptionPane.showMessageDialog(this, "Player 2 wins the game!");
			handleEndGame();
			break;
		case "Draw":
			JOptionPane.showMessageDialog(this, "The game ends with a draw.");
			handleEndGame();
			break;
		default:
			break;
		}

	}
	
	private void handleEndGame() {
		int choice = JOptionPane.showConfirmDialog(
	            this,                             // Parent component (null for no parent)
	            "New Game?",       // Message
	            "Game Over",                  // Title
	            JOptionPane.YES_NO_OPTION,        // Option type (Yes/No buttons)
	            JOptionPane.QUESTION_MESSAGE      // Message type
	        );
		if (choice == JOptionPane.YES_OPTION) {
			// Reset the model
			grid = new TicTacToeGrid();
			// Reset the view
			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board[row].length; col++) {
					board[row][col].setText("");
				}
			}
		} else {
			System.exit(0);
		}
	}
}
