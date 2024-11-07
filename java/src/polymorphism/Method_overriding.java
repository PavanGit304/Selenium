package polymorphism; // it is the ability of an object to take many forms. OR it perform singal action in different ways 

import datatypes.intergertype_boolean;

public class Method_overriding {
	public static void main(String[]args){
		B obj = new B();
		obj.m1(10);
		obj.m2(10);
	}
}



class A{
	void m1(int a) {
		a=100;
	
		System.out.println("overridden method "+a);
	}  // Overridden method :

	void m2(int b) {
		b=15;
		System.out.println("overridden method "+b);
	}	
}


class B extends A {
	void m1(int a) {
		a=20;
		System.out.println("override method "+a);
	}
	
	void m2(int b) {
//		b=20;
		System.out.println("override method "+b);
	}
   
}



/*
 declaring many methods with same name and signatures with different class using inheritance and it is runtime polymorphism
 
 override method :child class can give its own implementation to the parent class method 
 which is already defined in parent class.Method overriding is used for runtime polymorphism
 
 class A{ void m1()} 
 class B extends A{void m1()}
 
public static void main(String[]args){ new B().m1();}
 
 
 */