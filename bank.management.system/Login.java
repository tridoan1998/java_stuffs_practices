package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame {
    public static void main(String[] args) {
        //calling constructor for JFrame to work
        JFrame login_frame = new JFrame("Login Page for the bank");
        //set the size and the location of the frame
        login_frame.setSize(700, 500);
        //set location of the frame
        login_frame.setLocation(100, 100);
        //set to close on exit
        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set visible
        login_frame.setVisible(true);
        login_frame.setLocationRelativeTo(null);

        JLabel username_label = new JLabel("Username: ");
        JLabel password_label = new JLabel("Password: ");
        Dimension username_label_size = username_label.getPreferredSize();
        Dimension password_label_size = password_label.getPreferredSize();

        username_label.setBounds(50, 100, username_label_size.width, username_label_size.height);
        password_label.setBounds(50, 150, password_label_size.width, password_label_size.height);

        JButton submit_button = new JButton("Submit");
        Dimension submit_button_size = submit_button.getPreferredSize();
        submit_button.setBounds(237, 180, submit_button_size.width, submit_button_size.height);
        //creating the panel to put username and password buttons on top
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(username_label);
        panel.add(password_label);
        panel.add(submit_button);

        login_frame.add(panel);

        JTextField username_text = new JTextField(20);
        JTextField password_text = new JTextField(40);
        Dimension username_text_size = username_text.getPreferredSize();
        Dimension password_text_size = password_text.getPreferredSize();
        username_text.setBounds(120, 100, username_text_size.width, username_text_size.height);
        password_text.setBounds(120, 150, password_text_size.width, password_text_size.height);

        panel.add(username_text);
        panel.add(password_text);
    }
}