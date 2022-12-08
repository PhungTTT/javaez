package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import model.Model;

public class MyFrame extends JFrame implements ActionListener{
	private JButton button_keo;
	private JButton button_bua;
	private JButton button_bao;
	private JButton button_replay;
	private JButton button_ok;
	private JButton button_close;
	private JLabel label_may;
	private JLabel label_center;
	private JLabel label_luaChonMay;
	private JLabel label_luaChonNguoiChoi;
	private Model model = new Model();
	
	ImageIcon icon_vietnam = new ImageIcon("vietnam.png");
	ImageIcon icon_binhThuong = new ImageIcon("binhthuong.png");
	
	ImageIcon icon_keo = new ImageIcon("keo.png");
	ImageIcon icon_bua  = new ImageIcon("bua.png");
	ImageIcon icon_bao = new ImageIcon("bao.png");
	
	ImageIcon icon_mayhoi = new ImageIcon("mayhoi.png");
	ImageIcon icon_nguoihoi = new ImageIcon("nguoihoi.png");
	ImageIcon icon_replay = new ImageIcon("replay.png");
	ImageIcon icon_ok = new ImageIcon("ok.png");
	ImageIcon icon_close = new ImageIcon("close.png");
	ImageIcon icon_thang = new ImageIcon("thang.png");
	ImageIcon icon_hoa = new ImageIcon("hoa.png");
	ImageIcon icon_thua = new ImageIcon("thua.png");
	public MyFrame() {
		init();
		addEvent();
		this.setVisible(true);
	}

	private void addEvent() {
		 button_keo.addActionListener(this);
		 button_bua.addActionListener(this);
		 button_bao.addActionListener(this);
		 button_replay.addActionListener(this);
		 button_ok.addActionListener(this);
		 button_close.addActionListener(this);
	}

	private void init() {
		this.setTitle("Oan tu ti");
		this.setIconImage(icon_vietnam.getImage());
		this.setResizable(false);
		this.setSize(500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		//South
		JPanel panel_South = new JPanel();
		panel_South.setBorder(BorderFactory.createLineBorder(Color.blue,5));
		panel_South.setLayout(new GridLayout(3,1));
		
		JPanel panel_luaChon = new JPanel();
		 button_keo = new JButton();
		button_keo.setIcon(icon_keo);
		panel_luaChon.add(button_keo);
		 button_bua = new JButton();
		button_bua.setIcon(icon_bua);
		panel_luaChon.add(button_bua);
		 button_bao = new JButton();
		button_bao.setIcon(icon_bao);
		panel_luaChon.add(button_bao);
		
		JLabel label = new JLabel("Your choice");
		label.setFont(new Font("Aria", Font.BOLD,20));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel panel_thaoTac = new JPanel();
		 button_replay = new JButton("Replay");
		button_replay.setIcon(icon_replay);
		 button_ok = new JButton("Ok");
		button_ok.setIcon(icon_ok);
		 button_close = new JButton("Close");
		button_close.setIcon(icon_close);
		panel_thaoTac.add(button_replay);
		panel_thaoTac.add(button_ok);
		panel_thaoTac.add(button_close);
		
		panel_South.add(panel_luaChon);
		panel_South.add(label);
		panel_South.add(panel_thaoTac);
		this.add(panel_South,BorderLayout.SOUTH);
		//North
		 label_may = new JLabel();
		label_may.setBorder(BorderFactory.createLineBorder(Color.red,5));
		label_may.setIcon(icon_binhThuong);
		label_may.setFont(new Font("Aria", Font.BOLD,20));
		label_may.setText("RIVAL");
		label_may.setHorizontalAlignment(JLabel.CENTER);
		label_may.setVerticalTextPosition(JLabel.TOP);
		label_may.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(label_may,BorderLayout.NORTH);
		//Center
		JPanel panel_Center = new JPanel();
		panel_Center.setLayout(new BorderLayout());
		 label_center = new JLabel("VS");
		label_center.setForeground(Color.gray);
		label_center.setFont(new Font("Serif", Font.ITALIC,60));
		label_center.setVerticalTextPosition(JLabel.CENTER);
		label_center.setHorizontalTextPosition(JLabel.CENTER);
		label_center.setHorizontalAlignment(JLabel.CENTER);
		panel_Center.add(label_center,BorderLayout.CENTER);
		this.add(panel_Center,BorderLayout.CENTER);
		
		//West
		JPanel panel_West = new JPanel();
		panel_West.setLayout(new GridLayout(0,1));
		label_luaChonMay = new JLabel("RIVAL!");
		label_luaChonMay.setFont(new Font("Aria", Font.BOLD,15));
		label_luaChonMay.setForeground(Color.red);
		label_luaChonMay.setIcon(icon_mayhoi);
		label_luaChonMay.setVerticalTextPosition(JLabel.BOTTOM);
		label_luaChonMay.setHorizontalTextPosition(JLabel.CENTER);
		
		panel_West.add(label_luaChonMay);
		this.add(panel_West,BorderLayout.WEST);
		
		//East
		 label_luaChonNguoiChoi = new JLabel("YOU!");
		label_luaChonNguoiChoi.setFont(new Font("Aria", Font.BOLD,15));
		label_luaChonNguoiChoi.setForeground(Color.blue);
		label_luaChonNguoiChoi.setIcon(icon_nguoihoi);
		label_luaChonNguoiChoi.setVerticalTextPosition(JLabel.BOTTOM);
		label_luaChonNguoiChoi.setHorizontalTextPosition(JLabel.CENTER);
		this.add(label_luaChonNguoiChoi,BorderLayout.EAST);
	}
	String luaChonNguoiChoi = "";
	@Override
	public void actionPerformed(ActionEvent e) {
		String luaChonMay =model.randomMay();
		//Lua Chon
		if(e.getSource()==button_keo) {
			label_may.setIcon(icon_binhThuong);
			this.label_luaChonNguoiChoi.setIcon(button_keo.getIcon());
			luaChonNguoiChoi = "keo";
		}else if(e.getSource()==button_bua) {
			label_may.setIcon(icon_binhThuong);
			this.label_luaChonNguoiChoi.setIcon(button_bua.getIcon());
			luaChonNguoiChoi = "bua";
		}else if(e.getSource()==button_bao) {
			label_may.setIcon(icon_binhThuong);
			this.label_luaChonNguoiChoi.setIcon(button_bao.getIcon());
			luaChonNguoiChoi = "bao";
		}
		label_luaChonMay.setIcon(icon_mayhoi);
		label_center.setText("VS");label_center.setForeground(Color.gray);
		//Thao Tac
		String x = e.getActionCommand();
		switch(x) {
			case "Ok":
				//hien thi lua chon cua may
				switch (luaChonMay) {
					case "keo":
						this.label_luaChonMay.setIcon(button_keo.getIcon());
						break;
					case "bua":
						this.label_luaChonMay.setIcon(button_bua.getIcon());
						break;
					case "bao":
						this.label_luaChonMay.setIcon(button_bao.getIcon());
						break;
				}
				//chay chuong trinh
				int result = model.ketQua(luaChonMay, luaChonNguoiChoi);
				//hien thi ket qua
				if(result==0) {
					this.label_may.setIcon(icon_hoa);
					label_center.setIcon(null);
					this.label_center.setText("DRAW");
					this.label_center.setForeground(Color.gray);
				}else if(result==-1) {
					this.label_may.setIcon(icon_thua);
					label_center.setIcon(null);
					this.label_center.setText("You LOSE");
					this.label_center.setForeground(Color.red);
				}else if(result==1) {
					this.label_may.setIcon(icon_thang);
					label_center.setIcon(null);
					this.label_center.setText("You WIN");
					this.label_center.setForeground(Color.blue);
				}
				break;
				
			case "Replay":
				this.dispose();
				new MyFrame();
				break;
			case "Close":
				System.exit(1);
				break;
		}
	}
	//Test
		public static void main(String[] args) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				new MyFrame();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
}
