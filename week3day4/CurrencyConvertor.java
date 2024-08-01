package week3day4;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CurrencyConvertor extends JFrame implements ActionListener, 
		ChangeListener {
	
	// Declare all graphical components
	private JLabel label1;
	private JLabel label2;
	private JFormattedTextField field1;
//	private JTextField field2;
	private JSpinner spinner;
	private JButton button1;
	private JButton button2;
	private JTextArea area;
	private JLabel label3;
	private JSlider slider;
	
	// Construct the view
	public CurrencyConvertor() {
		// Construct all components
		label1 = new JLabel("US Dollar:");
		label2 = new JLabel("Canadian Dollar:");
		field1 = new JFormattedTextField(NumberFormat.getCurrencyInstance());
		field1.setText("$0.00");
		field1.setColumns(15);
		field1.setEditable(true);
//		field2 = new JTextField("", 15);
//		field2.setEditable(true);
		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 1000, 100);
		spinner = new JSpinner(model);
		spinner.addChangeListener(this);
		button1 = new JButton("Convert to CAD");
		button1.addActionListener(this);
		button2 = new JButton("Convert to USD");
		button2.addActionListener(this);
		area = new JTextArea(10, 15);
		area.setEditable(false);
		JScrollPane pane = new JScrollPane(area);
		label3 = new JLabel("Japanese Yen:");
		slider = new JSlider(0, 1000, 500);
		slider.addChangeListener(this);
		slider.setMajorTickSpacing(250);
		slider.setMinorTickSpacing(50);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
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
//		this.add(field2, constraints);
		this.add(spinner, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.add(button1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.add(button2, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 0;
		this.add(label3, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 1;
		this.add(slider, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		this.add(pane, constraints);
		
		
		
	}

	public static void main(String[] args) {
		
		CurrencyConvertor window = new CurrencyConvertor();
		window.setTitle("Currency Convertor");
		window.pack(); // Find the optimal size for displaying all GUI components
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
//			String usdStr = field1.getText();
//			usd = Double.parseDouble(usdStr);
			usd = ((Number) field1.getValue()).doubleValue();
			
			// Calculate the amount of CAD
			cad = usd * 1.38;
			
			// Display the result in field2.
//			field2.setText("" + cad);
			spinner.setValue(cad);
			area.append(String.format("%.2f USD = %.2f CAD\n", usd, cad));
		} else if(e.getSource() == button2) {
//			cad = Double.parseDouble(field2.getText());
			cad = Double.parseDouble("" + spinner.getValue());
			usd = cad / 1.38;
			field1.setText("" + usd);
			area.append(String.format("%.2f CAD = %.2f USD\n", cad, usd));
		}
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == slider) {
			double yen = Double.parseDouble("" + slider.getValue());
			double usd = yen / 149.56;
			area.append(String.format("%.2f Yen = %.2f USD\n", yen, usd));
		}
	}

}
