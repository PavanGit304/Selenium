 
package classAndObject;

public class ClassAndObj//class:it is a blue print for an object and it contains data member and member function & it doesn't allocate the memory at runtime
{
	public static void main(String[]args){
		ex obj = new ex();//object : it is an instance of a class and it allocates the memory at runtime 
		obj.m1();// m1 method calling 
	}

}

class ex{
	int a= 1000;
	float f = 1000.56f;
	String name = "pavan";
	char c = 'B';
	boolean b = true ;
public void m1(){
System.out.println(a + "\n" + f+ "\n" + name + "\n" + c  + "\n" + b);	
}
}
