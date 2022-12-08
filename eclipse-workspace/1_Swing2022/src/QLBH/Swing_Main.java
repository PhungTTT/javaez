package QLBH;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Swing_Main extends JFrame implements ActionListener{
	private JMenuItem menuItem_Exit;
	private JMenuItem menuItem_datHang;
	private PanelDatHang panelDatHang;
	private JLabel text;

	public Swing_Main() {
		init();
		addEvent();
		this.setVisible(true);
	}
	/*
	 * addEvent Method
	 */
	private void addEvent() {
		this.menuItem_Exit.addActionListener(this);
		this.menuItem_datHang.addActionListener(this);
	}
	/**
	 * init Method
	 */
	private void init() {
		this.setTitle("Quan Ly Ban Hang");
		this.setSize(600,500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JMenuBar mnbar = new JMenuBar();
		JMenu menu_File = new JMenu("File");
		JMenu menu_QLBH = new JMenu("Quan Ly Ban Hang");
		 menuItem_Exit = new JMenuItem("Exit",KeyEvent.VK_E);
		 menuItem_datHang = new JMenuItem("Dat Hang");
		menu_File.add(menuItem_Exit);
		menu_QLBH.add(menuItem_datHang);
		mnbar.add(menu_File);
		mnbar.add(menu_QLBH);
		this.setJMenuBar(mnbar);
		
		
		text = new JLabel("WELCOME KHACH HANG!");
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setVerticalAlignment(JLabel.CENTER);
		this.add(text);
		
	}
	/*
	 * Xu Ly Su Kien
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menuItem_Exit) {
			System.exit(0);
		}else if(e.getSource()==menuItem_datHang) {
			this.remove(text);
			panelDatHang = new PanelDatHang();
			this.add(panelDatHang);
			panelDatHang.setVisible(true);
			
		}
	}
}
