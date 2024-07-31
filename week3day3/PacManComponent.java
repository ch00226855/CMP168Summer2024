package week3day3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class PacManComponent extends JComponent {
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.YELLOW);
		g2D.fillArc(5, 5, 400, 400, 45, 270);
		
		g2D.setColor(Color.BLACK);
		g2D.fillOval(180, 100, 40, 40);
		
		g2D.setStroke(new BasicStroke(5));
		g2D.drawArc(5, 5, 400, 400, 45, 270);
	}

}
