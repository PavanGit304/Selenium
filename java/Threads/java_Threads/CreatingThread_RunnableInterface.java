package java_Threads;

/*If you are not extending the Thread class, your class object would not be treated as a 
thread object. So you need to explicitly create the Thread class object. We are passing
the object of your class that implements Runnable so that your class run() method may execute.	*/

public class CreatingThread_RunnableInterface implements Runnable{
	
	@Override
	public void run(){  
		System.out.println("thread is running...");  }  
		  
    public static void main(String args[]){  
		CreatingThread_RunnableInterface m1=new CreatingThread_RunnableInterface();  
		Thread t1 =new Thread(m1);   //explicitly create thread class and Using the constructor Thread(Runnable r)  
		t1.start();  
		//The purpose of start() is to create a separate call stack for the thread,and then run() is called by JVM.
		 }
}
