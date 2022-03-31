import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {

		String source = promptInput("source");
		String destination = promptInput("destination");
		int hour = promptInteger("hour" , 24);
		int minute = promptInteger("minute",60);
		String onTime = "ON TIME";

		InformationPanel window = new InformationPanel(source,destination,hour,minute,onTime);
		window.setTitle("ABB Airport");
		window.setLocationRelativeTo(null);
		window.getContentPane().setBackground(Color.BLACK);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(2400,400);
		window.setVisible(true);
	}

	private static String promptInput(String propmtValue){
		Scanner input = new Scanner(System.in);
		String word="";
		while(word.length() <=2 || word.length() > 4){
			System.out.print("Please enter the " + propmtValue  + " (min 2, max 4 character): ");
			word = input.next();
		}
		word = word.toUpperCase();
		return word;
	}
	private static int promptInteger(String propmtValue,int limit){

		int number=-1;
		while(number < 0 || number >=limit){
			System.out.print("Please enter the " + propmtValue + ": ");
			number = checkAndPromptInteger();
		}
		return number;
	}

	private static int checkAndPromptInteger(){
		int number=-1;
		String value="";
		Scanner input = new Scanner(System.in);
		while(number <0){
			value = input.next();
			if(value.length()<1){
				number = -2;
				System.out.print("Invalid value, enter again: ");
			}

			for(int i = 0;i<value.length();i++){
				char c=value.charAt(i);
				if(Character.isDigit(c)){
					number = 1;  //to exit from while
				}else{
					number = -2;
					System.out.print("Invalid value, enter again: ");
				}
			}
		}
		number = Integer.parseInt(value);
		return number;
	}
}
