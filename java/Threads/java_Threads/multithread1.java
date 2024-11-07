package java_Threads;

//If you have to perform single task by many threads, have only one run()
public class multithread1 extends Thread   
{
	 public void run(){  
		   System.out.println("task one");  
		 }  
		 public static void main(String args[]){  
			 multithread1 t1=new multithread1();  
			 multithread1 t2=new multithread1();  
			 multithread1 t3=new multithread1();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
		 }  
}