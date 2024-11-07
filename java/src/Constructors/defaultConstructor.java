package Constructors;
//constructor: it is a special method that is used to initialize objects. The constructor is called when an object of a class is created.It can be used to set initial values for object attributes:

// default constructor: it is created by the compiler if we do not define any constructor(s) for a class.
public class defaultConstructor {
	int a;// create a class attribute 
	
	   defaultConstructor () { // create a class constructor 
			a=10; // Set the initial value for the class attribute a
		System.out.println(a);
	}
	   
	   public static void main(String[]arg){
			defaultConstructor  obj = new defaultConstructor(); // Create an object of class(this will call the constructor)
			defaultConstructor  obj1 = new defaultConstructor();
		}

}















	
/*Constructor: it is a special method that is used to initialize objects. The constructor is called when an instance 
of class is created or object of a class is created and it set initial values for object attributes.
 Every time an object is created using the new() keyword and by using class name we can declare constructor 
	*/
	
// Default constructor (no-arg constructor): If we do not create any constructor, the Java compiler automatically create a no-arg constructor during the execution of the program



