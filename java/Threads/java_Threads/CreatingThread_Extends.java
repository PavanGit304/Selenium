package java_Threads;

public class CreatingThread_Extends extends Thread {
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			CreatingThread_Extends t1=new CreatingThread_Extends();  
		t1.start();  //from New The thread moves state to the Runnable state.	When the thread gets a chance to execute, its target run() 
		 }
}
