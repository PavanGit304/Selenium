package ReturnType;

public class ex1 {
/*return type : void it doesn't returns anything to the method OR 
if the return type is other then the void then we must return that type of value */
	public static void main(String[] args) {

		ex1 obj = new ex1();
	
		int exe = obj.m1(); // assign the object of method to int exe variable 
		int exe1=obj.m2(10, 5);
		System.out.println("a+b =" + exe +"\n"+exe1);
	}

	public int m1() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	
	public int m2(int c, int d)
	{	
		return c/d;	
	}
}


