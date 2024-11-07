package java_Threads;

public class creating_thread extends Thread{
	
	
	public void run() {
		System.out.println("thread is running  with Thread class   pavan");
		}
	
	public void run1() {
		System.out.println("thread is running  with runnable interface1 ");
		
	}
	
	
	public static void main(String args[]){  
		creating_thread obj = new creating_thread();  // this class contains run method 
		obj.start();	
		// runnable class obj   here we need to create thread instance 
		multi obj1 = new multi();
		Thread T1 = new Thread(obj1);
		T1.start();
	}

}

 class multi implements Runnable{
	@Override
	public void run() {
		System.out.println("thread is running  with runnable interface ");
		
	}		 
}
