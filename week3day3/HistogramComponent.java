package week3day3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class HistogramComponent extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		// height is 60. width is 200, 150, 350
		// The start point of the first rectangle is (10, 10)
//		g2D.setColor(Color.GREEN);
		g2D.setColor(new Color(83, 94, 52));
		g2D.fillRect(10, 10, 200, 50);
		
		g2D.setColor(Color.CYAN);
		g2D.fillRect(10, 80, 150, 50);
		
		g2D.setColor(Color.DARK_GRAY);
		g2D.fillRect(10, 150, 350, 50);
		
		// Add the string "Histogram" to the window
		g2D.setColor(Color.BLACK);
		g2D.setFont(new Font("Dialog", Font.PLAIN, 20));
		g2D.drawString("Histogram", 250, 40);
	}

}
