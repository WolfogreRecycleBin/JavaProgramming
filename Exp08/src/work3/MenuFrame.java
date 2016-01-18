package work3;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/18/2016.
 */
public class MenuFrame extends JFrame {

	JMenuBar menuBar;
	JMenu mnFile;
	JMenuItem miNew;
	JMenuItem miOpen;
	JMenuItem miClose;
	JMenu miFormat;
	JCheckBoxMenuItem miJavaFormat;
	JCheckBoxMenuItem miTxtFormat;
	ButtonGroup bgAccess;
	JRadioButtonMenuItem miReadOnly;
	JRadioButtonMenuItem miAccessWrite;
	JMenuItem miSave;
	JMenuItem miSaveAs;
	JMenuItem miExit;
	JMenu mnEdit;
	JMenu mnView;
	JMenu mnHelp;

	public MenuFrame() {
		super();

		setSize(400,400);
		setResizable(true);
		setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);

		setTitle("Menu UI");

		menuBar = new JMenuBar();{
			mnFile = new JMenu("File");{
				miNew = new JMenuItem("New");
				miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
				mnFile.add(miNew);

				miOpen = new JMenuItem("Open");
				miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
				mnFile.add(miOpen);

				miClose = new JMenuItem("Close");
				miClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
				mnFile.add(miClose);

				mnFile.addSeparator();

				miFormat = new JMenu("Format");{
					miJavaFormat = new JCheckBoxMenuItem("Java File");
					miFormat.add(miJavaFormat);

					miTxtFormat = new JCheckBoxMenuItem("Txt File");
					miFormat.add(miTxtFormat);

					miFormat.addSeparator();

					miReadOnly = new JRadioButtonMenuItem("Read Only");
					miFormat.add(miReadOnly);

					miAccessWrite = new JRadioButtonMenuItem("Access Write");
					miFormat.add(miAccessWrite);

					bgAccess = new ButtonGroup();
					bgAccess.add(miReadOnly);
					bgAccess.add(miAccessWrite);
				}
				mnFile.add(miFormat);

				miSave = new JMenuItem("Save");
				miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
				mnFile.add(miSave);

				miSaveAs = new JMenuItem("Save As");
				miSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
				mnFile.add(miSaveAs);

				mnFile.addSeparator();

				miExit = new JMenuItem("Exit");
				miExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
				mnFile.add(miExit);
			}
			menuBar.add(mnFile);

			mnEdit = new JMenu("Edit");
			menuBar.add(mnEdit);

			mnView = new JMenu("View");
			menuBar.add(mnView);

			mnHelp = new JMenu("Help");
			menuBar.add(mnHelp);
		}

		setJMenuBar(menuBar);
	}
}
