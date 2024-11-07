package ControlStructures;
import java.util.Scanner;

public class ifElaseLader {
	public static void main(String[] args) {
		int a = 0;
		Scanner scan = new Scanner(System.in);//The Scanner class is used to get user input, and it is found in the java.util package. To use the Scanner class, create an object of the class
		System.out.println("enter the value");
		a = scan.nextInt(); // nextInt() method Scans the next token of the input as an int

		// ---------------If-Else-if- ladder : if-else-if ladder statement executes one condition from multiple statements.---------------------------------------------------------");

		if (a < 10) // it checks all the conditions if all the condition are false then the control moves to the else block and the else block statements are executed
		{
			System.out.println("If-Else-if- ladder is true");
		} else if (a == 10) {
			System.out.println("If-Else-if- ladder is equal");
		} else if (a <= 9) {
			System.out.println("If-Else-if- ladder is equal and true");
		} else {
			System.out.println("If-Else-if- ladder false");
		}
	}
}
