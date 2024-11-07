package ReturnType;

public class ex2 {

	public static void main(String []args) {
		ex2 obj = new ex2();
		int execute = obj.m1(10, 20); 
		int exe2 =obj.m2();
				
		System.out.println("a+b :"+ execute +"\n"+  "exe2   :" + exe2);
	}
	
	public int  m1(int a , int b) 
	{
		int c=a+b;
		return c;
	}
	
	int m2() {
		return 20;}
}
