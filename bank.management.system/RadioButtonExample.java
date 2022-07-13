import java.awt.*;
import javax.swing.*;    
import java.awt.event.*;


//creting a class that implement a RadioButton to ask user to click either the person is male or female
class RadioButtonExample extends JFrame implements ActionListener {
    JFrame frame;
    JButton button;
    JRadioButton r1, r2;

    RadioButtonExample() {
        frame = new JFrame();
        r1 = new JRadioButton("A) Male");
        r2 = new JRadioButton("B) Female");

        r1.setBounds(100, 100, 100, 100); 
        r2.setBounds(200, 100, 100, 100);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //creating button
        button = new JButton("Click");
        button.setBounds(100, 200, 70, 40);
        button.addActionListener(this);
        
        frame.add(button);
        frame.add(r1);
        frame.add(r2);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if (r1.isSelected())
        {
            JOptionPane.showMessageDialog(this,"You are Male.");  
        }
        else if (r2.isSelected()) 
        {
            JOptionPane.showMessageDialog(this,"You are Female.");  
        }
        else if (!r1.isSelected() && !r2.isSelected())
        {
            JOptionPane.showMessageDialog(this,"Please select option.");  
        }
    }

    
    public static void main(String[] args) {
        new RadioButtonExample();    
    }
}