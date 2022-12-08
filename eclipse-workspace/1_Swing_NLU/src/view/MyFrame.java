package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	ImageIcon icon_north = new ImageIcon("north.png");
	ImageIcon icon_logo = new ImageIcon("logo.png");

	private JButton button_dangNhap;

	private JButton button_thoat;

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		this.setTitle("Cong Thong Tin Dao Tao - Truong DHNL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(930,600);
		setLocationRelativeTo(null);
		this.setResizable(false);
		ImageIcon icon = new ImageIcon("icon.png");
		this.setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * North
		 */
		JLabel label_north = new JLabel("");
		label_north.setBounds(110, -26, 874, 139);
		contentPane.add(label_north);
		label_north.setIcon(icon_north);
		
		JLabel label_logo = new JLabel("");
		label_logo.setBounds(0, -16, 212, 120);
		contentPane.add(label_logo);
		label_logo.setIcon(icon_logo);
		/**
		 * Main
		 */
		JPanel panel_main = new JPanel();
		panel_main.setBounds(0, 112, 914, 467);
		contentPane.add(panel_main);
		panel_main.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.inactiveCaption);
		menuBar.setBounds(0, 0, 914, 22);
		panel_main.add(menuBar);
		
		JMenu menu_trangChu = new JMenu("TRANG CHU");
		menu_trangChu.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_trangChu);
		
		JMenu menu_tKB = new JMenu("XEM TKB");
		menu_tKB.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_tKB);
		
		JMenu menu_lichThi = new JMenu("XEM LICH THI");
		menu_lichThi.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_lichThi);
		
		JMenu menu_xemHocPhi = new JMenu("XEM HOC PHI");
		menu_xemHocPhi.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_xemHocPhi);
		
		JMenu menu_dongHocPhi = new JMenu("DONG TIEN HOC PHI");
		menu_dongHocPhi.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_dongHocPhi);
		
		JMenu menu_xemDiem = new JMenu("XEM DIEM");
		menu_xemDiem.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_xemDiem);
		
		JMenu menu_xemCTDT = new JMenu("XEM CTDT");
		menu_xemCTDT.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_xemCTDT);
		
		JMenu menu_xemMonTQ = new JMenu("XEM MON TQ");
		menu_xemMonTQ.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_xemMonTQ);
		
		JMenu menu_suaTT = new JMenu("SUA TT CA NHAN");
		menu_suaTT.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_suaTT);

		JMenu menu_gopY = new JMenu("GOP Y");
		menu_gopY.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_gopY);

		JMenu menu_danhGia = new JMenu("DANH GIA GIANG DAY");
		menu_danhGia.setFont(new Font("Segoe UI", Font.BOLD, 10));
		menuBar.add(menu_danhGia);
		
		 button_dangNhap = new JButton("Dang Nhap");
		button_dangNhap.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_dangNhap.setForeground(Color.red);
		button_dangNhap.setBounds(751, 90, 89, 19);
		contentPane.add(button_dangNhap);
		
		 button_thoat = new JButton("Thoat");
		button_thoat.setForeground(Color.red);
		button_thoat.setFont(new Font("Tahoma", Font.BOLD, 9));
		button_thoat.setBounds(839, 90, 75, 19);
		contentPane.add(button_thoat);
		
		JPanel panel_show = new JPanel();
		panel_show.setBackground(new Color(46, 139, 87));
		panel_show.setBounds(0, 21, 924, 435);
		panel_main.add(panel_show);
		panel_show.setLayout(new BorderLayout(0, 0));
		
		JLabel label_thongBao = new JLabel("Chao Mung Ban Den Voi Nong Lam Tu!");
		label_thongBao.setForeground(new Color(0, 0, 0));
		label_thongBao.setFont(new Font("Ink Free", Font.BOLD,40));
		label_thongBao.setHorizontalAlignment(JLabel.CENTER);
		label_thongBao.setVerticalAlignment(JLabel.CENTER);
		panel_show.add(label_thongBao);
		
		
		addEvent();
	}
	public void addEvent() {
		this.button_dangNhap.addActionListener(this);
		this.button_thoat.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cm =e.getActionCommand();
		switch (cm) {
			case "Thoat": 
				System.exit(0);
				break;
			case "Dang Nhap":
				JOptionPane.showMessageDialog(null,"Xin loi! \nHe thong dang trong qua trinh cap nhat","Thong bao", JOptionPane.INFORMATION_MESSAGE);
				break;
		}
	}
}
