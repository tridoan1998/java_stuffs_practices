import java.awt.FlowLayout;
import javax.swing.*;

public class JScrollPaneExample {
    private static final long serialVersonUIL = 1L;

    private static void createAndShowGUI() {


        //create and set up the window
        final JFrame frame = new JFrame("Scroll Pane Example");

        //display the window
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                createAndShowGUI();
            }
        });
    }
}