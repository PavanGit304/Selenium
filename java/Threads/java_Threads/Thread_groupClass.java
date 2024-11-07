package java_Threads;


/*all 3 threads belong to one group. Here, tg1 is the thread group name, obj is a thread_group
 class that implements Runnable interface and "one", "two" and "three" are the thread names.*/
// 1st it prints Thread group name then it executes run methods then it executes thread group
public class Thread_groupClass implements Runnable{
	
	public void run() {  
        System.out.println("current thread name "+Thread.currentThread().getName());   //+Thread.currentThread().getName()
  } 
	
	public static void main(String[] args) {
		Thread_groupClass obj = new Thread_groupClass();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, obj, "one");
		t1.start();
		Thread t2 = new Thread(tg1, obj, "two");
		t2.start();
		Thread t3 = new Thread(tg1, obj, "three");
		t3.start();
		System.out.println("Thread Group Name: " + tg1.getName());
		tg1.list();

	}

}
