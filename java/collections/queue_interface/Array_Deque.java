package queue_interface;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Array_Deque {
	public static void main(String[] args) {  
		//Creating Deque and adding elements  
		Deque<String> obj = new ArrayDeque<String>();  
		obj.add("Gautam");  
//		obj.add(null); //it doesn't allows null values 
		obj.add("Ajay");  
		obj.add("pavan");
		obj.addFirst("first Element");// it follows FIFO order and it adds 1st element from collection
		obj.addLast("LastElement");//it follows LIFO order and it adds last element from collection
	
		
		obj.poll();     // it follows FIFO order and remove 1st element from collection
//		obj.pollFirst();// it follows FIFO order and remove 1st element from collection
		obj.pollLast(); //it follows LIFO order and removes last element from collection
//      obj.pop(); // it follows FIFO order and remove 1st element from collection 
//		obj.removeFirst();
		obj.remove("Ajay");    // it is FIFO order it removes the elements  from both sides 
		  
		Iterator<String> it = obj.iterator(); // it iterates collections of objects 
		
		while(it.hasNext())  {// it retuns true
			System.out.println(it.next());  // it returns next element from the collection
		}
		
		
		/*for (String str : obj) {  
		System.out.println(str);  }  */
		}  
}
