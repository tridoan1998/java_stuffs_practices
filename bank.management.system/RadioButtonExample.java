import java.awt.*;
import javax.swing.*;    
import java.awt.event.*;


//creting a class that implement a RadioButton to ask user to click either the person is male or female
class RadioButtonExample extends JFrame{
    //JRadioButton radio_button gender;
    JFrame frame;

    RadioButtonExample() {
        frame = new JFrame();
        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2 = new JRadioButton("B) Female");

        r1.setBounds(100, 100, 100, 100); 
        r2.setBounds(200, 100, 100, 100);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        frame.add(r1);
        frame.add(r2);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new RadioButtonExample();    
    }
}