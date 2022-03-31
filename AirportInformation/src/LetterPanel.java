import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LetterPanel extends JPanel {
	int type;
	public LetterPanel(int type) {
			this.type = type;
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int x=getSize().width;
			int y = getSize().height;
			g.setColor(Color.BLACK);
			g.fillRect((int)(0*x),(int)(0*y),(int)(x),(int)(y));
			
			switch(type) {
			case 39:for(int i=0;i<5;i++){    //39 is for empty
						for(int j=0;j<7;j++){
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
				};break;
			case 0:for(int i=0;i<5;i++){        //0 is for 0
						for(int j=0;j<7;j++){
							if(j==0 && i>0 && i<4 || j==6 && i>0 && i<4){
								g.setColor(Color.GREEN);
								g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
							}
							else if(j>0 && j<6 && i==0 ||j>0 && j<6 && i == 4){
								g.setColor(Color.GREEN);
								g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
							}
							else if(j==2 && i==3 || j==3 && i==2 || j==4 && i==1){
								g.setColor(Color.GREEN);
								g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
							}
							else{
								g.setColor(new Color(33,32,32));
								g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
							}
						}
				};break;
			case 1:              //display 1
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i==3 || j==1 && i>0 && i <4 || j>1 && i==3){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 2:              //display 2
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i>0 && i<4 || j==1 && i==0 ||j==1 && i==4 || j==2 && i==4 || j==3 && i==3 ){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else if(j==4 && i == 2 || j==5 && i == 1 || j==6){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 3:              //display 3
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i>0 && i<4 || j==1 && i==0 ||j==1 && i==4 || j==2 && i==4 || j==3 && i>0 && i<4 ){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else if(j==4 && i == 4 || j==5 && i == 0 || j==5 && i == 4 || j==6 && i>0 && i<4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 4:              //display 4
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i ==3 || j==1 && i ==2 || j ==2 && i==1 || j==3 && i == 0 || j==4 ){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 5:              //display 5
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 || j>0 && j < 4 && i ==0 || j == 3 && i <4 || j >3 && j <6 && i==4 || j==6 && i<4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 6:              //display 6
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i >0 && i<4 || j>0 && j<6 && i==0 ||j==1 && i == 4 || j==3 && i <4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else if(j>3 && j <6 && i == 4 || j==6 && i>0 && i < 4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 7:              //display 7
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j == 0 || j >0 && j <3 && i==4 || j==3 && i==3 || j>3 && i==2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 8:              //display 8
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i>0 && i < 4 || j ==3 && i>0 && i < 4 || j == 6 && i>0 && i < 4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else if((j%3)!=0 && i==0 || (j%3)!=0 && i==4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 9:              //display 9
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i>0 && i<4 || j>0 && j <3 && i ==0 || j==3 && i >0 || j==5 && i==0){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else if(j==6 && i>0 && i <4 || j>0 && j<6 && i ==4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 10:              //display A = 10
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i>0 && i<4 || j>0 && i==0 || j>0  && i==4 || j==3 ){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 11:              //display B
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i==0 || (j%3)==0 && i <4 || (j%3)!= 0 && i==4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 12:              //display C
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i >0 && i <4 || j>0 && j<6 && i==0 || j==1 && i==4 || j==5 && i==4 ||j==6 && i >0 && i <4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 13:              //display D
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0  && i<4 || j==6 && i<4 || j>0 && j <6 && i==0 || j>0 && j <6 && i==4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 14:              //display E
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j<1 || j >5 || i==0 || j==3 && i <4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 15:              //display F
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j == 0 || j == 3 || i==0){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 16:              //display G
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0&& i>0&&i<4 ||j==6&& i>0&&i<4||j>0 && j<6&& i==0|| j==1 && i==4||j==3&&i>1||j>3&&j<6&&i==4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 17:              //display H
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i == 0 || i == 4 || j==3){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 18:              //display I
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i==2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 19:              //display J
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i == 3 && j<6 || j == 6 && i == 2 || j>3 && j <6 && i==1 ){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 20:              //display K
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i == 0 || (j+i)==4 || (j-i) == 2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 21:              //display L
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i==0 || j==6){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 22:              //display M
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i==0 || i == 4 || j==1 && i ==1 || j==1 && i == 3 || j>1 && j <4 && i==2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 23:              //display N
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i == 0 || i == 4 || (j-i)==1){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 24:              //display O
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i >0 && i <4 || j==6 && i >0 && i <4 || j > 0 && j < 6 && i == 0 || j>0&&j<6&&i==4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 25:              //display P
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i==0 || j == 0 && i <4 || j == 3 && i <4 || j>0 && j <3 && i == 4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 26:              //display Q
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 && i >0 && i <4 || j==6 && i >0||j>0&&j<6&&i==0||j>0&&j<6&&i==4||j==4&&i==2||j==5&&i==3){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 27:              //display R
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(i==0 || j == 0 && i <4 || j == 3 && i <4 || j>0 && j <3 && i == 4 || (j-i)==2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 28:              //display S
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if((j%3)==0 && i >0 && i <4 || j>0 && j <3 && i ==0 || j==1 &&i==4||j>3&&j<6&&i==4||j==5&&i==0){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 29:              //display T
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 || i == 2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 30:              //display U
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j < 6 && i == 0 || j< 6 && i == 4 || j ==6 && i>0 && i <4){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 31:              //display V
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j < 5 && i == 0 || j< 5 && i == 4 || j == 5 && i == 1 || j == 5 && i ==3 || j == 6 && i ==2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 32:              //display W
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j < 6 && i == 0 || j< 6 && i == 4 || j >3 && j <6 && i == 2 || j==6 && i == 1 || j==6 && i ==3){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 33:              //display X
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j<2&&i==0||j<2&&i==4||j>4&&i==0||j>4&&i==4||j==2&&i==1||j==2&&i==3||j==3&&i==2||j==4&&i==1||j==4&&i==3 ){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 34:              //display Y
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j < 3 && i == 0 || j< 3 && i == 4 || j == 3 &&i==1||j== 3&&i==3||j == 4 && i==2 ||j>3&&i==2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 35:              //display Z
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==0 || j ==6 || (j+i)==5){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			case 36:              //display :
				for(int i=0;i<5;i++){
					for(int j=0;j<7;j++){
						if(j==1 && i ==2 || j == 5 && i == 2){
							g.setColor(Color.GREEN);
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
						else{
							g.setColor(new Color(33,32,32));
							g.fillOval((int)(0.2*x*i),(int)(0.04*y*j),(int)(0.2*x),(int)(0.02*y));
						}
					}
				};break;
			}
		}
}