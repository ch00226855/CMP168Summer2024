package week3day3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SalaryCalculator extends JFrame implements ActionListener {
	
	// Declare all graphical components
	private JLabel label1;
	private JLabel label2;
	private JTextField field1;
	private JTextField field2;
	private JButton button1;
	
	// Construct the view
	public SalaryCalculator() {
		// Construct all components
		label1 = new JLabel("Hourly Wage: ");
		label2 = new JLabel("Yearly Salary: ");
		field1 = new JTextField("20", 15);
		field1.setEditable(true);
		field2 = new JTextField("40000", 15);
		field2.setEditable(false);
		button1 = new JButton("Calculate");
		button1.addActionListener(this);
		
		// Introduce a layout manager
		this.setLayout(new GridBagLayout());
		
		// Add all components to the window
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(label1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0; 
		this.add(field1, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(label2, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(field2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(button1, constraints);
	}

	public static void main(String[] args) {
		
		SalaryCalculator window = new SalaryCalculator();
		window.setTitle("Salary Calculator");
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

	// When the button is clicked, calculate yearly salary based on hourly wage.
	@Override
	public void actionPerformed(ActionEvent e) {
		// Read the hourly wage from field1.
		String wageStr = field1.getText();
		int wage = Integer.parseInt(wageStr);
		
		// Calculate yearly salary.
		int salary = wage * 2000;
		
		// Display yearly salary in field2.
		field2.setText("" + salary);
	}

}
