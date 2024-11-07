package Singleton_pattren;

public class ex2 {
	
	
	
	public static void main(String[]args)
	{
		
		singl obj = singl.getInstance();
		//singl obj1 = singl.getInstance();
	
		//obj.m1();
	}

	
}


class singl
{
	
	
	
	
	private static singl inst = new singl();// static member : it gets only member bcz its static and it contains instance of this class 
	
	
	private singl (){}  // private constructor : by using private constructor the class cannot be instantiated with another class 
	
	
	public static singl getInstance()  //getInstance() static factory method it provides global point access to the instance 
	{
		m1();  // method calling 
		return inst;   // it returns 
		
		
	}
	
	
	public static void m1() 
	{
		
		System.out.println("Hello");
	}
}