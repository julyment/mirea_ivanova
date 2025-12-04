package task_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private final JTextField display = new JTextField();

    private double firstOperand = 0.0;
    private String pendingOp = null;
    private boolean startNewNumber = true;

    public SimpleCalculator() {
        super("Simple Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 350);
        setLocationRelativeTo(null);

        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        ButtonListener listener = new ButtonListener();

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("SansSerif", Font.PLAIN, 18));
            btn.addActionListener(listener);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = ((JButton) e.getSource()).getText();

            if ("0123456789".contains(cmd)) {

                if (startNewNumber) {
                    display.setText(cmd);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + cmd);
                }

            } else if (".".equals(cmd)) {

                if (startNewNumber) {
                    display.setText("0.");
                    startNewNumber = false;
                } else if (!display.getText().contains(".")) {
                    display.setText(display.getText() + ".");
                }

            } else if ("+-*/".contains(cmd)) {

                applyPendingOperation();
                pendingOp = cmd;
                startNewNumber = true;

            } else if ("=".equals(cmd)) {

                applyPendingOperation();
                pendingOp = null;
                startNewNumber = true;
            }
        }
    }

    private void applyPendingOperation() {
        double current;
        try {
            current = Double.parseDouble(display.getText().isEmpty() ? "0" : display.getText());
        } catch (NumberFormatException ex) {
            display.setText("Error");
            startNewNumber = true;
            pendingOp = null;
            return;
        }

        if (pendingOp == null) {

            firstOperand = current;
        } else {
            switch (pendingOp) {
                case "+" -> firstOperand += current;
                case "-" -> firstOperand -= current;
                case "*" -> firstOperand *= current;
                case "/" -> {
                    if (current == 0) {
                        display.setText("Div by 0");
                        startNewNumber = true;
                        pendingOp = null;
                        return;
                    }
                    firstOperand /= current;
                }
            }
        }
        display.setText(Double.toString(firstOperand));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculator::new);
    }
}
