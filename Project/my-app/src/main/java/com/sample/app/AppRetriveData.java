package com.sample.app;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppRetriveData extends JFrame {

    private JPanel contentPane;
    private JTable jt;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppRetriveData frame = new AppRetriveData();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AppRetriveData() {
        setTitle("Query Retrive");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 474, 471);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);

        JLabel lblNewLabel = new JLabel("Table of Students");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        contentPane.add(panel_1, BorderLayout.CENTER);

        DefaultTableModel tableModel = FetchDataSelect();
        jt = new JTable(tableModel);
        jt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GetSelectedData();
            }
        });

        JScrollPane sp = new JScrollPane(jt);
        panel_1.add(sp);
    }

    protected void GetSelectedData() {
        DefaultTableModel jtModel = (DefaultTableModel) jt.getModel();
        int selectedRow = jt.getSelectedRow();
        System.out.println("You just click row " + selectedRow);
        String npm = jtModel.getValueAt(selectedRow, 0).toString();
        String name = jtModel.getValueAt(selectedRow, 1).toString();
    }

    private DefaultTableModel FetchDataSelect() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("NPM");
        tableModel.addColumn("Name");

        try {
            // Create an instance of StudentsDao
            StudentsDao studentsDao = new StudentsDao();

            // Perform database query and retrieve data
            List<Students> dataList = studentsDao.findAll();

            // Add data to the table model
            for (Students students : dataList) {
                Object[] data = { students.getNpm(), students.getFirstname() };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to load data. Error: " + e.getMessage());
        }

        return tableModel;
    }

}


