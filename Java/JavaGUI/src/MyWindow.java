
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class MyWindow extends JFrame{
 
	 JTextField name, strength, defense, health;
	 JButton create, clear;
	
//constructor
MyWindow(String title){
 
super(title);
 
this.setSize(400, 650);

this.init();
this.setVisible(true);
}//end constructor

void init(){
 
JLabel lname = new JLabel("Name:");
JLabel lstrength = new JLabel("Strength:");
JLabel ldefense = new JLabel("Defense:");
JLabel lhealth = new JLabel("Health:");
 
name = new JTextField(10);
strength= new JTextField(10);
defense= new JTextField(10);
health = new JTextField(10);
 
JPanel panel = new JPanel();
panel.add(lname);
panel.add(name);
panel.add(lstrength);
panel.add(strength);
panel.add(ldefense);
panel.add(defense);
panel.add(lhealth);
panel.add(health);
 
this.add(panel);
  
}
}