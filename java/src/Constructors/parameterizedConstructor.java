package Constructors;

//Parameterized Constructor: A Constructor with arguments(or parameters) is known as Parameterized constructor. 
public class parameterizedConstructor {

    //creating a parameterized constructor  
    public parameterizedConstructor(int i,String n){  
    System.out.println(i+" "+n);
    }  
   
   
    public static void main(String args[]){  
    //creating objects and passing values  
    	parameterizedConstructor s1 = new parameterizedConstructor(111,"Karan");  
    	parameterizedConstructor s2 = new parameterizedConstructor(222,"Aryan");  
    	parameterizedConstructor s3 = new parameterizedConstructor(333,"pavan");


}
}
