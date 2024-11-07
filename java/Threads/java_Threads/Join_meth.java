
package java_Threads;

public class Join_meth extends Thread  {
	
	public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
		 
		 }  
	
	
	public static void main(String args[]){  
		Join_meth t1=new Join_meth();  
		Join_meth t2=new Join_meth();  
		 Join_meth t3=new Join_meth();  
		 t1.start();  
		 try{  
		  t1.join();  // it allows one thread to wait until another/current thread completes 
		 }catch(Exception e){System.out.println(e);}  
		  
		 t2.start();  
		 t3.start();  
		 
		 t1.setName("pavan");  // setName("pavan"): it changes the name of the thread.
		 System.out.println("id of t1:"+t1.getId());   //getId() it returns the id of the thread.
		 System.out.println("Name of t1:"+t1.getName());// getName() it returns the name of the thread.
		 System.out.println("Name of t2:"+t2.getName());
		 
		
		 }  
	
}
