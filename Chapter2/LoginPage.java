package Chapter2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2));

        // Create the labels and text fields
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        
        // Create the login button
        JButton loginButton = new JButton("Login");
        
        // Create the result label
        JLabel resultLabel = new JLabel("");

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Simple validation (in a real app, validate against a database or service)
                if (username.equals("admin") && password.equals("password")) {
                    resultLabel.setText("Login successful!");
                } else {
                    resultLabel.setText("Invalid username or password.");
                }
            }
        });

        // Add components to the frame
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(resultLabel);

        // Set frame visibility
        frame.setVisible(true);
    }
}

