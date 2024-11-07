package Encapsulation;

public class encapsulation {
	
	public static void main(String[]arg){
		ex obj = new ex();
		obj.m1();
		System.out.println(ex.b );//public  data members/variables can be access in  any another class 
//		System.out.println(ex.a);// private data members/variables cannot be access in another class but it can access with in the class 
	    obj.m2();
	}
}


class ex {
	static int b=20;//'b' is not a tightly encapsulated variable because of non-private variable. Anyone can access it directly from outside the class.
	private static  int a=10;  // variable 'a' is tightly type encapsulation
	public void m1(){
		System.out.println(a);	
	}	

	 private double balance=350000.90;
	 public double m2(){
	 System.out.println(balance);	
	   return balance;
	   
	 } 
}




/*it is process of binding/wrapping data member and member functions into a Single unit or it is a method to hide the data in a single unit 
 * and it implemented by using access modifier i.e. private, protected and public
 * Advantages :protect the code from others/out  2.code maintainability 
 * */


