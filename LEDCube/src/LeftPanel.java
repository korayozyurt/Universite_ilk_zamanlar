import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class LeftPanel extends JPanel{
	JCheckBox check0 = new JCheckBox();
	JCheckBox check1 = new JCheckBox();
	JCheckBox check2 = new JCheckBox();
	JCheckBox check3 = new JCheckBox();
	JCheckBox check4 = new JCheckBox();
	JCheckBox check5 = new JCheckBox();
	public String locationCheck0;
	public String locationCheck1;
	public String locationCheck2;
	public String locationCheck3;
	public String locationCheck4;
	public String locationCheck5;
	public LeftPanel(String location) {
		check0.setText(location);
		check1.setText(location);
		check2.setText(location);
		check3.setText(location);
		check4.setText(location);
		check5.setText(location);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,1));
		panel.add(check0);
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(check4);
		panel.add(check5);
		add(panel);
		CheckBoxListener checkListener = new CheckBoxListener();
		check0.addItemListener(checkListener);
		check1.addItemListener(checkListener);
		check2.addItemListener(checkListener);
		check3.addItemListener(checkListener);
		check4.addItemListener(checkListener);
		check5.addItemListener(checkListener);

	}
	private class CheckBoxListener implements ItemListener {
		public void itemStateChanged(ItemEvent e){
			if(check0.isSelected()==true){
				locationCheck0="31 " ;
			}
			else{
				locationCheck0=null;
			}
			if(check1.isSelected()==true){
				locationCheck1="25 "  ;
			}
			else{
				locationCheck1=null;
			}
			if(check2.isSelected()==true){
				locationCheck2="19 "  ;
			}
			else{
				locationCheck2=null;
			}
			if(check3.isSelected()==true){
				locationCheck3="13 "  ;
			}
			else{
				locationCheck3=null;
			}
			if(check4.isSelected()==true){
				locationCheck4="7 "  ;
			}
			else{
				locationCheck4=null;
			}
			if(check5.isSelected()==true){
				locationCheck5="1 " ;
			}
			else{
				locationCheck5=null;
			}
		}
	}
	public String getCheck0(){
		return locationCheck0;
	}
	public String getCheck1(){
		return locationCheck1;
	}
	public String getCheck2(){
		return locationCheck2;
	}
	public String getCheck3(){
		return locationCheck3;
	}
	public String getCheck4(){
		return locationCheck4;
	}
	public String getCheck5(){
		return locationCheck5;
	}
	public void setClean(){
		//cleanbox
		check0.setSelected(false);
		check1.setSelected(false);
		check2.setSelected(false);
		check3.setSelected(false);
		check4.setSelected(false);
		check5.setSelected(false);
	}
	
}
