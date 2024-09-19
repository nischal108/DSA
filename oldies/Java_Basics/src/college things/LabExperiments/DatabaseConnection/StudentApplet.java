package LabExperiments.DatabaseConnection;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentApplet extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public StudentApplet() {
        setTitle("Student Records");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a panel for the table with padding and a border
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        tablePanel.setBackground(Color.WHITE);

        // Create table model with column names
        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Age"}, 0);
        table = new JTable(tableModel);
        table.setFillsViewportHeight(true);

        // Increase font size and row height
        table.setFont(new Font("Serif", Font.PLAIN, 18));
        table.setRowHeight(30);
        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 18));
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        // Center align table cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        // Add table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        tablePanel.add(scrollPane, BorderLayout.CENTER);
        add(tablePanel, BorderLayout.CENTER);

        // Add a title label at the top
        JLabel titleLabel = new JLabel("Student Records", JLabel.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
        add(titleLabel, BorderLayout.NORTH);

        // Run database query in a separate thread
        new Thread(this::fetchStudentRecords).start();
    }

    private void fetchStudentRecords() {
        // JDBC variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            // Establish connection to MySQL
            String url = "jdbc:mysql://localhost:3306/university";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);

            // Create SQL statement
            statement = connection.createStatement();
            String query = "SELECT * FROM Students";
            resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // Add row to table model
                tableModel.addRow(new Object[]{id, name, age});
            }
        } catch (Exception e) {
            SwingUtilities.invokeLater(() ->
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE));
        } finally {
            // Close JDBC objects
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                SwingUtilities.invokeLater(() ->
                        JOptionPane.showMessageDialog(this, "Error closing database resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE));
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentApplet applet = new StudentApplet();
            applet.setVisible(true);
        });
    }
}
