package com.sample.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sample.app.StudentsDao;

public class RegisterForm extends JFrame {
    private JTextField npmField;
    private JTextField firstNameField;
    private JTextField middleNameField;
    private JTextField lastNameField;
    private JTextField emailField;
    private JTextField birthdateField;

    public RegisterForm() {
        setTitle("Student Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);
        
        //Form NPM
        JLabel npmLabel = new JLabel("NPM:");
        npmLabel.setBounds(10, 20, 80, 25);
        panel.add(npmLabel);

        npmField = new JTextField(20);
        npmField.setBounds(100, 20, 165, 25);
        panel.add(npmField);

        // Add other fields and labels similarly

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(10, 180, 80, 25);
        panel.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    StudentsDao studentsDao = new StudentsDao();
                    Students student = new Students();
                    student.setNpm(npmField.getText());
                    // Set other student properties similarly

                    studentsDao.saved(student);
                    JOptionPane.showMessageDialog(null, "Registration successful!");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error during registration: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm();
            }
        });
    }
}
