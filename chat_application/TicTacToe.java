import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Logger;

class TicTacToe {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
        public void run() {
            TicTacToeFrame frame = new TicTacToeFrame();
        }    
        });
    }
}

class TicTacToeFrame extends JFrame {
    JButton [][] buttons = new JButton[3][3];
    JTextField statusBar;
    GamePanel panel;
    Integer turn;
    GameListener listener = new GameListener();
    Integer count;

    public TicTacToeFrame() {
        setLayout(new BorderLayout());
        
        panel = new GamePanel();
        add(panel, BorderLayout.CENTER);

        statusBar = new JTextField("Player1's Turn");
        statusBar.setEditable(false);
        add(statusBar, BorderLayout.SOUTH);

        setTitle("Tic Tac Toe!");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 400, 300, 300);
    }

    class GamePanel extends JPanel {
        public GamePanel() {
            setLayout(new GridLayout (3, 3));
            turn = 1;
            count = 0;
            for(int i =0; i < 3; i++) 
                {
                    for (int j = 0; j < 3; j++) {
                        buttons[i][j] = new JButton();
                        buttons[i][j].putClientProperty("INDEX", new Integer[] {i, j});
                        buttons[i][j].putClientProperty("OWNER", null);
                        buttons[i][j].addActionListener(listener);
                        add(buttons[i][j]);
                    }
                }
        }
    }
}

