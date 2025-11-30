package com.School_Management;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class AddStudentFrame extends JFrame {

    JTextField nameField, ageField, gradeField;

    public AddStudentFrame() {
        setTitle("Add Student");
        setSize(350, 300);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 30, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 30, 150, 30);
        add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 80, 100, 30);
        add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(120, 80, 150, 30);
        add(ageField);

        JLabel gradeLabel = new JLabel("Grade:");
        gradeLabel.setBounds(20, 130, 100, 30);
        add(gradeLabel);

        gradeField = new JTextField();
        gradeField.setBounds(120, 130, 150, 30);
        add(gradeField);

        JButton saveBtn = new JButton("Save");
        saveBtn.setBounds(100, 190, 100, 30);
        add(saveBtn);

        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String grade = gradeField.getText();

                StudentData.students.add(new Student(name, age, grade));
                JOptionPane.showMessageDialog(null, "Student Added!");
                dispose();
            }
        });
    }
}

