package Constructors;

public class copyConstructor {
//copy constructor:it is a special type of constructor that creates an object using another object of the same Java class. It returns a duplicate copy of an existing object of the class.

	     double re, im;
	    // A normal parameterized constructor
	    public copyConstructor(double re, double im) {
	        this.re = re;
	        this.im = im; // this: it refers current class variables,methods,constructor 
	    }
	     
	    // copy constructor
	    copyConstructor(copyConstructor c) {
	        System.out.println("Copy constructor called");
	        re = c.re;
	        im = c.im;    
//	        System.out.println( re + " + " + im );
	    }
	    
	      
	    // Overriding the toString of Object class
	    @Override
	    public String toString() {
	        return "(" + re + " + " + im +")";
	    }

	    public static void main(String[] args) {
	    	copyConstructor c1 = new copyConstructor(10, 15);
	    	copyConstructor c2 = new copyConstructor(c1);   //calling copy constructor 
	    	copyConstructor c3 = c2;   // non-primitive variables are just references.
	        System.out.println(c2+""+c3); // toString() of c2 is called here
	        System.out.println(c1); // toString() of c2 is called here
	    }	
}
