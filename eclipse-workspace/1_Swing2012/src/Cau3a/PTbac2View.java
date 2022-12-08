package Cau3a;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PTbac2View extends JFrame implements ActionListener {
	public JLabel label_title;
	public JLabel label_a;
	public JTextField textField_a;
	public JLabel label_b;
	public JTextField textField_b;
	public JLabel label_c;
	public JTextField textField_c;
	public JButton button_solve;
	public JLabel label_result;
	public JButton button_close;
	
	private PTbac2Model model;
	public PTbac2View() {
		init();
		addEvent();
		this.setVisible(true);
	}

	private void addEvent() {
		button_close.addActionListener(this);
		button_solve.addActionListener(this);
		
	}

	private void init() {
		this.setTitle("Solve Quadractic Equation");
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(5,5));
		
		 label_title = new JLabel("Enter factors of equaton");
		 label_a = new JLabel("Enter number a");
		 textField_a = new JTextField();
		 label_b = new JLabel("Enter number b");
		 textField_b = new JTextField();
		 label_c = new JLabel("Enter number c");
		 textField_c = new JTextField();
		 button_solve = new JButton("Solve");
		 label_result = new JLabel();
		 label_result.setFont(new Font("Aria",Font.BOLD,15));
		 button_close = new JButton("Close");
		 model = new PTbac2Model();
		
		//north
		JPanel panel_North = new JPanel();
		label_title.setFont(new Font("Aria",Font.BOLD,25));
		label_title.setHorizontalAlignment(JLabel.CENTER);
		panel_North.add(label_title);
		//center
		JPanel panel_Center = new JPanel();
		panel_Center.setLayout(new GridLayout(4,2,10,10));
		panel_Center.add(label_a);
		panel_Center.add(textField_a);
		panel_Center.add(label_b);
		panel_Center.add(textField_b);
		panel_Center.add(label_c);
		panel_Center.add(textField_c);
		panel_Center.add(button_solve);
		panel_Center.add(label_result);
		
		this.add(panel_North,BorderLayout.NORTH);
		this.add(panel_Center,BorderLayout.CENTER);
		this.add(button_close,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		new PTbac2View();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_close) {
//			System.exit(1); THOAT ALL CHUONG TRINH
			this.dispose();//CHI TAT 1 CHUONG TRINH NAY
//			this.repaint();//LAM SACH PANEL
		}
		else if(e.getSource()==button_solve) {
			double a = Double.valueOf(textField_a.getText());
			double b = Double.valueOf(textField_b.getText());
			double c = Double.valueOf(textField_c.getText());
			this.label_result.setText(this.model.result(a, b, c));
		}
	}
	
}
