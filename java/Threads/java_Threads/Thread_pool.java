
package java_Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//ExecutorService is a built-in thread pool in Java which can be used to execute tasks
//concurrently. ExecutorService interface extends Executor class by adding methods that help manage and control the execution of threads. 
public class Thread_pool {
	
	 public static void main(String[] args) {  
	       ExecutorService executor = Executors.newFixedThreadPool(1);  // 1st Thread reuse many times ex: it prints (pool-1-thread-1 (End))
	       for (int i = 0; i < 10; i++) {  
	           Runnable worker_obj = new TestThreadPool("pavan" + i);           // Initializing  run() class 
	           executor.execute(worker_obj);//calling execute method of ExecutorService  
//	           executor.shutdown(); //It will make the ExecutorService stop accepting new tasks  
	       }  
//	       executor.shutdown(); // It will make the ExecutorService stop accepting new tasks  
//	       while (!executor.isTerminated()) {} //while (executor.isTerminated()) {}your current thread will keep running. ! it will not run current thread
	       System.out.println("Finished all threads");  
	       	
	 }
}


class TestThreadPool implements Runnable {

	private String message;
	public TestThreadPool(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message); // it return current thread name
																								 
		processmessage();// call processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)"); // prints thread name
	}

	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}