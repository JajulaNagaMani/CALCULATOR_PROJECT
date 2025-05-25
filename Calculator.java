package com.nagamani.calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener {

    private JTextField input;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";
    private final DecimalFormat df = new DecimalFormat("0.########");

    public Calculator() {
        setTitle("Java Calculator");
        setSize(450, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        input = new JTextField();
        input.setFont(new Font("Arial", Font.BOLD, 24));
        input.setHorizontalAlignment(SwingConstants.RIGHT);
        add(input, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "sin", "cos", "tan", "C",
                "log", "sqrt", "^", "←"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            if (command.matches("[0-9]") || command.equals(".")) {
                input.setText(input.getText() + command);
            } else if (command.matches("[+\\-*/^]")) {
                num1 = Double.parseDouble(input.getText());
                operator = command;
                input.setText("");
            } else if (command.equals("=")) {
                num2 = Double.parseDouble(input.getText());
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num2 != 0 ? num1 / num2 : 0; break;
                    case "^": result = Math.pow(num1, num2); break;
                }
                input.setText(df.format(result));
                operator = "";
            } else if (command.equals("C")) {
                input.setText("");
                num1 = num2 = result = 0;
                operator = "";
            } else if (command.equals("←")) {
                String text = input.getText();
                if (!text.isEmpty()) {
                    input.setText(text.substring(0, text.length() - 1));
                }
            } else if (command.equals("sin")) {
                double val = Math.toRadians(Double.parseDouble(input.getText()));
                input.setText(df.format(Math.sin(val)));
            } else if (command.equals("cos")) {
                double val = Math.toRadians(Double.parseDouble(input.getText()));
                input.setText(df.format(Math.cos(val)));
            } else if (command.equals("tan")) {
                double val = Math.toRadians(Double.parseDouble(input.getText()));
                input.setText(df.format(Math.tan(val)));
            } else if (command.equals("log")) {
                double val = Double.parseDouble(input.getText());
                input.setText(df.format(Math.log10(val)));
            } else if (command.equals("sqrt")) {
                double val = Double.parseDouble(input.getText());
                input.setText(df.format(Math.sqrt(val)));
            }
        } catch (Exception ex) {
            input.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
