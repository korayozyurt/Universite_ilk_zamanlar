import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		MainPanel window = new MainPanel();

		window.setSize(800,300);
		window.setTitle("agalar As. Ltd. v1.2");
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		Timer t = new Timer(true);        
		t.schedule(new TimerTask() {
		    @Override
		    public void run() {
		    	//auto pack in every 10millisecond
		    	window.pack();
		    }
		},10);  
	}
}
