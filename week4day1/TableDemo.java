package week4day1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TableDemo extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton button;
	private JLabel label;
	private JTextField field;
//	private JLabel placeHolder1;
//	private JLabel placeHolder2;
	private String[] columnHeadings;
	private String[][] tableVals;
	private JTable arrayValsTable;
	
	public TableDemo() {
		button = new JButton("Find min");
		button.addActionListener(this);
		
		label = new JLabel("Min: ");
		field = new JTextField("0", 15);
//		placeHolder1 = new JLabel("Table Header");
//		placeHolder2 = new JLabel("Table body");
		
		columnHeadings = new String[] {"Element"};
		tableVals = new String[][] {{"0"}, {"0"}, {"0"}, {"0"}, {"0"}};
		arrayValsTable = new JTable(tableVals, columnHeadings);		
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets = new Insets(10, 10, 0, 0);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridwidth = 2;
		this.add(arrayValsTable.getTableHeader(), constraints);
		
		constraints.gridy = 1;
		this.add(arrayValsTable, constraints);
		
		constraints.gridy = 2;
		this.add(button, constraints);
		
		constraints.gridx = 1;
		this.add(label, constraints);
		
		constraints.gridx = 2;
		this.add(field, constraints);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 int i;               // Loop index
	      int minElement;      // Min value found
	      String strElem;      // Array element value (string)
	      int elemVal;         // Array element value (int)

//	      strElem = tableVals[0][0];              // Get table value (String)
//	      minElement = Integer.parseInt(strElem); // Convert to Integer
//
//	      // Iterate through table values to find max
//	      for (i = 1; i < tableVals.length; ++i) {
//	         strElem = tableVals[i][0];           // Get table value (String)
//	         elemVal = Integer.parseInt(strElem); // Convert to Integer
//	         if (elemVal < minElement) {          // Check if new min value found
//	              minElement = elemVal;          // If so, update min
//	         }
//	      }
	      
	      strElem = (String) arrayValsTable.getValueAt(0, 0); // Get table value (String)
	      minElement = Integer.parseInt(strElem); // Convert to Integer
	      System.out.println(minElement);
	      // Iterate through table values to find max
	      for (i = 1; i < tableVals.length; ++i) {
	         strElem = (String) arrayValsTable.getValueAt(i, 0);           // Get table value (String)
	         elemVal = Integer.parseInt(strElem); // Convert to Integer
	         System.out.println("" + i + ": " + elemVal);
	         if (elemVal < minElement) {          // Check if new min value found
	              minElement = elemVal;          // If so, update min
	         }
	      }

	      // Display minimum value
	      field.setText("" + minElement);
	}
	
	public static void main(String[] args) {
		TableDemo window = new TableDemo();
		window.setTitle("Array Minimum");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}

}
