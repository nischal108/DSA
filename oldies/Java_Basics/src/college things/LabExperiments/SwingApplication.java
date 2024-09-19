package LabExperiments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// SwingApplication.java
public class SwingApplication extends JFrame {
    private JTextField textField;
    private JButton button;

    // Constructor
    public SwingApplication() {
        super("Swing Application");

        // Set layout
        setLayout(new FlowLayout());

        // Create components
        JLabel label = new JLabel("Enter text:");
        textField = new JTextField(20);
        button = new JButton("Show Text");

        // Add components to the frame
        add(label);
        add(textField);
        add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                JOptionPane.showMessageDialog(SwingApplication.this,
                        "Entered text: " + inputText,
                        "Text Displayed",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150); // Set initial size
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true); // Make the frame visible
    }

    // Main method to launch the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingApplication();
            }
        });
    }
}
