package java_Threads;

// the thread will sleep for the 500 milli seconds  
//Whenever the Thread.sleep() methods execute, it always halts(stop) the execution of the current thread.			  
//At a time only one thread is executed. If you sleep a thread for the specified time, the thread scheduler picks up another thread and so on. 			  

public class SleepMethod extends Thread {
	
	public void run(){    
		  for(int i=1;i<5;i++){   
	    try{
	    	Thread.sleep(500);}
	    catch(InterruptedException e)
	    {System.out.println(e);}    
		    System.out.println(i);    
		  }    
			   
		 }    
		 public static void main(String args[]){    
			 SleepMethod t1=new SleepMethod();    
			 SleepMethod t2=new SleepMethod();    
		     
		  t1.start();    
		  t2.start();    
		  
		  
		 }    
		 

}
