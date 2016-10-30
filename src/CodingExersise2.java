import javax.swing.JOptionPane;

public class CodingExersise2 {
public static void main(String[] args) {
	int year;
 String age=JOptionPane.showInputDialog("enter age");
 int agei= Integer.parseInt(age);
 if(agei>30){
	 JOptionPane.showMessageDialog(null,"you are too old");
 }else{
	 year=2016-agei;
	 JOptionPane.showMessageDialog(null,"you were born in"+year);
 }
 
}
}
