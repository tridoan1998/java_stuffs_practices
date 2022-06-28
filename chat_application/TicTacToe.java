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

class GameListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        count++;
        JButton b = (JButton)e.getSource();
        Integer[] index = (Integer[]) b.getClientProperty("INDEX");

        b.putClientProperty("OWNER", turn);
        Icon ico = new ImageIcon(turn.toString()+".gif");
        b.setIcon(ico);
        b.setEnabled(false);
        boolean result = checkVictoryCondition(index);
        if (result)
        {
            JOptionPane.showMessageDialog(null, "Player " + turn.toString() + " Wins");
            initComponents();
        }
        else 
        {
            if(turn == 1 )
            {
                turn = 2;
                statusBar.setText("Player2's turn");
            }
            else
            {
                turn = 1 
                statusBar.setText("Player1's turn");
            }
        }
        if(count == 9)
        {
            JOptionPane.showMessageDialog(null, "Match is a draw!");
            initComponents();
        }


    }
}

