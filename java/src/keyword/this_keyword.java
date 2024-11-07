
package keyword;

class ex1{
	int a;
	String s;
	ex1(int a , String s){
		this.a=a;
		this.s=s;	
	}
	
	void m1() {
		System.out.println(s +":"+ a);
	}
}
public class this_keyword {  // this : it refers current class methods and variables , constructor 
	public static void main(String args[]){  
		ex1 obj = new ex1(3, "vijay");
		obj.m1();	}
}

