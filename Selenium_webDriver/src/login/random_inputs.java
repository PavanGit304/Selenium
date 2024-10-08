package login;

import java.util.Random;

public class random_inputs {

	public static void main(String[]args) {
	random_inputs obj = new random_inputs();    
	
	String a= obj. randomString(chars, 3);
	System.out.println(a);
	
	}
	static String chars = "Password1" ;

			public static String randomString(String chars, int length) {
			  Random rand = new Random();                             // creating random class instance       
			  StringBuilder sb = new StringBuilder();
			  for (int i=0; i<length; i++) {
				sb.append(chars.charAt(rand.nextInt(chars.length())));    //chars.charAt(): it returns characters from variable          rand.nextInt() it returns random values one after one                chars.length(): it return the length from chars variable 
			  }
			  return sb.toString();
			}

			//System.out.println 
	
}
