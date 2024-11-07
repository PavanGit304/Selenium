package variables;

public class variables { // variables are used to store the information/data value and Variable is a name of memory location.
	public static void main(String[] args) {

//		ex obj = new ex(); // or new ex().m1();
//		obj.m1();// method calling 
		System.out.println("static variable :" + ex.s ); // calling static variable 

	}
}

class ex {
	int i = 10; // instance variable
	static int s = 20; // static variable
	
	void m1() { // local variable		
		int L; // variable declaration
		L = 12; // Assigning the value
		System.out.println("local variable :" + L + "\n" + "insatance variable :" + i + "\n");
	}
	
	void m2() {
		System.out.println(i + s);
	}
}





// variables are used to store data values  they are 3 types instance , local, static variable
// instance variable:a variable which is declared inside the class & outside the method/constructor/block is called instance variable and it created when an object is created with use of "new" keyword and it can accessible for all methods/constructors/blocks with in the class 
// static variable:a variable which is declared inside the class & outside the method with static keyword static members and member functions can access globally without creating  an instance of a class or it initialized only once, when the execution started 
// local variable: a variable which is declared inside the class & inside the method/constructor/block is known as local variable and it only accessible inside the method/constructor/block
