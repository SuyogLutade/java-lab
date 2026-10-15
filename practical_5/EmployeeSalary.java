
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeSalary extends JFrame implements ActionListener {
    JLabel nameLabel, idLabel, salaryLabel, resultLabel;
    JTextField nameField, idField, salaryField;
    JButton calculateButton;

    EmployeeSalary() {
        setTitle("Employee Salary Calculator");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        nameLabel = new JLabel("Employee Name:");
        idLabel = new JLabel("Employee ID:");
        salaryLabel = new JLabel("Basic Salary:");
        resultLabel = new JLabel("Result:");

        nameField = new JTextField();
        idField = new JTextField();
        salaryField = new JTextField();
        calculateButton = new JButton("Calculate Salary");

        add(nameLabel);
        add(nameField);
        add(idLabel);
        add(idField);
        add(salaryLabel);
        add(salaryField);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String id = idField.getText().trim();
        String salaryText = salaryField.getText().trim();

        if (name.isEmpty() || id.isEmpty() || salaryText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all fields!");
            return;
        }

        try {
            double basic = Double.parseDouble(salaryText);

            if (basic < 0) {
                JOptionPane.showMessageDialog(this,
                        "Salary cannot be negative.");
                return;
            }

            double hra = basic * 0.20;
            double da = basic * 0.10;
            double gross = basic + hra + da;

            resultLabel.setText(String.format(
                    "<html>Name: %s<br>ID: %s<br>HRA: %.2f"
                    + "<br>DA: %.2f<br>Gross Salary: %.2f</html>",
                    name, id, hra, da, gross));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Enter a valid basic salary.");
        }
    }

    public static void main(String[] args) {
        new EmployeeSalary();
    }
}
