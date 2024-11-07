// Abstraction : it hides the implementation showing the functionalities to the user or it is a method of hiding the unwanted information and it cannot be initiated  but it can be inherited using extend keyword 
//Abstract class : it is declared with abstract keyword it contains both abstract and concrete methods and constructor and it have final method 
package Abstrsction;
public class abstr {

	public static void main(String args[]){  
		Rectangle obj=	new Rectangle ();  // it executes Rectangle class method
		obj.draw();
		obj.m1();
		
		new Circle1().draw();   // it executes  Circle1 class method
		
	}
}



abstract class Shape{  //abstract class:A class declared with the abstract keyword is known as an abstract class. It can have abstract and non-abstract/Concrete methods
abstract void draw(); // abstract method:A method which is declared with abstract keyword,it contains only method declaration and its implementation must be provided in derived class

Shape()  // Abstract class constructor 
{
	int a=10;
	System.out.println("abstract class constructor " +a);	
}
public void m1()   // Concrete method 
{
	int b =20;
System.out.println("Concrete method"+b);	
}
}


//  final int speedlimit=90; //final variable : if a variable declared final, you cannot change the value of final variable(It will be constant). 
//  void run(){
//  speedlimit=400; 
//  } }
   


//class Bikes {
//	final void run() {// Final method: final method cannot be override and final method can inherited
//		System.out.println("running");
//	} 
//}
//class Honda extends Bikes {
//	void run() {
//		System.out.println("running safely with 100kmph");
//	}
//}



//  final class Bike{ // Final Class: final class cannot be extended void
//  void run1(){
//	  System.out.println("running safely with 50kmph");
//  }} 
//  class Honda1 extends Bike{
//	  void run(){
//		  System.out.println("running safely with 100kmph");
//		  }}
   

 
class Rectangle extends Shape{  
void draw(){
	String name ="QA";
	System.out.println("drawing rectangle" +name) ; //abstract method implementation 
}  
}

class Circle1 extends Shape{  
void draw(){
	int noofstudents = 8;
	System.out.println("drawing circle"+noofstudents);
	}
}



//The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).
