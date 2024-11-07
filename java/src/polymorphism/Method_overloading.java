package polymorphism; // it is the ability of an object to take many forms.

public class Method_overloading {

	public int m1(int a) {
		System.out.println("sal" + ":" + a);
		return a;
	}


	public String m1(String b) {
		System.out.println("name" + ":" + b);
		return b;
	}

	public void m2() {
		System.out.println("method");
	}

	public void m2(int c) {
		System.out.println("method :" + c);
	}

	public static void main(String[] args) {
		Method_overloading obj = new Method_overloading();
		obj.m1(1000);
		obj.m1("pavan");
		obj.m2();
		obj.m2(10);
	}

}






/*
 public void m1(int a ) {}
 public void m1(char b) {} 

Method overloading : declaring many methods with same name but different parameters in same class. it is a compile time polymorphism


different ways to overload 
By changing number of arguments
By changing the data type

Advantages : it increase the readability of the program 
 
 
 
 */