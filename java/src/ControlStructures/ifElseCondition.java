package ControlStructures;

import java.util.Scanner;

public class ifElseCondition {
	public static void main(String[]args){
		int a = 0;
		
		Scanner scan = new Scanner(System.in);// The Scanner class is used to get user input, and it is found in the java.util package. To use the Scanner class, create an object of the class
		System.out.println("enter the value");
		a = scan.nextInt(); // nextInt() method Scans the next token of the input as an int
// ----------------If else condition : It executes the if block, if the condition is true otherwise else block is executed.-------------------------------------------------
		if (a < 10) {
			System.out.println("if else is true");
		} else {
			System.out.println("if else is false");
		}
	}
}












