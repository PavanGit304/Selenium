package finallyKeyword;

public class FInally_Keyword {
	public static void main(String[] args) {
	int a=10,b=0, ans=0;
	try{
	b=a/ans;
	System.out.println(b);
	}
	catch (Exception e){
	System.out.println("Denominator not be zero  "+ e);
	}	
	finally{
	System.out.println("I am from finally block");
	}
	}
	}
