package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class View extends JFrame implements ActionListener{
	private JButton button_clear;
	private JButton button_red;
	private JButton button_blue;
	private JRadioButton radioButton_square;
	private JRadioButton radioButton_oval;
	private JRadioButton radioButton_fill;
	private JRadioButton radioButton_outLine;
	private DrawPanel drawPanel;
	
	public View() {
		init();
		addEvent();
		this.setVisible(true);
	}
	/**
	 * init Method
	 */
	public void init() {
		this.setTitle("Drawing");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		//Panel North
		button_clear = new JButton("Clear all");
		button_red = new JButton("Red");
		button_red.setBackground(Color.red);
		button_blue= new JButton("Blue");
		button_blue.setBackground(Color.blue);
		radioButton_square = new JRadioButton("Square");
		radioButton_oval = new JRadioButton("Oval");
		ButtonGroup b1 = new ButtonGroup();
		b1.add(radioButton_square);
		b1.add(radioButton_oval);
		
		radioButton_fill = new JRadioButton("Fill");
		radioButton_outLine = new JRadioButton("Out Line");
		ButtonGroup b2 = new ButtonGroup();
		b2.add(radioButton_fill);
		b2.add(radioButton_outLine);
		JPanel panel_North = new JPanel();
		panel_North.setBackground(Color.pink);
		panel_North.add(button_red);
		panel_North.add(button_blue);
		panel_North.add(radioButton_square);
		panel_North.add(radioButton_oval);
		panel_North.add(radioButton_fill);
		panel_North.add(radioButton_outLine);
		
		//Panel West
		JPanel panel_West = new JPanel();
		panel_West.setBackground(Color.pink);
		panel_West.add(button_clear);
		
		//Panel Center
		drawPanel = new DrawPanel();
		
		button_clear.setFocusable(false);//false: text khong co vien
		button_red.setFocusable(false);
		button_blue.setFocusable(false);
		radioButton_fill.setFocusable(false);
		radioButton_outLine.setFocusable(false);
		radioButton_square.setFocusable(false);
		radioButton_oval.setFocusable(false);
		
		
		this.add(panel_North,BorderLayout.NORTH);
		this.add(panel_West,BorderLayout.WEST);
		this.add(drawPanel,BorderLayout.CENTER);
		
	}
	/**
	 * addEvent Method
	 */
	public void addEvent() {
		button_clear.addActionListener(this);
		button_red.addActionListener(this);
		button_blue.addActionListener(this);
		radioButton_square.addActionListener(this);
		radioButton_oval.addActionListener(this);
		radioButton_fill.addActionListener(this);
		radioButton_outLine.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		switch(cm) {
		case"Clear all": 
			this.drawPanel.clear();
			break;
		case"Red": 
			this.drawPanel.red();
			break;
		case"Blue": 
			this.drawPanel.blue();
			break;
		case"Square": 
			this.drawPanel.square();
			break;
		case"Oval": 
			this.drawPanel.oval();
			break;
		case"Fill": 
			this.drawPanel.fill();
			break;
		case"Out Line": 
			this.drawPanel.outLine();
			break;
		}
		
	}
}
