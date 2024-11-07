package Inheritance;

public class multiple_inher {
	
	public static void main(String[]args){
		multi obj = new multi();
		obj.m1();
		obj.m2();
		obj.m3();
		
		
	}
}

interface emp_id_class { // interface
	int emp_id= 304;
	public void m1(); // method decleration 	
}

interface emp_name_class{
	String emp_name = "pavan";
	public void m2();	
}
interface emp_age_class extends emp_name_class {
	int emp_age = 40;
	public void m3();

}

class multi implements emp_id_class, emp_name_class, emp_age_class {   //multiple inheritance 

	@Override
	public void m1() { // method implementation 
		System.out.println("class A m1 ="+ emp_id);	
	}
	
	@Override
	public void m2() {
		System.out.println("class B m2 ="+emp_name);	
	}
	
	@Override
	public void m3() {
	System.out.println("class C m3 ="+emp_age);	
	}

}



/*
 Multiple inheritance : a class can inherits more then one parent class but java cannot supports
 multiple inheritance but by using interface concept we can achieve multiple inheritance 
 interface : it contains only method declaration and its implementation must be provided by the derived class   
 it cannot be initiated  but it can be inherited by using implement keyword 
 */