package un_checkedException;

public class Arithmetic_exception {
	
	 public static void main(String args[]) {
	
		 int a=10, ans=0,c=0 ;   // this error is easy to understand the user		
		 try{
		 c=a/ans;
		 System.out.println("Total "+c+ "\n");
		 }
		 catch (ArithmeticException e){
		 System.out.println("Denominator not be zero "+c+ "\n"+e);
		 }	 
		 }
}








/*	int a=10;   // this error is difficult to understand the user
int ans =0,c=0;
Since I'm dividing an integer with 0 it should throw ArithmeticException
    
c =a/ans;
System.out.println(c); */