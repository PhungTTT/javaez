package Cau3b;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutView extends JFrame implements ActionListener{
	private JButton button_ok;
	public AboutView() {
		this.setTitle("About");
		this.setSize(450,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		ImageIcon image = new ImageIcon("about.png");
		JLabel label = new JLabel();
		label.setIcon(image);
		
		button_ok = new JButton("OK");
		button_ok.setPreferredSize(new Dimension(10, 20));
		button_ok.addActionListener(this);
		
		this.add(label,BorderLayout.CENTER);
		this.add(button_ok,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new AboutView();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_ok) {
			this.dispose();
		}
	}
}
