package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotepadView;

public class MyNotepadController implements ActionListener{
	MyNotepadView myNotepadView;
	
	
	public MyNotepadController(MyNotepadView myNotepadView) {
		super();
		this.myNotepadView = myNotepadView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		JFileChooser fileChooser = new JFileChooser();
		
		if(command.equals("Open")) {
			//Dat vi tri hien thi hop thoai la E:
			fileChooser.setCurrentDirectory(new File("src\\" ));
			
			//select file to open
			int returnval =fileChooser.showOpenDialog(this.myNotepadView);//Hien thi JFilechooser
			if(returnval == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				this.myNotepadView.model.setFileName(file.getAbsolutePath());//Lay duong dan tuyet doi
				this.myNotepadView.lblNewLabel.setText(this.myNotepadView.model.getFileName());
				String fileName = file.getName();
				if(fileName.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result ="";
						for (String line : allText) {
							result+=line;
							result+="\n";
						}
						this.myNotepadView.model.setContent(result);
						this.myNotepadView.textArea.setText(this.myNotepadView.model.getContent());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		}else if(command.equals("Save")) {
			if(this.myNotepadView.model.getFileName().length() > 0) {
				save(this.myNotepadView.model.getFileName());
			}else {
				//select file to save
				int returnval =fileChooser.showSaveDialog(this.myNotepadView);//Hien thi JFilechooser
				if(returnval == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					save(file.getAbsolutePath());
					
				}
			}
		}
	}
	/**
	 * Save Method
	 * @param fileName
	 */
	public void save(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.myNotepadView.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
