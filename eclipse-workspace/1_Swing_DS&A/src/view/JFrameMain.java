package view;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import controller.ControllerJFrame;

public class JFrameMain extends JFrame  {

	public JPanel contentPane;
	public JButton btn_HashSet;
	public JButton btn_LinkedHashSet;
	public JButton btn_TreeSet;
	public JButton btn_SortedSet;
	public JButton btn_Collection;
	public JButton btn_Iterable;
	public JButton btn_Map;
	public JButton btn_HashMap;
	public JButton btn_LinkedHashMap;
	public JButton btn_SortedMap;
	public JButton btn_TreeMap;
	public JButton btn_Iterator;
	public JButton btn_HashTable;
	public JButton btn_Deque;
	public JButton btn_ArrayDeque;
	public JButton btn_PriorityQue;
	public JButton btn_List;
	public JButton btn_Queue;
	public JButton btn_Set;
	public JButton btn_Stack;
	public JButton btn_Vector;
	public JButton btn_LinkedList;
	public JButton btn_Arraylist;
	public JMenuItem mn_Exit;
	public JMenuItem mn_Gg;
	public JMenuItem mn_Quizizz;
	public JMenuItem mn_GitHub;
	public JEditorPane panelEditer_Nd;
	public JLabel lbl_tieude;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameMain() {
		setTitle("Demo_DS&A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//		this.setSize(1000,600);
		this.setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Font font_bt = new Font("Aria", 20, 20);
		
		 btn_Arraylist = new JButton("ArrayList");
		btn_Arraylist.setToolTipText("removeRange(), ensureCapacity(), trimToSize()");
		btn_Arraylist.setForeground(Color.BLACK);
		btn_Arraylist.setBackground(new Color(51, 209, 122));
		btn_Arraylist.setFont(font_bt);
		btn_Arraylist.setBounds(41, 235, 149, 25);
		contentPane.add(btn_Arraylist);
		
		 btn_LinkedList = new JButton("LinkedList");
		btn_LinkedList.setToolTipText("element(), addFirst(), addLast()");
		btn_LinkedList.setForeground(Color.BLACK);
		btn_LinkedList.setBackground(new Color(51, 209, 122));
		btn_LinkedList.setFont(font_bt);
		btn_LinkedList.setBounds(41, 342, 149, 25);
		contentPane.add(btn_LinkedList);
		
		 btn_Vector = new JButton("Vector");
		btn_Vector.setForeground(Color.BLACK);
		btn_Vector.setBackground(new Color(51, 209, 122));
		btn_Vector.setFont(font_bt);
		btn_Vector.setBounds(41, 443, 149, 25);
		contentPane.add(btn_Vector);
		
		 btn_Stack = new JButton("Stack");
		btn_Stack.setForeground(Color.BLACK);
		btn_Stack.setBackground(new Color(51, 209, 122));
		btn_Stack.setFont(font_bt);
		btn_Stack.setBounds(41, 503, 149, 25);
		contentPane.add(btn_Stack);
		
		 btn_ArrayDeque = new JButton("ArrayDeque");
		btn_ArrayDeque.setForeground(Color.BLACK);
		btn_ArrayDeque.setBackground(new Color(51, 209, 122));
		btn_ArrayDeque.setFont(font_bt);
		btn_ArrayDeque.setBounds(246, 342, 160, 25);
		contentPane.add(btn_ArrayDeque);
		
		 btn_PriorityQue = new JButton("PriorityQue");
		btn_PriorityQue.setForeground(Color.BLACK);
		btn_PriorityQue.setBackground(new Color(51, 209, 122));
		btn_PriorityQue.setFont(font_bt);
		btn_PriorityQue.setBounds(277, 262, 160, 25);
		contentPane.add(btn_PriorityQue);
		
		 btn_List = new JButton("List");
		btn_List.setToolTipText("get(), set(),  indexOf(), lastIndexOf(), subList(),listIterator()");
		btn_List.setBounds(53, 132, 117, 25);
		btn_List.setBackground(new Color(147, 112, 219));
		btn_List.setFont(font_bt);
		contentPane.add(btn_List);
		
		 btn_Queue = new JButton("Queue");
		btn_Queue.setBounds(257, 132, 117, 25);
		btn_Queue.setBackground(new Color(147, 112, 219));
		btn_Queue.setFont(font_bt);
		contentPane.add(btn_Queue);
		
		 btn_Set = new JButton("Set");
		btn_Set.setBounds(471, 132, 117, 25);
		btn_Set.setBackground(new Color(147, 112, 219));
		btn_Set.setFont(font_bt);
		contentPane.add(btn_Set);
		
		 btn_HashSet = new JButton("HashSet");
		btn_HashSet.setForeground(Color.BLACK);
		btn_HashSet.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_HashSet.setBackground(new Color(51, 209, 122));
		btn_HashSet.setBounds(515, 235, 160, 25);
		contentPane.add(btn_HashSet);
		
		 btn_LinkedHashSet = new JButton("LinkedHashSet");
		btn_LinkedHashSet.setForeground(Color.BLACK);
		btn_LinkedHashSet.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_LinkedHashSet.setBackground(new Color(51, 209, 122));
		btn_LinkedHashSet.setBounds(515, 342, 184, 25);
		contentPane.add(btn_LinkedHashSet);
		
		 btn_TreeSet = new JButton("TreeSet");
		btn_TreeSet.setToolTipText("headSet(), tailSet()");
		btn_TreeSet.setForeground(Color.BLACK);
		btn_TreeSet.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_TreeSet.setBackground(new Color(51, 209, 122));
		btn_TreeSet.setBounds(428, 505, 160, 25);
		contentPane.add(btn_TreeSet);
		
		 btn_SortedSet = new JButton("SortedSet");
		btn_SortedSet.setToolTipText("first(), last(), ceiling(), floor(), lower(), higher(), subSet(), pollFirst(), pollLast()");
		btn_SortedSet.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_SortedSet.setBackground(new Color(147, 112, 219));
		btn_SortedSet.setBounds(427, 408, 135, 25);
		contentPane.add(btn_SortedSet);
		
		 btn_Collection = new JButton("Collection");
		btn_Collection.setToolTipText("add(), addAll(), remove(), removeAll(), clear(), equals(), size(), hashCode(), "
				+ "contains(), containsAll(), isEmpty(), retainAll(), toArray()");
		btn_Collection.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_Collection.setBackground(new Color(147, 112, 219));
		btn_Collection.setBounds(246, 66, 140, 25);
		contentPane.add(btn_Collection);
		
		 btn_Iterable = new JButton("Iterable");
		btn_Iterable.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_Iterable.setBackground(new Color(147, 112, 219));
		btn_Iterable.setBounds(246, 10, 140, 25);
		contentPane.add(btn_Iterable);
		
		 btn_Map = new JButton("Map");
		btn_Map.setToolTipText("get(), equals(), isEmpty(), hashCode(), size(), clear(), "
				+ "containsKey(), containsValue(), values(), remove(), entrySet(), keySet(), put(), putAll()");
		btn_Map.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_Map.setBackground(new Color(147, 112, 219));
		btn_Map.setBounds(741, 68, 117, 25);
		contentPane.add(btn_Map);
		
		 btn_HashMap = new JButton("HashMap");
		btn_HashMap.setForeground(Color.BLACK);
		btn_HashMap.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_HashMap.setBackground(new Color(51, 209, 122));
		btn_HashMap.setBounds(828, 171, 160, 25);
		contentPane.add(btn_HashMap);
		
		 btn_LinkedHashMap = new JButton("LinkedHashMap");
		btn_LinkedHashMap.setForeground(Color.BLACK);
		btn_LinkedHashMap.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_LinkedHashMap.setBackground(new Color(51, 209, 122));
		btn_LinkedHashMap.setBounds(777, 262, 211, 25);
		contentPane.add(btn_LinkedHashMap);
		
		 btn_SortedMap = new JButton("SortedMap");
		btn_SortedMap.setToolTipText("firstEntry(), lastEntry(), ceilingEntry(), floorEntry(), "
				+ "lowerEntry(), higherEntry(), headMap(), tailMap(), subMap()");
		btn_SortedMap.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_SortedMap.setBackground(new Color(147, 112, 219));
		btn_SortedMap.setBounds(698, 408, 149, 25);
		contentPane.add(btn_SortedMap);
		
		 btn_TreeMap = new JButton("TreeMap");
		btn_TreeMap.setForeground(Color.BLACK);
		btn_TreeMap.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_TreeMap.setBackground(new Color(51, 209, 122));
		btn_TreeMap.setBounds(698, 505, 160, 25);
		contentPane.add(btn_TreeMap);
		
		 btn_Iterator = new JButton("Iterator");
		btn_Iterator.setToolTipText("hashNext(), next(), remove()");
		btn_Iterator.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_Iterator.setBackground(new Color(147, 112, 219));
		btn_Iterator.setBounds(451, 10, 108, 25);
		contentPane.add(btn_Iterator);
		
		 btn_HashTable = new JButton("HashTable");
		btn_HashTable.setForeground(Color.BLACK);
		btn_HashTable.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_HashTable.setBackground(new Color(51, 209, 122));
		btn_HashTable.setBounds(828, 361, 160, 25);
		contentPane.add(btn_HashTable);
		
		 btn_Deque = new JButton("Deque");
		btn_Deque.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn_Deque.setBackground(new Color(147, 112, 219));
		btn_Deque.setBounds(163, 188, 117, 25);
		contentPane.add(btn_Deque);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(999, 15, 338, 535);
		contentPane.add(scrollPane);
		
		lbl_tieude = new JLabel("NOI DUNG");
		lbl_tieude.setForeground(new Color(28, 113, 216));
		lbl_tieude.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tieude.setFont(new Font("Dialog", Font.BOLD, 20));
		scrollPane.setColumnHeaderView(lbl_tieude);
		
		 panelEditer_Nd = new JEditorPane();
		panelEditer_Nd.setEditable(false);
		panelEditer_Nd.setFont(new Font("Dialog", Font.BOLD, 16));
		scrollPane.setViewportView(panelEditer_Nd);
		//Line
		Button line = new Button("");
		line.setEnabled(false);
		line.setBackground(new Color(0, 0, 0));
		line.setBounds(110, 113, 425, 2);
		contentPane.add(line);
		
		Button line1_0 = new Button("New button");line1_0.setEnabled(false);line1_0.setActionCommand("");
		line1_0.setBackground(new Color(0, 0, 0));line1_0.setBounds(108, 113, 2, 20);
		contentPane.add(line1_0);Button line1_1 = new Button("New button");line1_1.setEnabled(false);
		line1_1.setBackground(Color.BLACK);line1_1.setActionCommand("");line1_1.setBounds(319, 114, 2, 20);
		contentPane.add(line1_1);Button line1_2 = new Button("New button");line1_2.setEnabled(false);
		line1_2.setBackground(Color.BLACK);line1_2.setActionCommand("");line1_2.setBounds(532, 114, 2, 20);
		contentPane.add(line1_2);Button line2 = new Button("^");line2.setEnabled(false);line2.setBackground(Color.BLACK);
		line2.setActionCommand("");line2.setBounds(319, 94, 2, 20);contentPane.add(line2);
		Button line2_1 = new Button("^");line2_1.setEnabled(false);line2_1.setBackground(Color.BLACK);
		line2_1.setActionCommand("");line2_1.setBounds(319, 38, 2, 30);contentPane.add(line2_1);
		Button line2_2 = new Button("^");line2_2.setEnabled(false);line2_2.setBackground(Color.BLACK);
		line2_2.setActionCommand("");line2_2.setBounds(388, 25, 64, 2);contentPane.add(line2_2);
		Button line2_3 = new Button("^");line2_3.setEnabled(false);line2_3.setBackground(Color.BLACK);
		line2_3.setActionCommand("");line2_3.setBounds(22, 137, 2, 20);
		contentPane.add(line2_3);Button line2_3_1 = new Button("^");line2_3_1.setEnabled(false);
		line2_3_1.setBackground(Color.BLACK);line2_3_1.setActionCommand("");line2_3_1.setBounds(22, 171, 2, 20);
		contentPane.add(line2_3_1);Button line2_3_2 = new Button("^");line2_3_2.setEnabled(false);
		line2_3_2.setBackground(Color.BLACK);line2_3_2.setActionCommand("");line2_3_2.setBounds(22, 203, 2, 20);
		contentPane.add(line2_3_2);Button line2_3_3 = new Button("^");line2_3_3.setEnabled(false);
		line2_3_3.setBackground(Color.BLACK);line2_3_3.setActionCommand("");line2_3_3.setBounds(22, 235, 2, 20);
		contentPane.add(line2_3_3);Button line2_3_4 = new Button("^");
		line2_3_4.setEnabled(false);line2_3_4.setBackground(Color.BLACK);line2_3_4.setActionCommand("");
		line2_3_4.setBounds(22, 262, 2, 20);contentPane.add(line2_3_4);Button line2_3_5 = new Button("^");
		line2_3_5.setEnabled(false);line2_3_5.setBackground(Color.BLACK);line2_3_5.setActionCommand("");
		line2_3_5.setBounds(22, 297, 2, 20);contentPane.add(line2_3_5);Button line2_3_6 = new Button("^");
		line2_3_6.setEnabled(false);line2_3_6.setBackground(Color.BLACK);line2_3_6.setActionCommand("");
		line2_3_6.setBounds(22, 324, 2, 20);contentPane.add(line2_3_6);
		Button line2_3_7 = new Button("^");line2_3_7.setEnabled(false);line2_3_7.setBackground(Color.BLACK);
		line2_3_7.setActionCommand("");	line2_3_7.setBounds(22, 361, 2, 20);contentPane.add(line2_3_7);
		Button line2_3_8 = new Button("^");line2_3_8.setEnabled(false);line2_3_8.setBackground(Color.BLACK);
		line2_3_8.setActionCommand("");line2_3_8.setBounds(22, 391, 2, 20);
		contentPane.add(line2_3_8);Button line2_3_9 = new Button("^");line2_3_9.setEnabled(false);
		line2_3_9.setBackground(Color.BLACK);line2_3_9.setActionCommand("");line2_3_9.setBounds(22, 435, 2, 20);
		contentPane.add(line2_3_9);Button line2_3_10 = new Button("^");line2_3_10.setEnabled(false);
		line2_3_10.setBackground(Color.BLACK);	line2_3_10.setActionCommand("");line2_3_10.setBounds(213, 342, 2, 20);
		contentPane.add(line2_3_10);Button line2_3_11 = new Button("^");line2_3_11.setEnabled(false);
		line2_3_11.setBackground(Color.BLACK);line2_3_11.setActionCommand("");line2_3_11.setBounds(213, 297, 2, 20);
		contentPane.add(line2_3_11);Button line2_3_12 = new Button("^");line2_3_12.setEnabled(false);
		line2_3_12.setBackground(Color.BLACK);line2_3_12.setActionCommand("");
		line2_3_12.setBounds(213, 250, 2, 20);contentPane.add(line2_3_12);
		Button line2_3_13 = new Button("^");line2_3_13.setEnabled(false);
		line2_3_13.setBackground(Color.BLACK);line2_3_13.setActionCommand("");
		line2_3_13.setBounds(213, 214, 2, 20);contentPane.add(line2_3_13);Button line2_3_14 = new Button("^");
		line2_3_14.setEnabled(false);line2_3_14.setBackground(Color.BLACK);line2_3_14.setActionCommand("");
		line2_3_14.setBounds(213, 277, 2, 20);contentPane.add(line2_3_14);
		Button line2_3_15 = new Button("^");line2_3_15.setEnabled(false);
		line2_3_15.setBackground(Color.BLACK);line2_3_15.setActionCommand("");
		line2_3_15.setBounds(506, 482, 2, 20);contentPane.add(line2_3_15);
		Button line2_3_16 = new Button("^");line2_3_16.setEnabled(false);line2_3_16.setBackground(Color.BLACK);
		line2_3_16.setActionCommand("");line2_3_16.setBounds(506, 448, 2, 20);contentPane.add(line2_3_16);
		Button line2_3_10_1 = new Button("^");
		line2_3_10_1.setEnabled(false);
		line2_3_10_1.setBackground(Color.BLACK);
		line2_3_10_1.setActionCommand("");
		line2_3_10_1.setBounds(772, 479, 2, 20);
		contentPane.add(line2_3_10_1);
		Button line2_3_10_2 = new Button("^");
		line2_3_10_2.setEnabled(false);
		line2_3_10_2.setBackground(Color.BLACK);
		line2_3_10_2.setActionCommand("");
		line2_3_10_2.setBounds(772, 448, 2, 20);
		contentPane.add(line2_3_10_2);
		Button line2_3_10_3 = new Button("^");
		line2_3_10_3.setEnabled(false);
		line2_3_10_3.setBackground(Color.BLACK);
		line2_3_10_3.setActionCommand("");
		line2_3_10_3.setBounds(759, 347, 2, 20);
		contentPane.add(line2_3_10_3);
		Button line2_3_10_4 = new Button("^");
		line2_3_10_4.setEnabled(false);
		line2_3_10_4.setBackground(Color.BLACK);
		line2_3_10_4.setActionCommand("");
		line2_3_10_4.setBounds(759, 324, 2, 20);
		contentPane.add(line2_3_10_4);
		Button line2_3_10_5 = new Button("^");
		line2_3_10_5.setEnabled(false);
		line2_3_10_5.setBackground(Color.BLACK);
		line2_3_10_5.setActionCommand("");
		line2_3_10_5.setBounds(759, 309, 2, 20);
		contentPane.add(line2_3_10_5);
		Button line2_3_10_6 = new Button("^");
		line2_3_10_6.setEnabled(false);
		line2_3_10_6.setBackground(Color.BLACK);
		line2_3_10_6.setActionCommand("");
		line2_3_10_6.setBounds(759, 277, 2, 20);
		contentPane.add(line2_3_10_6);
		Button line2_3_10_7 = new Button("^");
		line2_3_10_7.setEnabled(false);
		line2_3_10_7.setBackground(Color.BLACK);
		line2_3_10_7.setActionCommand("");
		line2_3_10_7.setBounds(759, 235, 2, 20);
		contentPane.add(line2_3_10_7);
		Button line2_3_10_8 = new Button("^");
		line2_3_10_8.setEnabled(false);
		line2_3_10_8.setBackground(Color.BLACK);
		line2_3_10_8.setActionCommand("");
		line2_3_10_8.setBounds(759, 203, 2, 20);
		contentPane.add(line2_3_10_8);
		Button line2_3_10_9 = new Button("^");
		line2_3_10_9.setEnabled(false);
		line2_3_10_9.setBackground(Color.BLACK);
		line2_3_10_9.setActionCommand("");
		line2_3_10_9.setBounds(759, 171, 2, 20);
		Button line2_3_10_10 = new Button("^");
		line2_3_10_10.setEnabled(false);
		line2_3_10_10.setBackground(Color.BLACK);
		line2_3_10_10.setActionCommand("");
		line2_3_10_10.setBounds(759, 150, 2, 20);
		contentPane.add(line2_3_10_10);
		Button line2_3_10_11 = new Button("^");
		line2_3_10_11.setEnabled(false);
		line2_3_10_11.setBackground(Color.BLACK);
		line2_3_10_11.setActionCommand("");
		line2_3_10_11.setBounds(759, 132, 2, 20);
		contentPane.add(line2_3_10_11);
		Button line2_3_10_12 = new Button("^");
		line2_3_10_12.setEnabled(false);
		line2_3_10_12.setBackground(Color.BLACK);
		line2_3_10_12.setActionCommand("");
		line2_3_10_12.setBounds(759, 99, 2, 20);
		contentPane.add(line2_3_10_12);
		Button line2_3_10_13 = new Button("^");
		line2_3_10_13.setEnabled(false);
		line2_3_10_13.setBackground(Color.BLACK);
		line2_3_10_13.setActionCommand("");
		line2_3_10_13.setBounds(786, 185, 15, 2);
		contentPane.add(line2_3_10_13);
		Button line2_3_10_13_1 = new Button("^");
		line2_3_10_13_1.setEnabled(false);
		line2_3_10_13_1.setBackground(Color.BLACK);
		line2_3_10_13_1.setActionCommand("");
		line2_3_10_13_1.setBounds(819, 185, 15, 2);
		contentPane.add(line2_3_10_13_1);
		Button line2_3_10_13_2 = new Button("^");
		line2_3_10_13_2.setEnabled(false);
		line2_3_10_13_2.setBackground(Color.BLACK);
		line2_3_10_13_2.setActionCommand("");
		line2_3_10_13_2.setBounds(759, 185, 15, 2);
		contentPane.add(line2_3_10_13_2);
		Button line2_3_10_13_3 = new Button("^");
		line2_3_10_13_3.setEnabled(false);
		line2_3_10_13_3.setBackground(Color.BLACK);
		line2_3_10_13_3.setActionCommand("");
		line2_3_10_13_3.setBounds(786, 365, 15, 2);
		contentPane.add(line2_3_10_13_3);
		Button line2_3_10_13_1_1 = new Button("^");
		line2_3_10_13_1_1.setEnabled(false);
		line2_3_10_13_1_1.setBackground(Color.BLACK);
		line2_3_10_13_1_1.setActionCommand("");
		line2_3_10_13_1_1.setBounds(819, 365, 15, 2);
		contentPane.add(line2_3_10_13_1_1);
		Button line2_3_10_13_2_1 = new Button("^");
		line2_3_10_13_2_1.setEnabled(false);
		line2_3_10_13_2_1.setBackground(Color.BLACK);
		line2_3_10_13_2_1.setActionCommand("");
		line2_3_10_13_2_1.setBounds(759, 365, 15, 2);
		contentPane.add(line2_3_10_13_2_1);
		Button line2_3_10_13_2_1_1 = new Button("^");
		line2_3_10_13_2_1_1.setEnabled(false);
		line2_3_10_13_2_1_1.setBackground(Color.BLACK);
		line2_3_10_13_2_1_1.setActionCommand("");
		line2_3_10_13_2_1_1.setBounds(196, 361, 15, 2);
		contentPane.add(line2_3_10_13_2_1_1);
		Button line2_3_10_13_2_1_2 = new Button("^");
		line2_3_10_13_2_1_2.setEnabled(false);
		line2_3_10_13_2_1_2.setBackground(Color.BLACK);
		line2_3_10_13_2_1_2.setActionCommand("");
		line2_3_10_13_2_1_2.setBounds(220, 361, 15, 2);
		contentPane.add(line2_3_10_13_2_1_2);
		Button line2_3_10_13_2_1_3 = new Button("^");
		line2_3_10_13_2_1_3.setEnabled(false);
		line2_3_10_13_2_1_3.setBackground(Color.BLACK);
		line2_3_10_13_2_1_3.setActionCommand("");
		line2_3_10_13_2_1_3.setBounds(29, 140, 15, 2);
		contentPane.add(line2_3_10_13_2_1_3);
		Button line2_3_10_13_2_1_4 = new Button("^");
		line2_3_10_13_2_1_4.setEnabled(false);
		line2_3_10_13_2_1_4.setBackground(Color.BLACK);
		line2_3_10_13_2_1_4.setActionCommand("");
		line2_3_10_13_2_1_4.setBounds(21, 250, 15, 2);
		contentPane.add(line2_3_10_13_2_1_4);
		Button line2_3_10_13_2_1_5 = new Button("^");
		line2_3_10_13_2_1_5.setEnabled(false);
		line2_3_10_13_2_1_5.setBackground(Color.BLACK);
		line2_3_10_13_2_1_5.setActionCommand("");
		line2_3_10_13_2_1_5.setBounds(24, 353, 15, 2);
		contentPane.add(line2_3_10_13_2_1_5);
		Button line2_3_10_13_2_1_6 = new Button("^");
		line2_3_10_13_2_1_6.setEnabled(false);
		line2_3_10_13_2_1_6.setBackground(Color.BLACK);
		line2_3_10_13_2_1_6.setActionCommand("");
		line2_3_10_13_2_1_6.setBounds(21, 461, 15, 2);
		contentPane.add(line2_3_10_13_2_1_6);
		Button line2_3_10_4_1 = new Button("^");
		line2_3_10_4_1.setEnabled(false);
		line2_3_10_4_1.setBackground(Color.BLACK);
		line2_3_10_4_1.setActionCommand("");
		line2_3_10_4_1.setBounds(489, 332, 2, 20);
		contentPane.add(line2_3_10_4_1);
		Button line2_3_10_5_1 = new Button("^");
		line2_3_10_5_1.setEnabled(false);
		line2_3_10_5_1.setBackground(Color.BLACK);
		line2_3_10_5_1.setActionCommand("");
		line2_3_10_5_1.setBounds(489, 317, 2, 20);
		contentPane.add(line2_3_10_5_1);
		Button line2_3_10_6_1 = new Button("^");
		line2_3_10_6_1.setEnabled(false);
		line2_3_10_6_1.setBackground(Color.BLACK);
		line2_3_10_6_1.setActionCommand("");
		line2_3_10_6_1.setBounds(489, 285, 2, 20);
		contentPane.add(line2_3_10_6_1);
		Button line2_3_10_7_1 = new Button("^");
		line2_3_10_7_1.setEnabled(false);
		line2_3_10_7_1.setBackground(Color.BLACK);
		line2_3_10_7_1.setActionCommand("");
		line2_3_10_7_1.setBounds(489, 243, 2, 20);
		contentPane.add(line2_3_10_7_1);
		
		Button line2_3_10_8_1 = new Button("^");
		line2_3_10_8_1.setEnabled(false);
		line2_3_10_8_1.setBackground(Color.BLACK);
		line2_3_10_8_1.setActionCommand("");
		line2_3_10_8_1.setBounds(489, 211, 2, 20);
		contentPane.add(line2_3_10_8_1);
		
		Button line2_3_10_9_1 = new Button("^");
		line2_3_10_9_1.setEnabled(false);
		line2_3_10_9_1.setBackground(Color.BLACK);
		line2_3_10_9_1.setActionCommand("");
		line2_3_10_9_1.setBounds(489, 179, 2, 20);
		contentPane.add(line2_3_10_9_1);
		
		Button line2_3_10_10_1 = new Button("^");
		line2_3_10_10_1.setEnabled(false);
		line2_3_10_10_1.setBackground(Color.BLACK);
		line2_3_10_10_1.setActionCommand("");
		line2_3_10_10_1.setBounds(489, 158, 2, 20);
		contentPane.add(line2_3_10_10_1);
		
		Button line2_3_10_13_2_2 = new Button("^");
		line2_3_10_13_2_2.setEnabled(false);
		line2_3_10_13_2_2.setBackground(Color.BLACK);
		line2_3_10_13_2_2.setActionCommand("");
		line2_3_10_13_2_2.setBounds(489, 245, 15, 2);
		contentPane.add(line2_3_10_13_2_2);
		
		Button line2_3_10_13_2_1_7 = new Button("^");
		line2_3_10_13_2_1_7.setEnabled(false);
		line2_3_10_13_2_1_7.setBackground(Color.BLACK);
		line2_3_10_13_2_1_7.setActionCommand("");
		line2_3_10_13_2_1_7.setBounds(489, 354, 15, 2);
		contentPane.add(line2_3_10_13_2_1_7);
		
		Button line_1 = new Button("");
		line_1.setEnabled(false);
		line_1.setBackground(Color.BLACK);
		line_1.setBounds(750, 92, 2, 310);
		contentPane.add(line_1);
		
		Button line_1_1 = new Button("");
		line_1_1.setEnabled(false);
		line_1_1.setBackground(Color.BLACK);
		line_1_1.setBounds(478, 155, 2, 250);
		contentPane.add(line_1_1);
		
		Button line2_3_15_1 = new Button("^");
		line2_3_15_1.setEnabled(false);
		line2_3_15_1.setBackground(Color.BLACK);
		line2_3_15_1.setActionCommand("");
		line2_3_15_1.setBounds(118, 468, 2, 35);
		contentPane.add(line2_3_15_1);
		
		Button line2_3_15_1_1 = new Button("^");
		line2_3_15_1_1.setEnabled(false);
		line2_3_15_1_1.setBackground(Color.BLACK);
		line2_3_15_1_1.setActionCommand("");
		line2_3_15_1_1.setBounds(319, 156, 2, 108);
		contentPane.add(line2_3_15_1_1);
		
		Button line2_3_15_1_1_1 = new Button("^");
		line2_3_15_1_1_1.setEnabled(false);
		line2_3_15_1_1_1.setBackground(Color.BLACK);
		line2_3_15_1_1_1.setActionCommand("");
		line2_3_15_1_1_1.setBounds(267, 160, 2, 30);
		contentPane.add(line2_3_15_1_1_1);
		
		Button line2_3_15_1_1_1_1 = new Button("^");
		line2_3_15_1_1_1_1.setEnabled(false);
		line2_3_15_1_1_1_1.setBackground(Color.BLACK);
		line2_3_15_1_1_1_1.setActionCommand("");
		line2_3_15_1_1_1_1.setBounds(912, 200, 2, 60);
		contentPane.add(line2_3_15_1_1_1_1);
		//End
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu mn_File = new JMenu("File");
		 menuBar.add(mn_File);
		JMenu mn_Learn = new JMenu("Learn");
		 menuBar.add(mn_Learn);
		JMenu mn_About = new JMenu("About");
		 menuBar.add(mn_About);
		
		 mn_Exit = new JMenuItem("Exit");
		 mn_Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		 mn_Exit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		 mn_File.add(mn_Exit);
		
		 mn_Gg = new JMenuItem("Search GG");
		 mn_Gg.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		 mn_Gg.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		 mn_Learn.add(mn_Gg);
		
		 mn_Quizizz = new JMenuItem("Quizizz");
		 mn_Quizizz.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		 mn_Quizizz.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		 mn_Learn.add(mn_Quizizz);
		 
		 mn_GitHub = new JMenuItem("My GitHub");
		 mn_GitHub.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		 mn_About.add(mn_GitHub);
		 
		
		//Xu ly su kien
		ActionListener a = new ControllerJFrame(this);
		
		  btn_HashSet.addActionListener(a);
		  btn_LinkedHashSet.addActionListener(a);
		  btn_TreeSet.addActionListener(a);
		  btn_SortedSet.addActionListener(a);
		  btn_Collection.addActionListener(a);
		  btn_Iterable.addActionListener(a);
		  btn_Map.addActionListener(a);
		  btn_HashMap.addActionListener(a);
		  btn_LinkedHashMap.addActionListener(a);
		  btn_SortedMap.addActionListener(a);
		  btn_TreeMap.addActionListener(a);
		  btn_Iterator.addActionListener(a);
		  btn_HashTable.addActionListener(a);
		  btn_Deque.addActionListener(a);
		  btn_ArrayDeque.addActionListener(a);
		  btn_PriorityQue.addActionListener(a);
		  btn_List.addActionListener(a);
		  btn_Queue.addActionListener(a);
		  btn_Set.addActionListener(a);
		  btn_Stack.addActionListener(a);
		  btn_Vector.addActionListener(a);
		  btn_LinkedList.addActionListener(a);
		  btn_Arraylist.addActionListener(a);
		  mn_Exit.addActionListener(a);
		  mn_Gg.addActionListener(a);
		  mn_Quizizz.addActionListener(a);
		  mn_GitHub.addActionListener(a);
	}
}
