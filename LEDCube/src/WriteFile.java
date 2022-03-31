import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WriteFile extends JPanel{
	JPanel panel = new JPanel(new BorderLayout());
	JButton erase = new JButton("delete log");
	static JTextArea textArea = new JTextArea(10,50);
	public WriteFile(){	
		panel.add(erase,BorderLayout.SOUTH);
		panel.add(textArea, BorderLayout.CENTER);
		JScrollPane scrollPane = new JScrollPane(textArea);
		panel.add(scrollPane,BorderLayout.CENTER);
		add(panel);
		ButtonListener listener = new ButtonListener();
		erase.addActionListener(listener);
	}
	String result;
	public WriteFile(String result){
		this.result = result;
		System.out.println(textArea.getText());
		textArea.setText(textArea.getText()+result + "\n");
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("logs deleted");
			textArea.setText(" ");
		}
	}
}
