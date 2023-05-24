import javax.swing.*;
import java.awt.*;

public class _14SwingCalculator {
   public static void main(String[] args) {
      JFrame jFrame = new JFrame("Calculator");
      jFrame.setSize(500, 500);
      JTextField textField = new JTextField();
      textField.setHorizontalAlignment(SwingConstants.RIGHT);
      jFrame.add(textField, BorderLayout.NORTH);
      JPanel jPanel = new JPanel(new GridLayout(4, 4));
      String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
      };
      for (String button : buttons) {
         JButton btn = new JButton(button);
         jPanel.add(btn);
      }
      jFrame.add(jPanel, BorderLayout.CENTER);
      jFrame.pack();
      jFrame.setVisible(true);
   }
}