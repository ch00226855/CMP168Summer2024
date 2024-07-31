package week3day3;

import javax.swing.JFrame;

public class PacManFrame {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("PacMan");
		window.setSize(400, 450);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PacManComponent p = new PacManComponent();
		window.add(p);
		
		window.setVisible(true);
	}

}
