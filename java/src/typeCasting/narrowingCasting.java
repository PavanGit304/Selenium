package typeCasting;

public class narrowingCasting //(manually) - converting a larger type to a smaller size type
{

	  public static void main(String args[]) {
		    double a= 9.78d;
		    int b = (int) a; // Manual casting: double to int
		    byte c = (byte) a;

		    System.out.println(a);   
		    System.out.println(b);     
		    System.out.println(c); 
		  }
}	
