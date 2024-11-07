package java_Threads;

public class Thread_priority extends Thread { //it represents a number between 1 to 10.It helps the operating system to determine/find the order in which threads are scheduled.
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  //currentThread() it returns a reference of currently executing thread.
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());    
		  }  
		 public static void main(String args[]){  
			 Thread_priority T1=new Thread_priority();  
			 Thread_priority T2=new Thread_priority();  
		  T1.setPriority(Thread.MIN_PRIORITY);  
		  T2.setPriority(Thread.MAX_PRIORITY);   // 1st it execute maximum priority  ex:-1
		  T1.start();  
		  T2.start();  
		   
		 }  
}







//1.	MIN_PRIORITY       Default value : 1
//2.	NORM_PRIORITY    Default value : 5
//3.	MAX_PRIORITY       Default value : 10

