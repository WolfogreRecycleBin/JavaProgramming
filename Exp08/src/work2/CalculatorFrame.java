package work2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/14/2016.
 */
public class CalculatorFrame extends JFrame{

	JTextField txtShow;
	JPanel pnlInput;
	JButton btnNumbers [];

	public CalculatorFrame(){
		super();
		setTitle("Calculator");
		BorderLayout borderLayout = new BorderLayout();
		getContentPane().setLayout(borderLayout);
		setSize(300,400);
		setResizable(true);
		setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);

		txtShow = new JTextField();
		add(txtShow,BorderLayout.NORTH);

		pnlInput = new JPanel();
		add(pnlInput,BorderLayout.CENTER);
		pnlInput.setBackground(Color.GREEN);
		pnlInput.setLayout(borderLayout);

		btnNumbers = new JButton[10];
		for(int i = 0; i < btnNumbers.length; ++i){
			btnNumbers[i] = new JButton();
			btnNumbers[i].setText("" + i);
			pnlInput.add(btnNumbers[i]);
			//TODO:God...
		}
	}
}
