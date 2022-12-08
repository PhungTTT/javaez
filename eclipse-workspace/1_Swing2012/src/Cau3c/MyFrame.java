package Cau3c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import Cau3a.PTbac2View;
import Cau3b.AboutView;

public class MyFrame extends JFrame implements ActionListener{
	private JMenuItem menuItem_solve;
	private JMenuItem menuItem_exit;
	private JMenuItem menuItem_about;
	public MyFrame() {
		this.setTitle("My Application");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon_Exit = new ImageIcon("iconExit.png");
		ImageIcon icon_Slove = new ImageIcon("iconShow.png");
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu_tools = new JMenu("Tools");
		JMenu menu_help = new JMenu("Help");
		menuItem_solve = new JMenuItem("Solve Quadratic Equation",KeyEvent.VK_C);
			menuItem_solve.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,KeyEvent.CTRL_DOWN_MASK));
//		menuItem_solve.setMnemonic(KeyEvent.VK_T);
			menuItem_solve.setIcon(icon_Slove);
		menuItem_exit = new JMenuItem("Exit");
			menuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.ALT_DOWN_MASK));
			menuItem_exit.setIcon(icon_Exit);
		menuItem_about = new JMenuItem("About");
			menuItem_about.setIcon(icon_Slove);
		menu_tools.add(menuItem_solve);
		menu_tools.add(menuItem_exit);
		menu_help.add(menuItem_about);
		
		menuBar.add(menu_tools);
		menuBar.add(menu_help);

		//addEvent
		menuItem_solve.addActionListener(this);
		menuItem_exit.addActionListener(this);
		menuItem_about.addActionListener(this);
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		switch(cm) {
		case "Solve Quadratic Equation":
			new PTbac2View();
			break;
		case "Exit":
			System.exit(0);
			break;
		case "About":
			new AboutView();
			break;
		}
		
	}
	//Test
	public static void main(String[] args) {
		new MyFrame();
	}

	
	
}
