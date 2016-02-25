package work1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/14/2016.
 */
public class CalculatorFrame extends JFrame{

	JTextField txtShow;
	JPanel pnlInput;
	JButton btnNumbers [];
	JButton btnAdd;
	JButton btnSub;
	JButton btnMul;
	JButton btnDiv;
	JButton btnClr;
	JButton btnResult;
	boolean ifStart;

	public CalculatorFrame(){
		super();
		setTitle("Calculator");
		getContentPane().setLayout(new BorderLayout());
		setSize(400,400);
		setResizable(true);
		setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);

		txtShow = new JTextField();
		add(txtShow,BorderLayout.NORTH);

		pnlInput = new JPanel();
		add(pnlInput, BorderLayout.CENTER);
		pnlInput.setLayout(new GridLayout(4,4));

		btnNumbers = new JButton[10];
		for(int i = 0; i < btnNumbers.length; ++i){
			btnNumbers[i] = new JButton();
			btnNumbers[i].addActionListener(calculatorActionListener);
			btnNumbers[i].setText("" + i);
			pnlInput.add(btnNumbers[i]);
		}

		btnAdd = new JButton("+");
		btnAdd.addActionListener(calculatorActionListener);
		btnSub = new JButton("-");
		btnSub.addActionListener(calculatorActionListener);
		btnMul = new JButton("*");
		btnMul.addActionListener(calculatorActionListener);
		btnDiv = new JButton("/");
		btnDiv.addActionListener(calculatorActionListener);
		btnClr = new JButton("C");
		btnClr.addActionListener(calculatorActionListener);
		btnResult = new JButton("=");
		btnResult.addActionListener(calculatorActionListener);

		pnlInput.add(btnAdd);
		pnlInput.add(btnSub);
		pnlInput.add(btnMul);
		pnlInput.add(btnDiv);
		pnlInput.add(btnClr);
		pnlInput.add(btnResult);

		ifStart = true;
	}
	ActionListener calculatorActionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource();
			switch (button.getText()){
				case "C":
					if(txtShow.getText().length() == 0)
						break;
					txtShow.setText(txtShow.getText().substring(0,txtShow.getText().length() - 1));
					break;
				case "=":
					ifStart = true;
					try{
						Double result = Analyser.analyse(txtShow.getText());
						if(result.isInfinite())
							txtShow.setText("Divisor can not be 0!");
						else
							txtShow.setText("" + result);
					}catch (Exception ex){
						txtShow.setText(ex.getMessage());
						break;
					}
					break;
				default:
					if(ifStart){
						txtShow.setText("");
						ifStart = false;
					}
					txtShow.setText(txtShow.getText() + button.getText());
			}
		}
	};
}
