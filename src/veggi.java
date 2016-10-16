import javax.swing.JOptionPane;

public class veggi {
	
	public static void main(String[] args) {
		
		String num1 =JOptionPane.showInputDialog("wrie a number");
		String num2 =JOptionPane.showInputDialog("wrie a number");
		String num3 =JOptionPane.showInputDialog("wrie a number");
		
		int uno = Integer.parseInt(num1);
		int dos = Integer.parseInt(num2);
		int tres = Integer.parseInt(num3);
		if(uno>dos && dos>tres){
			System.out.println(uno+dos+tres);
		
	}else{
		if(dos>uno && uno>tres){
			
		}
	}

}
	}