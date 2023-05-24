import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _10swingADD {
    private JFrame frame;
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JLabel resultLabel;

    public _10swingADD() {
        // Create the frame
        frame = new JFrame("GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        // Create and add components to the frame
        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberField = new JTextField();
        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberField = new JTextField();
        JLabel resultTextLabel = new JLabel("Result:");
        resultLabel = new JLabel();

        frame.add(firstNumberLabel);
        frame.add(firstNumberField);
        frame.add(secondNumberLabel);
        frame.add(secondNumberField);
        frame.add(resultTextLabel);
        frame.add(resultLabel);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ClearButtonListener());
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonListener());

        frame.add(addButton);
        frame.add(clearButton);
        frame.add(exitButton);

        // Display the frame
        frame.setVisible(true);
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String firstNumberStr = firstNumberField.getText();
            String secondNumberStr = secondNumberField.getText();

            try {
                int firstNumber = Integer.parseInt(firstNumberStr);
                int secondNumber = Integer.parseInt(secondNumberStr);

                int sum = firstNumber + secondNumber;

                // Update the result label
                resultLabel.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid number format", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Clear the text fields and result label
            firstNumberField.setText("");
            secondNumberField.setText("");
            resultLabel.setText("");
        }
    }

    private class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Exit the application
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new _10swingADD();
    }
}
