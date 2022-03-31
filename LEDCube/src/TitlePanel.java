import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel{
	JButton urlButton = new JButton("tiklayin");
	public TitlePanel(){
		JPanel titlePanel = new JPanel();
		Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 13);
		titlePanel.setLayout(new BorderLayout());
		JLabel label = new JLabel();
		JLabel label2 = new JLabel("\t           \t\t                                                v1.3");
		label2.setFont(myFont);
		label.setFont(myFont);
		label.setText("tum haklari AGALAR As. Ltd. tarafindan saklidir \n bize ulasmak icin ");
		titlePanel.add(label,BorderLayout.NORTH);	
		titlePanel.add(label2,BorderLayout.SOUTH);
		titlePanel.add(urlButton,BorderLayout.CENTER);
		urlButton.setFont(myFont);
		ButtonListener listener = new ButtonListener();
		urlButton.addActionListener(listener);
		add(titlePanel);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
    		String url = "http://agalar.in//";
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI(url));
                } catch (IOException | URISyntaxException e1) {
                }
            }else{
                Runtime runtime = Runtime.getRuntime();
                try {
                    runtime.exec("xdg-open " + url);
                } catch (IOException e1) {
                }
            }
    	}
    }
}
