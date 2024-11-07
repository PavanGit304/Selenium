package Constructors;

public class ConstructorOverloadding {
	
	

	    // constructor with one argument
	ConstructorOverloadding(String name){
	        System.out.println("Constructor with one "
	                           + "argument - String : " + name);
	    }

	    // constructor with two arguments
	ConstructorOverloadding(String name, int age){

	        System.out.println(
	            "Constructor with two arguments : "
	            + " String and Integer : " + name + " " + age);
	    }

	    // Constructor with one argument but with different type than previous.
	  
	ConstructorOverloadding(long id){
	        System.out.println(
	            "Constructor with one argument : "
	            + "Long : " + id);
	    }
	
	 public static void main(String[] args){
	        // Creating the objects of the class named 'ConstructorOverloadding' by passing different arguments
	       

	        // Invoke the constructor with one argument of type 'String'.
	    	ConstructorOverloadding overload1= new ConstructorOverloadding("Shikhar");

	        // Invoke the constructor with two arguments
	    	ConstructorOverloadding overload2 = new ConstructorOverloadding("Dharmesh", 26);

	        // Invoke the constructor with one argument of type 'Long'. 
	    	ConstructorOverloadding overload3 = new ConstructorOverloadding(325614567);
	    }

}


class GFG {
   
}
