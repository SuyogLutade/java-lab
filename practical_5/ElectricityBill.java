
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ElectricityBill extends JFrame implements ActionListener {
    JLabel nameLabel, numberLabel, unitsLabel, resultLabel;
    JTextField nameField, numberField, unitsField;
    JButton calculateButton;

    ElectricityBill() {
        setTitle("Electricity Bill Calculator");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        nameLabel = new JLabel("Customer Name:");
        numberLabel = new JLabel("Customer Number:");
        unitsLabel = new JLabel("Units Consumed:");
        resultLabel = new JLabel("Result:");

        nameField = new JTextField();
        numberField = new JTextField();
        unitsField = new JTextField();
        calculateButton = new JButton("Calculate Bill");

        add(nameLabel);
        add(nameField);
        add(numberLabel);
        add(numberField);
        add(unitsLabel);
        add(unitsField);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String number = numberField.getText().trim();
        String unitsText = unitsField.getText().trim();

        if (name.isEmpty() || number.isEmpty() || unitsText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all fields!");
            return;
        }

        try {
            double units = Double.parseDouble(unitsText);

            if (units < 0) {
                JOptionPane.showMessageDialog(this,
                        "Units cannot be negative.");
                return;
            }

            double bill;

            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 200) {
                bill = 100 * 2 + (units - 100) * 3;
            } else if (units <= 300) {
                bill = 100 * 2 + 100 * 3
                        + (units - 200) * 5;
            } else {
                bill = 100 * 2 + 100 * 3 + 100 * 5
                        + (units - 300) * 7;
            }

            resultLabel.setText(String.format(
                    "<html>Customer: %s<br>Number: %s"
                    + "<br>Units: %.2f<br>Total Bill: Rs. %.2f</html>",
                    name, number, units, bill));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Enter valid numeric units.");
        }
    }

    public static void main(String[] args) {
        new ElectricityBill();
    }
}

