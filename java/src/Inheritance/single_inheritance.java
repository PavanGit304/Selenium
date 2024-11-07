package Inheritance; //Inheritance: it acquires the properties from one class to other classes

//single inheritance : one class acquires all the properties of another class with help of extends keyword
public class single_inheritance {
	public static void main(String args[]) {

		child obj = new child();
		obj.m1();
		obj.m2();
	}
}

class parent {
	void m1() {
		int a= 10;
		System.out.println("parent class " +a);
	}
	parent(){ // super constructor  by default super constructor is called 
		System.out.println("parent class constructor ");
	}
}

class child extends parent {
	void m2() {
		System.out.println("child class");
	}
}




/*
 class A{}
 class B extends a {}
 */
