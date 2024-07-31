package week3day3;

import javax.swing.JFrame;

public class EmptyFrame {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("An Empty Frame");
		
		window.setSize(400, 250);
//		window.setTitle("An Empty Frame");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Add a JComponent to the frame.
		FirstJComponent component = new FirstJComponent();
		window.add(component);

		window.setVisible(true);
	}

}
