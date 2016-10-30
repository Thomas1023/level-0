import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class CodingExersise1 {
 public static void main(String[] args) {
	 Robot k9 = new Robot();
	String colur=JOptionPane.showInputDialog("What color do you want this \"robot\" to draw?");
	k9.setPenWidth(10);
	k9.penDown();
	k9.setSpeed(10);
	if(colur .equalsIgnoreCase("red")){
		k9.setPenColor(200, 100, 100);
	}else if(colur .equalsIgnoreCase("green")){
		k9.setPenColor(100, 200, 100);
	}else if(colur .equalsIgnoreCase("blue")){
		k9.setPenColor(100, 100, 200);
	}else{
		JOptionPane.showMessageDialog(null, "I applogise I am verry bad a rgb values and do not know how to depict that\n Please try over for your vewing plesure here it is in black.");
	}
	for(int i=0;i<8;i++){
	k9.move(50);
	k9.turn(45);
	}
}
}
