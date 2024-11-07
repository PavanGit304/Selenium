package CheckedException;

public class SyntexError_semanticError {
	
	public static void main(String[] args) {
		new SyntexError_semanticError().m1(10);
	}
	
	void m1(int m){
		int a = 0;  //or in a; instead of int declare in so the compiler throws syntex error
	System.out.println("value ="+""+a); //s.o.p(hi); values should be in "" so its a syntex error
//	m=t; //In this code, t is undeclared that's why it shows the semantic error.
	}
}


















/*Syntax errors occurs when the rules of the programming language are violated or break. 
Semantic errors occurs when the statement are not meaningful.*/