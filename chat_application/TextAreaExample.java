import javax.swing.*;

public class TextAreaExample {
    TextAreaExample() {
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("Welcome to javapoint");
        area.setBounds(10, 30, 200, 200); //set the size of the text area
        f.add(area); //put the text area into the frame
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new TextAreaExample();
    }
}