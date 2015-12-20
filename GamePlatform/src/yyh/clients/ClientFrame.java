package yyh.clients;

import javax.swing.*;
import java.awt.*;

/**
 * The Client frame,reserves the left panel and open the main panel to write a game on
 */
public class ClientFrame extends JFrame {
    private JPanel accountPanel;
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel gamesPanel;

    public ClientFrame(String title){
        this.setTitle(title);
        this.getContentPane().setLayout(new BorderLayout());
        this.setBounds(100,100,800,600);
        init();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void init(){
        Container con = this.getContentPane();

        leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200,0));
        con.add(leftPanel, BorderLayout.WEST);
        leftPanel.setLayout(new BorderLayout());

        accountPanel = new JPanel();
        accountPanel.setBackground(Color.GREEN);
        accountPanel.setPreferredSize(new Dimension(0,100));
        leftPanel.add(accountPanel, BorderLayout.NORTH);

        gamesPanel = new JPanel();
        gamesPanel.setBackground(Color.blue);
        leftPanel.add(gamesPanel,BorderLayout.CENTER);

        mainPanel = new JPanel();
        mainPanel.setBackground(Color.GRAY);

        designMainPanel(mainPanel);
        con.add(mainPanel, BorderLayout.CENTER);
    }

    public void designMainPanel(JPanel mainPanel){}
}
