package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    JButton signin_button, clear_button, signup_button;
    JTextField username_text;
    JPasswordField password_text;
    Login() {
        //calling constructor for JFrame to work
        JFrame login_frame = new JFrame("Bank Login Page");
        //set the size and the location of the frame
        login_frame.setSize(700, 500);
        //set location of the frame
        login_frame.setLocation(100, 100);
        //set to close on exit
        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set visible
        login_frame.setVisible(true);
        login_frame.setLocationRelativeTo(null);

        JLabel username_label = new JLabel("Card No: ");
        JLabel password_label = new JLabel("PIN: ");
        Dimension username_label_size = username_label.getPreferredSize();
        Dimension password_label_size = password_label.getPreferredSize();

        username_label.setBounds(50, 110, username_label_size.width, username_label_size.height);
        password_label.setBounds(50, 160, password_label_size.width, password_label_size.height);

        //creating sign in, clear, and sign up buttons
        signin_button = new JButton("SIGN IN");
        Dimension signin_button_size = signin_button.getPreferredSize();
        signin_button.setBounds(150, 180, signin_button_size.width, signin_button_size.height);
        signin_button.addActionListener(this);

        clear_button = new JButton("CLEAR");
        Dimension clear_button_size = clear_button.getPreferredSize();
        clear_button.setBounds(250, 180, clear_button_size.width, clear_button_size.height);
        clear_button.addActionListener(this);

        signup_button = new JButton("SIGN UP");
        Dimension signup_button_size = signup_button.getPreferredSize();
        signup_button.setBounds(350, 180, signup_button_size.width, signup_button_size.height);       
        signup_button.addActionListener(this);

        //creating the panel to put username and password buttons on top      
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(username_label);
        panel.add(password_label);
        panel.add(signin_button);
        panel.add(clear_button);
        panel.add(signup_button);

        login_frame.add(panel);

        username_text = new JTextField(23);
        password_text = new JPasswordField(23);
        Dimension username_text_size = username_text.getPreferredSize();
        Dimension password_text_size = password_text.getPreferredSize();
        username_text.setBounds(150, 100, username_text_size.width, username_text_size.height);
        password_text.setBounds(150, 150, password_text_size.width, password_text_size.height);

        panel.add(username_text);
        panel.add(password_text);

        String path_picture = "login_bank_image.png"; //image path
        JLabel label_picture = new JLabel();    //this will hold the image
        label_picture.setIcon(new ImageIcon(path_picture)); //Sets the image to be displayed as an icon
        Dimension label_picture_size = label_picture.getPreferredSize(); //Gets the size of the image
        label_picture.setBounds(50, 30, label_picture_size.width, label_picture_size.height); //Sets the location of the image

        panel.add(label_picture);

    }

    //adding action to sign in, clear, and sign up buttons
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signin_button) {
            username_text.setText("testing");
        } else if (ae.getSource() == clear_button) {
            username_text.setText("testing");

        } else if (ae.getSource() == signup_button) {
            username_text.setText("testing");

        }
    }
    
    public static void main(String[] args) {
        Login login = new Login();


    }
}