package com.School_Management;

import javax.swing.*;

@SuppressWarnings("serial")
public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("School Dashboard");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton addBtn = new JButton("Add Student");
        addBtn.setBounds(120, 40, 150, 30);
        add(addBtn);

        JButton viewBtn = new JButton("View Students");
        viewBtn.setBounds(120, 90, 150, 30);
        add(viewBtn);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(120, 140, 150, 30);
        add(exitBtn);

        addBtn.addActionListener(e -> new AddStudentFrame().setVisible(true));
        viewBtn.addActionListener(e -> new ViewStudentsFrame().setVisible(true));
        exitBtn.addActionListener(e -> System.exit(0));
    }
}

