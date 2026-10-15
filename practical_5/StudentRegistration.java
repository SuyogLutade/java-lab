
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {
    JLabel nameLabel, rollLabel, marksLabel, resultLabel;
    JTextField nameField, rollField, marksField;
    JButton submitButton;

    StudentRegistration() {
        setTitle("Student Registration");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        nameLabel = new JLabel("Student Name:");
        rollLabel = new JLabel("Roll Number:");
        marksLabel = new JLabel("Marks:");
        resultLabel = new JLabel("Enter student details");

        nameField = new JTextField();
        rollField = new JTextField();
        marksField = new JTextField();
        submitButton = new JButton("Submit");

        add(nameLabel);
        add(nameField);
        add(rollLabel);
        add(rollField);
        add(marksLabel);
        add(marksField);
        add(new JLabel(""));
        add(submitButton);
        add(resultLabel);
        add(new JLabel(""));

        submitButton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String roll = rollField.getText().trim();
        String marksText = marksField.getText().trim();

        if (name.isEmpty() || roll.isEmpty() || marksText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all fields!");
            return;
        }

        try {
            double marks = Double.parseDouble(marksText);

            if (marks < 0 || marks > 100) {
                JOptionPane.showMessageDialog(this,
                        "Marks must be between 0 and 100.");
                return;
            }

            String grade;

            if (marks >= 90)
                grade = "A";
            else if (marks >= 75)
                grade = "B";
            else if (marks >= 60)
                grade = "C";
            else if (marks >= 40)
                grade = "D";
            else
                grade = "F";

            resultLabel.setText("<html>Name: " + name
                    + "<br>Roll No: " + roll
                    + "<br>Marks: " + marks
                    + "<br>Grade: " + grade + "</html>");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Enter valid numeric marks.");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
