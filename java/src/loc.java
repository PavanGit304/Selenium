
public class loc {

	public static void main(String []args)
	{
		
		e obj = new e();
		obj.m1();
		System.out.print(e.s);
		
	}
	
}
	class e{
		static String s= "Static";
	void m1()
	{
		String L= "local";
		System.out.print(L);
		
	}
	}

