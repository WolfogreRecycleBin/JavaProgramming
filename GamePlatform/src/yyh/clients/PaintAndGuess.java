package yyh.clients;

import javax.swing.*;
import java.awt.*;

public class PaintAndGuess extends ClientFrame {

    JButton button;
    JTextField textField;

    public PaintAndGuess(String title) {
        super(title);
    }

    @Override
    public void designMainPanel(JPanel mainPanel) {
        mainPanel.setLayout(new FlowLayout());

        textField = new JTextField(20);
        mainPanel.add(textField);

        button = new JButton("send");
        mainPanel.add(button);
    }
}
