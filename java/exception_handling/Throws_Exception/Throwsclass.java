package Throws_Exception;

import java.io.IOException;

public class Throwsclass {
	 
	// multipule exceptionss
	 public static void main(String args[]){ 
	     try{ 
	    	 ex obj=new ex(); 
	       obj.m1(1); // method calling 
	     }
	     catch(Exception ex){
	       System.out.println(ex);
	      } 

	}
	  }		
		    
	class ex{
    void m1(int num)throws IOException,ClassNotFoundException{ 
	       if(num==2)
	          throw new IOException("IOException Occurred");
	       else
	          throw new ClassNotFoundException("ClassNotFoundException");
	    } 
	}
