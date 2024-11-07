package Inheritance;

public class hierarchical_inher {// When two or more classes inherits a single class, it is known as hierarchical inheritance.
	
	public static void main(String[]args){
		Chaild obj = new Chaild();
		obj.m1();
		obj.m3();
		
		
		Father obj1 = new Father();
		obj1.m1();
		obj1.m2();
		
	}
}


class GrandPaa{
	public void m1() {System.out.println("GrandPaa m1");}	
}
class Father extends GrandPaa{
	public void m2() {System.out.println("Father m2");	}
}
class Chaild extends GrandPaa{
	public void m3() {System.out.println("Chaild m3");
	
//	Chaild obj = new Chaild();
//	obj.m1();
//	obj.m3();
	}
}



/*
 hierarchical_inher: one parent class inherited by the many sub class 
 class A{}
 class B extends A{}
 class C extends A{} 
 */