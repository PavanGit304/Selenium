package java_Threads;
// it executes 1st thread and sleeps 500 sec and thread scheduler pickups 2nd thread and again it sleeps 500 sec and thread scheduler pickups another thread 

public class Thread_scheduler_SleepingMethod extends Thread {// Thread Scheduler:it is part of the JVM,it decides which thread should run.Only one thread at a time can run in a single process.
public void run() {
	for(int i=0;i<5;i++){
		try{
			 Thread.sleep(500);  // If you sleep a thread for the specified time,the thread shedular picks up another thread	
		}
		catch(Exception e){System.out.println(e);  }
		System.out.println(i);  
		
	}
}
	
	public static void main(String args[]){  
		Thread_scheduler_SleepingMethod obj = new Thread_scheduler_SleepingMethod();  // this class contains run method 
		obj.start();
		new Thread_scheduler_SleepingMethod().start();
		new Thread_scheduler_SleepingMethod().start();
	
	}
}
