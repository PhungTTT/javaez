package QLBH;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class PanelDatHang extends JPanel implements ActionListener{
	private QuanLyBanHang qlbh;
	private JRadioButton radioBt_NuocTangLuc;
	private JRadioButton radioBt_TraSua;
	private JRadioButton radioBt_Cafe;
	private JRadioButton radioBt_BanhTrangTron;
	private JRadioButton radioBt_KhoBo;
	private JRadioButton radioBt_BanhMi;
	private JTextField textField_maKH;
	private JLabel label_valueTenKH;
	private JComboBox comboBox_maSp;
	private JButton button_themKH;
	private JButton button_thanhToan;
	private JButton button_timKH;
	private JButton button_themSP;
	private JTable table_danhSach;
	private ButtonGroup btgSP;
	private JLabel label_thanhToan;

	public PanelDatHang() {
		//danh sach san pham cua cua hang
		ArrayList<SanPham> listSP = new ArrayList<SanPham>();
		SanPham s1 = new SanPham("SP001","Nuoc Tang Luc", 15000);
		SanPham s2 = new SanPham("SP002","Tra Sua", 25000);
		SanPham s3 = new SanPham("SP003","Cafe", 15000);
		SanPham s4 = new SanPham("SP004","Banh Trang Tron", 15000);
		SanPham s5 = new SanPham("SP005","Kho Bo", 30000);
		SanPham s6 = new SanPham("SP006","Banh Mi", 13000);
		
				listSP.add(s1);listSP.add(s2);
				listSP.add(s3);listSP.add(s4);
				listSP.add(s5);listSP.add(s6);
		//danh sach khach hang
		ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
		//=>model: QuanLyBanHang
		qlbh = new QuanLyBanHang(listSP, listKH);
		
		init();
		addEvent();
		this.setVisible(false);
	}
	/**
	 * addEvent()
	 */
	private void addEvent() {
		button_themKH.addActionListener(this);
		button_timKH.addActionListener(this);
		button_themSP.addActionListener(this);
		button_thanhToan.addActionListener(this);
		radioBt_BanhMi.addActionListener(this);
		radioBt_BanhTrangTron.addActionListener(this);
		radioBt_Cafe.addActionListener(this);
		radioBt_KhoBo.addActionListener(this);
		radioBt_NuocTangLuc.addActionListener(this);
		radioBt_TraSua.addActionListener(this);
		
	}
	/**
	 * init()
	 */
	private void init() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JPanel panel_LuaChon = new JPanel();
		panel_LuaChon.setBorder(BorderFactory.createTitledBorder("Khach hang lua chon san pham gom thuc an va nuoc uong"));
		JPanel panel_ThongTin = new JPanel();
		panel_ThongTin.setBorder(BorderFactory.createTitledBorder("Thong tin khach hang"));
		JPanel panel_ThaoTac = new JPanel();
		panel_ThaoTac.setBorder(BorderFactory.createTitledBorder("Thao tac"));
		JPanel panel_DanhSach = new JPanel();
		//Panel Lua Chon SP
		panel_LuaChon.setLayout(new GridLayout(2,3));
		 radioBt_NuocTangLuc = new JRadioButton("Nuoc Tang Luc");
		 radioBt_TraSua = new JRadioButton("Tra Sua");
		 radioBt_Cafe = new JRadioButton("Cafe");
		 radioBt_BanhTrangTron = new JRadioButton("Banh Trang Tron");
		 radioBt_KhoBo = new JRadioButton("Kho Bo");
		 radioBt_BanhMi = new JRadioButton("Banh Mi");
		 btgSP = new ButtonGroup();
		btgSP.add(radioBt_BanhMi);btgSP.add(radioBt_BanhTrangTron);btgSP.add(radioBt_Cafe);
		btgSP.add(radioBt_KhoBo);btgSP.add(radioBt_NuocTangLuc);btgSP.add(radioBt_TraSua);
		panel_LuaChon.add(radioBt_NuocTangLuc);
		panel_LuaChon.add(radioBt_TraSua);
		panel_LuaChon.add(radioBt_Cafe);
		panel_LuaChon.add(radioBt_BanhTrangTron);
		panel_LuaChon.add(radioBt_KhoBo);
		panel_LuaChon.add(radioBt_BanhMi);
		//Panel Thong Tin
		panel_ThongTin.setLayout(new GridLayout(4,2));
		JLabel label_maKH = new JLabel("Ma Khach Hang");
		JLabel label_tenKH = new JLabel("Ten Khach Hang");
		JLabel label_dsSP = new JLabel("Danh Sach San Pham");
		 textField_maKH = new JTextField();
		 label_valueTenKH = new JLabel();

		String[] listMaSP = {""};
		 comboBox_maSp = new JComboBox(listMaSP);
		panel_ThongTin.add(label_maKH);
		panel_ThongTin.add(textField_maKH);
		panel_ThongTin.add(label_tenKH);
		panel_ThongTin.add(label_valueTenKH);
		panel_ThongTin.add(label_dsSP);
		panel_ThongTin.add(comboBox_maSp);
		//Panel Thao tac
		 button_themKH = new JButton("Them KH");
		 button_thanhToan = new JButton("Thanh Toan");
		 button_timKH = new JButton("Tim KH");
		 button_timKH.setMnemonic(KeyEvent.VK_F);
		 button_themSP = new JButton("Them San Pham");
		panel_ThaoTac.add(button_themKH);
		panel_ThaoTac.add(button_timKH);
		panel_ThaoTac.add(button_themSP);
		panel_ThaoTac.add(button_thanhToan);
		//Panel DS 
		table_danhSach = new JTable();
		table_danhSach.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Ma San Pham","Ten San Pham","Don Gia"
				}
				));
		JScrollPane scrollPane = new JScrollPane(table_danhSach);
		scrollPane.setPreferredSize(new Dimension(560,150));
		panel_DanhSach.add(scrollPane);
		//label Thanh Toan
		label_thanhToan = new JLabel("");
		
		this.add(panel_LuaChon);
		this.add(panel_ThongTin);
		this.add(panel_ThaoTac);
		this.add(panel_DanhSach);
		this.add(label_thanhToan);
	}
	/*
	 * Them cac SP cua 1 KH vao Table
	 */
	public void themDLvaoBang(KhachHang kh) {
		for(int i =0;i<kh.getListSP().size();i++) {
			DefaultTableModel model = (DefaultTableModel) table_danhSach.getModel();
			model.addRow(new Object[]{kh.getListSP().get(i).getMaSanPham(), 
					kh.getListSP().get(i).getTenSanPham(),
					kh.getListSP().get(i).getDonGia()});
		}
	}
	//Xoa All DL trong table
	public void xoaALlDLTrongBang() {
		DefaultTableModel model = (DefaultTableModel) table_danhSach.getModel();
		model.setRowCount(0);
	}
	/**
	 * Xu Ly Su Kien
	 */
	String tenSPCanThem = null;
	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		switch(cm) {
		case "Nuoc Tang Luc":
			tenSPCanThem = radioBt_NuocTangLuc.getText();
			break;
		case "Tra Sua":
			tenSPCanThem = radioBt_TraSua.getText();
			break;
		case "Cafe":
			tenSPCanThem = radioBt_Cafe.getText();
			break;
		case "Banh Trang Tron":
			tenSPCanThem = radioBt_BanhTrangTron.getText();
			break;
		case "Kho Bo":
			tenSPCanThem = radioBt_KhoBo.getText();
			break;
		case "Banh Mi":
			tenSPCanThem = radioBt_BanhMi.getText();
			break;
	
		case "Them KH":
			String maKH = JOptionPane.showInputDialog(null, "Ma Khach Hang","Them Khach Hang",JOptionPane.QUESTION_MESSAGE);
			String tenKH = JOptionPane.showInputDialog(null, "Ten Khach Hang: ","Them Khach Hang",JOptionPane.QUESTION_MESSAGE);

			this.qlbh.themKhachHang(maKH, tenKH);
			break;
		case "Tim KH":
			xoaALlDLTrongBang();
			label_thanhToan.setText("");
			String maKHCanTim = this.textField_maKH.getText();
			KhachHang kh = qlbh.timKhachHang(maKHCanTim);
			if(kh == null) {
				label_valueTenKH.setText("");
				JOptionPane.showMessageDialog(null,"Khach Hang Khong Tim Thay!",null,JOptionPane.INFORMATION_MESSAGE);
			}else {
				label_valueTenKH.setText(kh.getTenKH());
				themDLvaoBang(kh);
			}
			comboBox_maSp.removeAllItems();
			break;
		case "Them San Pham":
			xoaALlDLTrongBang();
			if(qlbh.timKhachHang(textField_maKH.getText())!=null) {
				if(tenSPCanThem==null) {
					JOptionPane.showMessageDialog(null,"Vui long chon San Pham!",null,JOptionPane.INFORMATION_MESSAGE);
				}else {
					qlbh.themSPforKH(textField_maKH.getText(), tenSPCanThem);
					//Them gia tri cho comboBox
					comboBox_maSp.addItem(qlbh.timSanPham(tenSPCanThem).getMaSanPham());
					comboBox_maSp.removeItem("");
					//Them DL vao table
					themDLvaoBang(qlbh.timKhachHang(textField_maKH.getText()));
					btgSP.clearSelection();//Xoa hien thi Lua Chon
					tenSPCanThem = null;
				}
			}
			break;
		case "Thanh Toan":
			label_thanhToan.setText("Thanh Toan: "+qlbh.timKhachHang(this.textField_maKH.getText()).getTongTien()+"VND");
		}
	}
}
