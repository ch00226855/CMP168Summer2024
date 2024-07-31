package week3day3;

import javax.swing.JFrame;

public class HistogramFrame {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Histogram Viewer");
		window.setSize(400, 250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HistogramComponent c = new HistogramComponent();
		window.add(c);
		
		
		window.setVisible(true);
	}

}
