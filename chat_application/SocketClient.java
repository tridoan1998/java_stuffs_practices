import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient extends JFrame implements ActionListener, Runnable {
    JTextArea textArea = new JTextArea();
    JScrollPane jp = new JScrollPane(textArea);
    JTextField input_Text = new JTextField();
    JMenuBar menuBar = new JMenuBar();

    Socket sk;
    BufferedReader br;
    PrintWriter pw;

    public SocketClient() {
        super("Drama Club");
        setFont(new Font("Times New Roman", Font.PLAIN, 12));
        setForeground(new Color(51, 0, 0));
        setBackground(new Color(0,0,51));
    } 

public static void main(String [] args) {
    new SocketClient().serverConnection();
}

public void run() {
    String data = null;
    try {

    }
}
}

