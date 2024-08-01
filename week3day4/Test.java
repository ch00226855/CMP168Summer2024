package week3day4;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        // Show a confirm dialog with Yes and No options
        int choice = JOptionPane.showConfirmDialog(
            null,                             // Parent component (null for no parent)
            "Do you want to continue?",       // Message
            "Yes/No Dialog",                  // Title
            JOptionPane.YES_NO_OPTION,        // Option type (Yes/No buttons)
            JOptionPane.QUESTION_MESSAGE      // Message type
        );

        // Check the user's choice and display a corresponding message
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You selected Yes.", "Your Choice", JOptionPane.INFORMATION_MESSAGE);
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You selected No.", "Your Choice", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No option selected!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}
