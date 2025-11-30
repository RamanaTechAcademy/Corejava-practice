package com.School_Management;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {

    JTextField userField;
    JPasswordField passField;

    public LoginFrame() {
        setTitle("School Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 100, 30);
        add(userLabel);

        userField = new JTextField();
        userField.setBounds(120, 20, 120, 30);
        add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 70, 100, 30);
        add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(120, 70, 120, 30);
        add(passField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(90, 120, 100, 30);
        add(loginBtn);

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String u = userField.getText();
                String p = new String(passField.getPassword());

                if (u.equals("admin") && p.equals("1234")) {
                    new Dashboard().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login!");
                }
            }
        });
    }
}
