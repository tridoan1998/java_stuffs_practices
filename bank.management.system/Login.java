package bank.management.system;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
    public static void main(String[] args) {
        //calling constructor for JFrame to work
        JFrame login_frame = new JFrame("Login Page for the bank");
        //set the size and the location of the frame
        login_frame.setSize(400, 400);
        //set location of the frame
        login_frame.setLocation(100, 100);
        //set to close on exit
        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set visible
        login_frame.setVisible(true);
    }
}