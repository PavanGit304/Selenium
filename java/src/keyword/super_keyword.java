package keyword;

public class super_keyword { // super Keyword :it refers parent class objects, it calls superclass variable and methods by using super keyword with the help of extends class  , and it access the superclass constructor 

	public static void main(String args[]){
			child obj = new child();  // by default super constructor 
		obj.printColor();
	}
}

class parent{  
String color="white";

parent() {// constructor
	System.out.println("parent class constructor");
}

void m1()  {// method
	System.out.println("parent class method");
}
}  


class child extends parent{  	
String color="black";  
void printColor(){  
System.out.println(color);//prints color from child class  
System.out.println(super.color);//calling super class variable : by using super keyword and variable name we call super class variable  
super.m1(); // calling super class method : by using super keyword and . method name we call super class method  
}  
}  