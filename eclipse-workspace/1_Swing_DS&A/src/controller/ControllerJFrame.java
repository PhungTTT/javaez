package controller;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import view.JFrameMain;

public class ControllerJFrame implements ActionListener {
	private JFrameMain view;
	
	/**
	 * @param view
	 */
	public ControllerJFrame(JFrameMain view) {
		this.view = view;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		if(ac .equals("Exit")) {
			System.exit(0);
		}else if(ac.equals("Search GG")) {
			try {
		    Desktop	.getDesktop().browse(new URL("https://www.google.com").toURI());
			} catch (Exception ex) {}
		}else if(ac.equals("My GitHub")) {
			try {
			    Desktop	.getDesktop().browse(new URL("https://github.com/PhungTTT").toURI());
				} catch (Exception ex) {}
			}
		else if(e.getSource()==view.btn_Set) {
			if (Desktop.isDesktopSupported()) {
	            try {
	                File myFile = new File("data/Set.pdf");
	                Desktop.getDesktop().open(myFile);
	            } catch (IOException ex) {
	                // no application registered for PDFs
	            }
	        }
		}
		else if(e.getSource()==view.btn_Map) {
			if (Desktop.isDesktopSupported()) {
	            try {
	                File myFile = new File("data/Map.pdf");
	                Desktop.getDesktop().open(myFile);
	            } catch (IOException ex) {
	                // no application registered for PDFs
	            }
	        }
		}else if(e.getSource()==view.btn_List) {
			if (Desktop.isDesktopSupported()) {
	            try {
	                File myFile = new File("data/Iterator_List_LinkedList.pdf");
	                Desktop.getDesktop().open(myFile);
	            } catch (IOException ex) {
	                // no application registered for PDFs
	            }
	        }
		}else if(e.getSource()==view.btn_Stack) {
			this.view.lbl_tieude.setText("Stack");
			view.panelEditer_Nd.setText("A stack is an ADT – Abstract Data Type or a linear data structure. "
					+ "t is a LIFO data structure because it allows all data operations at one end only i.e. elements "
					+ "can be added and removed from the stack only at the top."
					+ "LIFO stands for Last-in-first-out. The element which is inserted last, is accessed first."
					+ "\nMethod:\n +push(): Pushing an element on the stack."
					+ "\n +pop(): Removing an element from the stack."
					+ "\n +push(): peek(): Get the top data element of the stack, without removing it."
					+ "\n +isFull(): Check if stack is full."
					+ "\n +isEmpty(): Check if stack is empty.");	
		}
	}

}
