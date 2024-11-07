package java_Threads;

//here We directly use the Thread class to new threads using the constructors defined above.
public class CreatingThreadclass_ThreadStringname {

	public static void main(String argvs[])  {  
	Thread t= new Thread("My first thread");  // creating an object of the Thread class using the constructor Thread(String name)   
	t.start(); // the start() method moves the thread to the active state    
	String str = t.getName(); // getting the thread name by invoking the getName() method 
	System.out.println(str);  
	}  

}
