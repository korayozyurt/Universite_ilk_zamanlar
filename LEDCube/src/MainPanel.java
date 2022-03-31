import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainPanel extends JFrame{
	
	LeftPanel p0= new LeftPanel("");
	LeftPanel p1= new LeftPanel("");
	LeftPanel p2= new LeftPanel("");
	LeftPanel p3= new LeftPanel("");
	LeftPanel p4= new LeftPanel("");
	LeftPanel p5= new LeftPanel("");
	JButton createButton = new JButton("take locations");
	int P0Check0Location=0;
	int P0Check1Location=0;
	int P0Check2Location=0;
	int P0Check3Location=0;
	int P0Check4Location=0;
	int P0Check5Location=0;
	int[] points = new int[36];
	//comboBox
	String[] z = {"layer0","layer1","layer2","layer3","layer4","layer5"};
	String result;  //I will send WriteFile 
	JComboBox comboBox = new JComboBox(z);
        //clean button
        JButton clearButton = new JButton("clear selected items");
	public MainPanel(){
		this.setIconImage(new ImageIcon(getClass().getResource("agalarPng.png")).getImage());

		JPanel panelLeft = new JPanel();
		panelLeft.setLayout(new GridLayout(1,6));
		panelLeft.add(p0);		
		panelLeft.add(p1);		
		panelLeft.add(p2);		
		panelLeft.add(p3);		
		panelLeft.add(p4);		
		panelLeft.add(p5);		
		//create comboBox	
		JPanel panelCombo = new JPanel();
		panelCombo.setLayout(new BorderLayout());
		panelCombo.add(comboBox,BorderLayout.SOUTH);
		//main panel
		WriteFile forpanel = new WriteFile();
		ButtonListener btnlistener = new ButtonListener();
		createButton.addActionListener(btnlistener);
		JPanel panelRight = new JPanel();
		panelRight.setLayout(new BorderLayout());
		panelRight.add(createButton,BorderLayout.EAST);
		panelRight.add(panelLeft,BorderLayout.WEST);
		panelRight.add(panelCombo, BorderLayout.SOUTH);
		panelRight.add(forpanel,BorderLayout.CENTER);
                //clear panel
                JPanel panelSouth = new JPanel();
                panelSouth.setLayout(new BorderLayout());
                panelSouth.add(clearButton);
                panelCombo.add(panelSouth,BorderLayout.CENTER);
		add(panelRight);
                ClearListener listenerClear = new ClearListener();
                clearButton.addActionListener(listenerClear);
		//TABS
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add("coordinats",panelRight);
		add(tabbedPane,BorderLayout.CENTER);
		//titlePanel
		TitlePanel titlePanel = new TitlePanel();
		tabbedPane.add("about",titlePanel);
		//COLOURS COLOURS COLOUR!!!!
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){			
			//CHECK0 STARTS HERE!!!
			//**********************************************\\
			if(p0.locationCheck0!=null){
				//Check0
				char[] check0 = p0.locationCheck0.toCharArray();
				P0Check0Location = ((int)(check0[0])-48)*10;
				P0Check0Location = P0Check0Location +((int)(check0[1])-48);
				points[30]=P0Check0Location;
				if(p1.locationCheck0!=null){
					points[31]=P0Check0Location+1;
				}
				else if(p1.locationCheck0==null){
					points[31]=0;
				}
				//p2
				if(p2.locationCheck0!=null){
					points[32]=P0Check0Location+2;
				}
				else if(p2.locationCheck0==null){
					points[32]=0;
				}
				//p3
				if(p3.locationCheck0!=null){
					points[33]=P0Check0Location+3;
				}
				else if(p3.locationCheck0==null){
					points[33]=0;
				}
				//p4
				if(p4.locationCheck0!=null){
					points[34]=P0Check0Location+4;
				}
				else if(p4.locationCheck0==null){
					points[34]=0;
				}
				//p5
				if(p5.locationCheck0!=null){
					points[35]=P0Check0Location+5;
				}
				else if(p1.locationCheck0==null){
					points[35]=0;
				}
			}
			//CHECK0 ELSE IF
			//*****************************************************\\
			else if(p0.locationCheck0==null){
				P0Check0Location =0;
				points[30]=0;
				if(p1.locationCheck0!=null){
					points[31]=P0Check0Location+32;
				}
				else if(p1.locationCheck0==null){
					points[31]=0;
				}
				//p2
				if(p2.locationCheck0!=null){
					points[32]=P0Check0Location+33;
				}
				else if(p2.locationCheck0==null){
					points[32]=0;
				}
				//p3
				if(p3.locationCheck0!=null){
					points[33]=P0Check0Location+34;
				}
				else if(p3.locationCheck0==null){
					points[33]=0;
				}
				//p4
				if(p4.locationCheck0!=null){
					points[34]=P0Check0Location+35;
				}
				else if(p4.locationCheck0==null){
					points[34]=0;
				}
				//p5
				if(p5.locationCheck0!=null){
					points[35]=P0Check0Location+36;
				}
				else if(p1.locationCheck0==null){
					points[35]=0;
				}
			}
			//CHECK1 STARTS HERE!!!!!!
			//***********************************************\\
			if(p0.locationCheck1!=null){
				//Check1
				char[] check1 = p0.locationCheck1.toCharArray();
				P0Check1Location = ((int)(check1[0])-48)*10;
				P0Check1Location = P0Check1Location +((int)(check1[1])-48);
				points[24]=P0Check1Location;
				if(p1.locationCheck1!=null){
					points[25]=P0Check1Location+1;
				}
				else if(p1.locationCheck1==null){
					points[25]=0;
				}
				//p2
				if(p2.locationCheck1!=null){
					points[26]=P0Check1Location+2;
				}
				else if(p2.locationCheck1==null){
					points[26]=0;
				}
				//p3
				if(p3.locationCheck1!=null){
					points[27]=P0Check1Location+3;
				}
				else if(p3.locationCheck1==null){
					points[27]=0;
				}
				//p4
				if(p4.locationCheck1!=null){
					points[28]=P0Check1Location+4;
				}
				else if(p4.locationCheck1==null){
					points[28]=0;
				}
				//p5
				if(p5.locationCheck1!=null){
					points[29]=P0Check1Location+5;
				}
				else if(p1.locationCheck1==null){
					points[29]=0;
				}
			}
			//CHECK1 ELSE IF
			//***********************************************\\
			else if(p0.locationCheck1==null){
				P0Check1Location =0;
				points[24]=0;
				if(p1.locationCheck1!=null){
					points[25]=P0Check1Location+26;
				}
				else if(p1.locationCheck1==null){
					points[25]=0;
				}
				//p2
				if(p2.locationCheck1!=null){
					points[26]=P0Check1Location+27;
				}
				else if(p2.locationCheck1==null){
					points[26]=0;
				}
				//p3
				if(p3.locationCheck1!=null){
					points[27]=P0Check1Location+28;
				}
				else if(p3.locationCheck1==null){
					points[27]=0;
				}
				//p4
				if(p4.locationCheck1!=null){
					points[28]=P0Check1Location+29;
				}
				else if(p4.locationCheck1==null){
					points[28]=0;
				}
				//p5
				if(p5.locationCheck1!=null){
					points[29]=P0Check1Location+30;
				}
				else if(p1.locationCheck1==null){
					points[29]=0;
				}
			}
			//CHECK2 STARTS HERE
			//*******************************************************\\
			if(p0.locationCheck2!=null){
				//Check2
				char[] check2 = p0.locationCheck2.toCharArray();
				P0Check2Location = ((int)(check2[0])-48)*10;
				P0Check2Location = P0Check2Location +((int)(check2[1])-48);
				points[18]=P0Check2Location;
				if(p1.locationCheck2!=null){
					points[19]=P0Check2Location+1;
				}
				else if(p1.locationCheck2==null){
					points[19]=0;
				}
				//p2
				if(p2.locationCheck2!=null){
					points[20]=P0Check2Location+2;
				}
				else if(p2.locationCheck2==null){
					points[20]=0;
				}
				//p3
				if(p3.locationCheck2!=null){
					points[21]=P0Check2Location+3;
				}
				else if(p3.locationCheck2==null){
					points[21]=0;
				}
				//p4
				if(p4.locationCheck2!=null){
					points[22]=P0Check2Location+4;
				}
				else if(p4.locationCheck2==null){
					points[22]=0;
				}
				//p5
				if(p5.locationCheck2!=null){
					points[23]=P0Check2Location+5;
				}
				else if(p1.locationCheck2==null){
					points[23]=0;
				}
			}
			//CHECK2 ELSE IF START HERE!!!!
			//**************************************\\
			else if(p0.locationCheck2==null){
				P0Check2Location =0;
				points[18]=0;
				if(p1.locationCheck2!=null){
					points[19]=P0Check2Location+20;
				}
				else if(p1.locationCheck2==null){
					points[19]=0;
				}
				//p2
				if(p2.locationCheck2!=null){
					points[20]=P0Check2Location+21;
				}
				else if(p2.locationCheck2==null){
					points[20]=0;
				}
				//p3
				if(p3.locationCheck2!=null){
					points[21]=P0Check2Location+22;
				}
				else if(p3.locationCheck2==null){
					points[21]=0;
				}
				//p4
				if(p4.locationCheck2!=null){
					points[22]=P0Check2Location+23;
				}
				else if(p4.locationCheck2==null){
					points[22]=0;
				}
				//p5
				if(p5.locationCheck2!=null){
					points[23]=P0Check2Location+24;
				}
				else if(p1.locationCheck2==null){
					points[23]=0;
				}
			}
			//CHECK3 IS START HERE
			//********************************************************\\
			if(p0.locationCheck3!=null){
				//Check3
				char[] check3 = p0.locationCheck3.toCharArray();
				P0Check3Location = ((int)(check3[0])-48)*10;
				P0Check3Location = P0Check3Location +((int)(check3[1])-48);
				points[12]=P0Check3Location;
				if(p1.locationCheck3!=null){
					points[13]=P0Check3Location+1;
				}
				else if(p1.locationCheck3==null){
					points[13]=0;
				}
				//p2
				if(p2.locationCheck3!=null){
					points[14]=P0Check3Location+2;
				}
				else if(p2.locationCheck3==null){
					points[14]=0;
				}
				//p3
				if(p3.locationCheck3!=null){
					points[15]=P0Check3Location+3;
				}
				else if(p3.locationCheck3==null){
					points[15]=0;
				}
				//p4
				if(p4.locationCheck3!=null){
					points[16]=P0Check3Location+4;
				}
				else if(p4.locationCheck3==null){
					points[16]=0;
				}
				//p5
				if(p5.locationCheck3!=null){
					points[17]=P0Check3Location+5;
				}
				else if(p1.locationCheck3==null){
					points[17]=0;
				}
			}//CHECK3           ELSE IF
			//********************************************************\\
			else if(p0.locationCheck3==null){
				P0Check3Location =0;
				points[12]=0;
				if(p1.locationCheck3!=null){
					points[13]=P0Check3Location+14;
				}
				else if(p1.locationCheck3==null){
					points[13]=0;
				}
				//p2
				if(p2.locationCheck3!=null){
					points[14]=P0Check3Location+15;
				}
				else if(p2.locationCheck3==null){
					points[14]=0;
				}
				//p3
				if(p3.locationCheck3!=null){
					points[15]=P0Check3Location+16;
				}
				else if(p3.locationCheck3==null){
					points[15]=0;
				}
				//p4
				if(p4.locationCheck3!=null){
					points[16]=P0Check3Location+17;
				}
				else if(p4.locationCheck3==null){
					points[16]=0;
				}
				//p5
				if(p5.locationCheck3!=null){
					points[17]=P0Check3Location+18;
				}
				else if(p1.locationCheck3==null){
					points[17]=0;
				}
			}
			//CHECK4 CHECK4 IS START HERE
			//********************************************************\\
			if(p0.locationCheck4!=null){
				//Check4
				char[] check4 = p0.locationCheck4.toCharArray();
				P0Check4Location = ((int)(check4[0])-48);
				points[6]=P0Check4Location;
				if(p1.locationCheck4!=null){
					points[7]=P0Check4Location+1;
				}
				else if(p1.locationCheck4==null){
					points[7]=0;
				}
				//p2
				if(p2.locationCheck4!=null){
					points[8]=P0Check4Location+2;
				}
				else if(p2.locationCheck4==null){
					points[8]=0;
				}
				//p3
				if(p3.locationCheck4!=null){
					points[9]=P0Check4Location+3;
				}
				else if(p3.locationCheck4==null){
					points[9]=0;
				}
				//p4
				if(p4.locationCheck4!=null){
					points[10]=P0Check4Location+4;
				}
				else if(p4.locationCheck4==null){
					points[10]=0;
				}
				//p5
				if(p5.locationCheck4!=null){
					points[11]=P0Check4Location+5;
				}
				else if(p1.locationCheck4==null){
					points[11]=0;
				}
			}
			else if(p0.locationCheck4==null){
				P0Check4Location =0;
				points[6]=0;
				if(p1.locationCheck4!=null){
					points[7]=P0Check4Location+8;
				}
				else if(p1.locationCheck4==null){
					points[7]=0;
				}
				//p2
				if(p2.locationCheck4!=null){
					points[8]=P0Check4Location+9;
				}
				else if(p2.locationCheck4==null){
					points[8]=0;
				}
				//p3
				if(p3.locationCheck4!=null){
					points[9]=P0Check4Location+10;
				}
				else if(p3.locationCheck4==null){
					points[9]=0;
				}
				//p4
				if(p4.locationCheck4!=null){
					points[10]=P0Check4Location+11;
				}
				else if(p4.locationCheck4==null){
					points[10]=0;
				}
				//p5
				if(p5.locationCheck4!=null){
					points[11]=P0Check4Location+12;
				}
				else if(p1.locationCheck4==null){
					points[11]=0;
				}
			}
			//P0 CHECK5 IS START HERE
			//************************************************************************************\\
			if(p0.locationCheck5!=null){
				//Check5
				char[] check5 = p0.locationCheck5.toCharArray();
				P0Check5Location = ((int)(check5[0])-48);
				points[0]=P0Check5Location;
				if(p1.locationCheck5!=null){
					points[1]=P0Check5Location+1;
				}
				else if(p1.locationCheck5==null){
					points[1]=0;
				}
				//p2
				if(p2.locationCheck5!=null){
					points[2]=P0Check5Location+2;
				}
				else if(p2.locationCheck5==null){
					points[2]=0;
				}
				//p3
				if(p3.locationCheck5!=null){
					points[3]=P0Check5Location+3;
				}
				else if(p3.locationCheck5==null){
					points[3]=0;
				}
				//p4
				if(p4.locationCheck5!=null){
					points[4]=P0Check5Location+4;
				}
				else if(p4.locationCheck5==null){
					points[4]=0;
				}
				//p5
				if(p5.locationCheck5!=null){
					points[5]=P0Check5Location+5;
				}
				else if(p1.locationCheck5==null){
					points[5]=0;
				}
			}
			//if p05 is null
			else if(p0.locationCheck5==null){
				P0Check5Location =0;
				points[0]=P0Check5Location;
				if(p1.locationCheck5!=null){
					points[1]=P0Check5Location+2;
				}
				else if(p1.locationCheck5==null){
					points[1]=0;
				}
				//p2
				if(p2.locationCheck5!=null){
					points[2]=P0Check5Location+3;
				}
				else if(p2.locationCheck5==null){
					points[2]=0;
				}
				//p3
				if(p3.locationCheck5!=null){
					points[3]=P0Check5Location+4;
				}
				else if(p3.locationCheck5==null){
					points[3]=0;
				}
				//p4
				if(p4.locationCheck5!=null){
					points[4]=P0Check5Location+5;
				}
				else if(p4.locationCheck5==null){
					points[4]=0;
				}
				//p5
				if(p5.locationCheck5!=null){
					points[5]=P0Check5Location+6;
				}
				else if(p1.locationCheck5==null){
					points[5]=0;
				}
			}
			result = "l" +comboBox.getSelectedIndex() + "(" ;
			for(int i =0;i<points.length;i++){
				if(points[i]!=0){
					points[i]=1;
				}
				result = result +points[i];
				if(i!=35){
					result = result +",";
				}
			}
			result = result +(")");
			System.out.print(result);
			WriteFile file = new WriteFile(result);
			result = null;
		}
	}
        private class ClearListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                //set Cleans
			p0.setClean(); 
			p1.setClean(); 
			p2.setClean(); 
			p3.setClean(); 
			p4.setClean();
			p5.setClean(); 
                        result = null;
            }
        }
}
