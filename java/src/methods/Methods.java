package methods;

import java.awt.print.Printable;

public class Methods {
	public static void main(String[]args){

		normalandStaticMethods obj = new normalandStaticMethods(); 
		obj.m1();	
		normalandStaticMethods.m2();//static method and  method calling  	
		exMethod obj2	=new exMethod();
		obj2.m3();
	}			
}

class normalandStaticMethods {
	void m1() { // instance method :we can call the instance method by using object creation
		System.out.println("instance method");
		}	

		static void m2() {// static method : we can call the static method by using class name
		String print ="print static method";
			System.out.println(print);	
//			return print ;
		}
	
}


class exMethod {
	
	public void m3() {
		System.out.println("Print M3");	
	}
}


//static String m2() {// static method : we can call the static method by using class name
//	String print ="print static method";
//		System.out.println(print);	
//		return print ;



	
	// method: it is a block of code or collection of statements  to perform a certain task and it can use many times or it have code reuseability
	/* predefined and user defined  methods 
	 * predefined method:predefined methods are already defined in the Java class libraries is known as predefined methods. 
	 * It is also known as the standard library method or built-in method.We can directly use these methods by calling method name ex:length(), equals(), compareTo(),
	 * user defined method:The method written by the user or programmer is known as a user-defined method.and it modified 
	 * according to the requirement. it contains 2 types instance and static methods 
	 */
	

