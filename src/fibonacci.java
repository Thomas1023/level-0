
public class fibonacci {
	static int a=0;
	static int b=1;
	static int c=1;
	static int e;
 public static void main(String[] args) {
	 System.out.println("0\n1\n1");
	 while(true){
	 e=c+b;
	System.out.println(e);
	c=e;
	e=c+b;
	System.out.println(e);
	b=e;
	 }
}
}
