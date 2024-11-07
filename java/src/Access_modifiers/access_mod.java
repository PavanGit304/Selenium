package Access_modifiers;
import Access_m.*;

public class access_mod {

    public static void main(String args[]) {
    	
    	
    	em obj1 = new em();
//    	obj1.em1();  // private 
    	obj1.em2();  //public 
    	obj1.em3();  //default 
    	obj1.em4();  //protected 
    	
    }		
}


class em{
	
	private void em1()   //private Access modifier: it can access methods and members with in the class 
	{
		System.out.println("private method "); 
	}
	public  void em2()   // public Access modifier: it can access methods and members from any where like inside the class out class and inside package and outside the package 
	{
		 System.out.println("public method "); 
	}
	
	 void em3()           //default Access modifier:if we not specified any access modifier for a class ,method or data member then its called default modifier it shares methods and members inside the same packages 
		{	
		    System.out.println("default method "); 
		}
		
	 protected void em4()    //protected Access modifier: it can access methods and members within same package or sub classes in different package.
		{
			 System.out.println("protected method "); 
		}
}


//ex obj = new ex();
//obj.em1();
//obj.m1();
//obj.m3();

