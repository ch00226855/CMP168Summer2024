package week3day3;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*; // Import the entire swing package

public class Demo extends JFrame {
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField field1;
	
	public Demo() {// Create all components and add them to the frame.
		
		// Part 1: Create all components
		Font labelFont = new Font("Serif", Font.PLAIN, 100);
		label1 = new JLabel("Game:");
		label1.setFont(labelFont);
		
		
		label2 = new JLabel("1");
		label2.setFont(labelFont);
//		label2.setSize(100, 50);
		
		label3 = new JLabel("Start!");
		label3.setFont(labelFont);
		
		field1 = new JTextField(15);
		field1.setText("Enter a number:");
		field1.setEditable(true);
		field1.setFont(labelFont);
		
		// Part 2: Create a layout manager
		this.setLayout(new GridBagLayout());
		
		// Part 3: Add all components with the help of layout manager.
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(label1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		this.add(label2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(label3, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(field1, constraints);
	}

	public static void main(String[] args) {
		
		Demo window = new Demo();
		
		window.setTitle("Demo");
//		window.setSize(600, 400);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
		

	}

}
