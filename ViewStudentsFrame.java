package com.School_Management;

import javax.swing.*;

@SuppressWarnings("serial")
public class ViewStudentsFrame extends JFrame {

    public ViewStudentsFrame() {
        setTitle("View Students");
        setSize(400, 300);

        JTextArea area = new JTextArea();
        for (Student s : StudentData.students) {
            area.append(s.toString() + "\n");
        }

        JScrollPane pane = new JScrollPane(area);
        add(pane);
    }
}
