package ControlStructures;

import java.util.Scanner;

public class nastedIfCondition {

	public static void main(String[] args) {
		// Nested if : if both the conditions are true then the inner block statements are executed if inner condition is false then 1st else block is executed if outer condition is false then 2nd else block is executed
		int age = 10;
		int Weight = 40;

		if (age >= 18) {
			if (Weight >= 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("your weight is below 50");
				}
		} else {
			System.out.println("your age is below 18 ");
		}
			
	}
}









//Scanner sc = new Scanner(System.in); // it reads the data from user
//System.out.println("enter the age");
//age=sc.nextInt();
////System.out.println(age);
//
//System.out.println("enter the Weight");
//Weight=sc.nextInt();
//// System.out.println(Weight);	
//System.out.println();
