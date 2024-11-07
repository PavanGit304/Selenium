package java_Threads;

public class multi_Thread implements Runnable  {

	//Note: Each thread run in a separate callstack.
	public static void main(String[] args) {
        Thread T1 = new Thread("Thread1");
        Thread T2 = new Thread("Thread2");
        T1.start();                     //it starts newly created thread 
        T2.start();
        System.out.println("Thread names are following:");
        System.out.println(T1.getName()); // try with T1
        System.out.println(T2.getName());
    }
    @Override
    public void run() {   // it perform action on thread 
    }
	
	
	
}







 
