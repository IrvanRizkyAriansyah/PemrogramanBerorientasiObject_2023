package com.sample.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textNpm;
	private JTextField textFirstname;
	private JTextField textLastname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 0, 0);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NPM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 67, 113, 20);
		contentPane.add(lblNewLabel_1);
		
		textNpm = new JTextField();
		textNpm.setBounds(96, 67, 644, 20);
		contentPane.add(textNpm);
		textNpm.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Firstname");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 101, 90, 21);
		contentPane.add(lblNewLabel_2);
		
		textFirstname = new JTextField();
		textFirstname.setBounds(96, 102, 644, 20);
		contentPane.add(textFirstname);
		textFirstname.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Lastname");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 133, 90, 14);
		contentPane.add(lblNewLabel_3);
		
		textLastname = new JTextField();
		textLastname.setBounds(96, 133, 644, 20);
		contentPane.add(textLastname);
		textLastname.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(321, 186, 113, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				ValidatorForm();
			}
		});
		contentPane.add(btnNewButton);
	}
	
	private void ValidatorForm() {
        if (textNpm.getText().isEmpty() || textFirstname.getText().isEmpty() || textLastname.getText().isEmpty()) {
            Object message = "Please fill up the form correctly";
            JOptionPane.showMessageDialog(null, message);
        } else {
            try {
                Insert2database();
                JOptionPane.showMessageDialog(null, "Successfully saved");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed save. Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

	private void Insert2database() throws Exception {
	    Students students = new Students();
	    students.setNpm(textNpm.getText());
	    students.setFirstname(textFirstname.getText());
	    students.setLastname(textLastname.getText());
	    
	    StudentsDao stdDao = new StudentsDao();
	    stdDao.saved(students);
	}
}
