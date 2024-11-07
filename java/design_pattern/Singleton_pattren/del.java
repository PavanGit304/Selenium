package Singleton_pattren;

import java.util.Scanner;

public class del {
	
public static void main(String[]args){

	singleto  sl = singleto.getInstance();
}}


class singleto   // the class should contains only one instance and it provides global point of access to the instance 
{
	// to create single ton class we need to declare static memory , private constructor , static factory method 
	
	private static singleto obj = new singleto();  // static memory : it gets the memory and it contains instance 
	
	private singleto() // private constructor : by using private constructor the class cannot instantiate with another class
	{
		System.out.println("print");
		
	}  
	
	public static singleto getInstance()  // getInstance() : static factory method it provides global point of access to the instance  
	{
		System.out.println("hello");
		
		return obj;
	}
	

}




