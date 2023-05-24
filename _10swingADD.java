import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _10swingADD extends JFrame implements ActionListener {
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;

    public _10swingADD() {
        setTitle("Addition Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField(10);

        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(this);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        // Create panel and add components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(addButton);
        panel.add(clearButton);
        panel.add(exitButton);

        // Add panel to the frame
        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 + num2;
                resultField.setText(Integer.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
            }
        } else if (e.getActionCommand().equals("Clear")) {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new _10swingADD();
            }
        });
    }
}
