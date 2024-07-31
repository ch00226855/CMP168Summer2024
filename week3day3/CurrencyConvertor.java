package week3day3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CurrencyConvertor extends JFrame implements ActionListener {
	
	// Declare all graphical components
	private JLabel label1;
	private JLabel label2;
	private JTextField field1;
	private JTextField field2;
	private JButton button1;
	private JButton button2;
	
	// Construct the view
	public CurrencyConvertor() {
		// Construct all components
		label1 = new JLabel("US Dollar:");
		label2 = new JLabel("Canadian Dollar:");
		field1 = new JTextField("", 15);
		field1.setEditable(true);
		field2 = new JTextField("", 15);
		field2.setEditable(true);
		button1 = new JButton("Convert to CAD");
		button1.addActionListener(this);
		button2 = new JButton("Convert to USD");
		button2.addActionListener(this);
		
		// Introduce a layout manager
		this.setLayout(new GridBagLayout());
		
		// Add all components to the window
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		this.add(label1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0; 
		this.add(label2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.add(field1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.add(field2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(button1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.add(button2, constraints);
	}

	public static void main(String[] args) {
		
		CurrencyConvertor window = new CurrencyConvertor();
		window.setTitle("Currency Convertor");
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

	// When the button is clicked, calculate yearly salary based on hourly wage.
	@Override
	public void actionPerformed(ActionEvent e) {
		double usd;
		double cad;
		
		// Identify which button has been clicked.
		if (e.getSource() == button1) {
			// Read the amount of USD from field1.
			String usdStr = field1.getText();
			usd = Double.parseDouble(usdStr);
			
			// Calculate the amount of CAD
			cad = usd * 1.38;
			
			// Display the result in field2.
			field2.setText("" + cad);
		} else if(e.getSource() == button2) {
			cad = Double.parseDouble(field2.getText());
			usd = cad / 1.38;
			field1.setText("" + usd);
		}
	}

}
