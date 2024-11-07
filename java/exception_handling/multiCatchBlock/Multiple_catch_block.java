package multiCatchBlock;

import java.util.Scanner;

public class Multiple_catch_block {
	public static void main(String[] args) {
	int a, b, ans=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any two numbers: ");
	try{
		a=s.nextInt();
		b=s.nextInt();
		ans=a/b;	
		System.out.println("Result: "+ans);
	}
	catch(ArithmeticException ar){
	System.out.println("Denominator not be zero" +"\n"+ar);// if Denominator is zero it throws arithmetical error 
	}	
	catch(Exception e){
	System.out.println("Enter valid number" +"\n"+e);
	}	
	}
}
