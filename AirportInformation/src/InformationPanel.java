import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InformationPanel extends JFrame {
	int characterNumber;
	public InformationPanel(String source, String destination, int hour, int minute, String onTime) {
setLayout(new GridLayout(1,27,10,10));


		for(int i=0;i<source.length();i++){
			characterNumber = (int)(source.charAt(i)) -55;
			add(new LetterPanel(characterNumber));
		}

		addSpace(source);    //add space

		for(int i=0;i<destination.length();i++){
			characterNumber = (int)(destination.charAt(i)) -55;
			add(new LetterPanel(characterNumber));
		}

		addSpace(destination);

		characterNumber = hour%10; //to take second number of hour
		hour = hour /10;
		add(new LetterPanel(hour));
		add(new LetterPanel(characterNumber));
		add(new LetterPanel(36));      // ":" symbol

		characterNumber = minute%10; //to take second number of hour
		minute = minute /10;
		add(new LetterPanel(minute));
		add(new LetterPanel(characterNumber));

		characterNumber = 39;
		add(new LetterPanel(characterNumber));
		add(new LetterPanel(characterNumber));

		for(int i=0;i<onTime.length();i++){
			characterNumber = (int)(onTime.charAt(i)) -55;
			if(characterNumber == -23) characterNumber = 39; //to add space
			add(new LetterPanel(characterNumber));
		}

	}

	/**
	 * add space among two words
	 * @param word
	 */
	private void addSpace(String word){
		for(int i =0;i<5 - word.length();i++){
			characterNumber = 39;
			add(new LetterPanel(characterNumber));
		}
	}
}
