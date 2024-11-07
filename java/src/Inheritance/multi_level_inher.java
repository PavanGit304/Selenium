package Inheritance;

public class multi_level_inher { // When there is a chain of inheritance, it is known as multilevel inheritance
	public static void main(String[]args) {
		c obj = new c();
		obj.m1();
		obj.m2();
		obj.m3();
		}
}

class a{
void m1() {System.out.println("class A method");}	
}

class b extends a{
	void m2() {System.out.println("class B method");}		
}

class c extends b{
	void m3() {System.out.println("class C method");}		
}



/*
  in inheritance package should not contains same class names 
 multi_level_inheritance: 
 derived class acquires all the properties from parent class as well as the derived class acts as a parent class
  to the another derived class using extends keyword  
class A{}
class B extends class A{}
class C extends B{}
 
  */
