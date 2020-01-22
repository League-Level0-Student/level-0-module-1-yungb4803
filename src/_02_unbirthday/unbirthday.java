
package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
String month=JOptionPane.showInputDialog("Is today your birthday?");
if(month.equals("Yes")) {
	
	JOptionPane.showMessageDialog(null, "Happy Birthday");
}

else {
	JOptionPane.showMessageDialog(null, "Merry unbirthday");
}




}
	
	

}
