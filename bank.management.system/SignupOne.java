package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;  
import java.text.*;

//extends JFrame implements ActionListener 
public class SignupOne extends JFrame implements ActionListener {
 
    //creating all needed variables
    //JLabel ;
    //JButton ;
    JTextField name_textfield, fathername_textfield, email_address_textfield, address_textfield, city_textfield, state_textfield, pin_code_textfield;

    //performing all size, locaiton, and needed operations for those variables above
    public SignupOne() {
        JFrame application_form_frame = new JFrame("Application form page");
        application_form_frame.setSize(700, 500);
        //set location of the frame
        application_form_frame.setLocation(100, 100);
        //set to close on exit
        application_form_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set visible
        application_form_frame.setVisible(true);
        application_form_frame.setLocationRelativeTo(null);


        //creating the panel for the 
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel applicaionform_label_0 = new JLabel("APPLICAIONT FORM NO. 664: ");
        Dimension applicaionform_label_0_size = applicaionform_label_0.getPreferredSize();
        applicaionform_label_0.setBounds(150, 20, applicaionform_label_0_size.width, applicaionform_label_0_size.height);
        panel.add(applicaionform_label_0);

        JLabel applicaionform_label_1 = new JLabel("Page 1: Personal Details");
        Dimension applicaionform_label_1_size = applicaionform_label_1.getPreferredSize();
        applicaionform_label_1.setBounds(163, 40, applicaionform_label_1_size.width, applicaionform_label_1_size.height);
        panel.add(applicaionform_label_1);

        JLabel name_label = new JLabel("Name: ");
        Dimension name_label_size = name_label.getPreferredSize();
        name_label.setBounds(50, 70, name_label_size.width, name_label_size.height);
        panel.add(name_label);

        JLabel fathername_label = new JLabel("Father's Name: ");
        Dimension fathername_label_size = fathername_label.getPreferredSize();
        fathername_label.setBounds(50, 120, fathername_label_size.width, fathername_label_size.height);
        panel.add(fathername_label);

        JLabel date_of_birth_label = new JLabel("Date of Birth: ");
        Dimension date_of_birth_label_size = date_of_birth_label.getPreferredSize();
        date_of_birth_label.setBounds(50, 170, date_of_birth_label_size.width, date_of_birth_label_size.height);
        panel.add(date_of_birth_label);

        JLabel gender_label = new JLabel("Gender: ");
        Dimension gender_label_size = gender_label.getPreferredSize();
        gender_label.setBounds(50, 220, gender_label_size.width, gender_label_size.height);
        panel.add(gender_label);

        JLabel email_address_label = new JLabel("Email Address: ");
        Dimension email_address_label_size = email_address_label.getPreferredSize();
        email_address_label.setBounds(50, 270, email_address_label_size.width, email_address_label_size.height);
        panel.add(email_address_label);

        JLabel marritage_status_label = new JLabel("Marriage Status: ");
        Dimension marritage_status_label_size = marritage_status_label.getPreferredSize();
        marritage_status_label.setBounds(50, 320, marritage_status_label_size.width, marritage_status_label_size.height);
        panel.add(marritage_status_label);

        JLabel home_address_label = new JLabel("Address: ");
        Dimension home_address_label_size = home_address_label.getPreferredSize();
        home_address_label.setBounds(50, 370, home_address_label_size.width, home_address_label_size.height);
        panel.add(home_address_label);

        JLabel city_label = new JLabel("City: ");
        Dimension city_label_size = city_label.getPreferredSize();
        city_label.setBounds(50, 420, city_label_size.width, city_label_size.height);
        panel.add(city_label);

        JLabel state_label = new JLabel("State: ");
        Dimension state_label_size = state_label.getPreferredSize();
        state_label.setBounds(50, 470, state_label_size.width, state_label_size.height);
        panel.add(state_label);

        JLabel pin_code_label = new JLabel("Pin Code: ");
        Dimension pin_code_label_size = pin_code_label.getPreferredSize();
        pin_code_label.setBounds(50, 520, pin_code_label_size.width, pin_code_label_size.height);
        panel.add(pin_code_label);



        name_textfield = new JTextField(23);
        fathername_textfield = new JTextField(23);

        Dimension name_textfield_size = name_textfield.getPreferredSize();
        Dimension fathername_textfield_size = fathername_textfield.getPreferredSize();

        name_textfield.setBounds(160, 70, name_textfield_size.width, name_textfield_size.height);
        fathername_textfield.setBounds(160, 110, fathername_textfield_size.width, fathername_textfield_size.height);
       
        panel.add(name_textfield);
        panel.add(fathername_textfield);

        //adding a date of birth calendar for user to choose from   
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        JFormattedTextField  dateTextField = new JFormattedTextField(format);
        dateTextField.setBounds(160, 160, 290, 30);
        panel.add(dateTextField);


        application_form_frame.add(panel);
    }

    //implement the ActionListener for some buttons
    public void actionPerformed(ActionEvent ae) {

    }

}