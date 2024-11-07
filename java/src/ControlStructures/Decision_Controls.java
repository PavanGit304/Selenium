package ControlStructures;

import java.util.Scanner;

public class Decision_Controls {
	
	public static void main(String[]args)
	{
			int a;
Scanner scan = new Scanner(System.in);
//The Scanner class is used to get user input, and it is found in the java.util package. To use the Scanner class, create an object of the class

System.out.println("enter the value");
a= scan.nextInt(); //nextInt() method Scans the next token of the input as an int

//---------------------------------IF condition : It executes the if block if condition is true.---------------------------------------------------
if(a<10)  
{
	System.out.println("if is true"+a);
}

System.out.println("---------------If-Else-----------------------------------------------------------");

		
//----------------------------------If else condition : It executes the if block if condition is true otherwise else block is executed.-------------------------------------------------
if(a<10)
{
	System.out.println("if else is true");
}
else
{
	System.out.println("if else is false");
}
		
System.out.println("---------------If-Else-if- ladder----------------------------------------------------------");
 
//---------------If-Else-if- ladder : if-else-if ladder statement executes one condition from multiple statements.---------------------------------------------------------");

	if(a<10) // it checks all the conditions if all the condition are false then the control moves to the else block and the else block statements are executed
	{
		
		System.out.println("If-Else-if- ladder is true");
	}
	else if(a==10)
	{
		System.out.println("If-Else-if- ladder is equal");
	}
	else if(a<=10)
	{
		System.out.println("If-Else-if- ladder is equal and true");
	}
	else
	{
		System.out.println("If-Else-if- ladder false");
	}	

	System.out.println("---------------Nested-if----------------------------------------------------------");
	//Nested if : if both the conditions are true then the inner block statements are executed if inner condition is false then 1st else block is executed if outer condition is false then 2nd else block is executed  
  int age,Weight;
	Scanner sc = new Scanner(System.in); // it reads the data from user
	System.out.println("enter the age");
	age=sc.nextInt();
	//System.out.println(age);
	
	System.out.println("enter the Weight");
	Weight=sc.nextInt();
   // System.out.println(Weight);	
	
	System.out.println();
	
	if(age>=18){
		if(Weight>=50){
		       System.out.println("You are eligible to donate blood");  
			
		}
		else {
			System.out.println("your weight is below 50");
			
		}
		
	}
	else{
		System.out.println("your age is below 18 ");
		
	}
	
	}

}
