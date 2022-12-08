package Cau4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View extends JFrame implements ActionListener{
	private JTable table;
	private JTextField textField_name;
	private JTextField textField_birthDay;
	private JTextField textField_sex;
	private JTextField textField_salary;
	private JButton button_add;
	private JButton button_remove;
	private JButton button_exit;
	public View() {
		init();
		addEvent();
		this.setVisible(true);
	}
	//add 
	private void addEvent() {
		button_add.addActionListener(this);
		button_remove.addActionListener(this);
		button_exit.addActionListener(this);
	}
	private void init() {
		this.setTitle("Employee");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(600,400);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_info = new JPanel();
		panel_info.setLayout(new GridLayout(4,2,5,5));
		JLabel label_name = new JLabel("Ten Nhan Vien");
			label_name.setHorizontalAlignment(JLabel.RIGHT);
		 textField_name = new JTextField();
		JLabel label_birthDay = new JLabel("Ngay Sinh");
			label_birthDay.setHorizontalAlignment(JLabel.RIGHT);
		 textField_birthDay = new JTextField();
		JLabel label_sex = new JLabel("Gio Tinh");
			label_sex.setHorizontalAlignment(JLabel.RIGHT);
		 textField_sex = new JTextField();
		JLabel label_salary = new JLabel("Luong Co Ban:");
			label_salary.setHorizontalAlignment(JLabel.RIGHT);
		 textField_salary = new JTextField();
		
		panel_info.add(label_name);panel_info.add(textField_name);
		panel_info.add(label_birthDay);panel_info.add(textField_birthDay);
		panel_info.add(label_sex);panel_info.add(textField_sex);
		panel_info.add(label_salary);panel_info.add(textField_salary);
		
		panel.add(panel_info,BorderLayout.NORTH);
		
		JPanel panel_function = new JPanel();
		 button_add = new JButton("Them");
		 button_remove = new JButton("Xoa Tat Ca");
		 button_exit = new JButton("Thoat");
		
		panel_function.add(button_add);
		panel_function.add(button_remove);
		panel_function.add(button_exit);
		
		panel.add(panel_function,BorderLayout.CENTER);
		
		JPanel panel_Nd = new JPanel();
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { 
				},
				new String[] {
						"Ten NV", "Ngay Sinh", "Gioi Tinh", "Luong Cb"
				}
			));
		/**
		 * them hang
		 */
		 DefaultTableModel model = (DefaultTableModel) table.getModel();
	        model.addRow(new Object[]{"Le Ba Phung", "7/7/2003", "Nam","2000000"});
	        
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scrollPane.setPreferredSize(new Dimension(400,200));
		panel_Nd.add(scrollPane);
		
			panel.add(panel_Nd);
		this.add(panel);
		this.pack();
	}
	//Them Dl
	public void add() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		String name = this.textField_name.getText();
		String birthDay = this.textField_name.getText();
		String sex = this.textField_name.getText();
		String salary = this.textField_name.getText();
        model.addRow(new Object[]{name, birthDay, sex,salary});
	}
	//remove All
		public void removeAll() {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			int row = model.getRowCount();
			for(int i =1 ;i<row;i++) {
				model.removeRow(i);
			}
		}
		 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_add) {
			add();
		}
		if(e.getSource()==button_remove) {
			removeAll();
		}
		if(e.getSource()==button_exit) {
			this.dispose();
		}
	}
	public static void main(String[] args) {
		new View();
	}
}
