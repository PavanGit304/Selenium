package queue_interface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priority_queue {
	
	public static void main(String args[]){  
		PriorityQueue<String> obj=new PriorityQueue<String>();  
		obj.add("Amit Sharma");  
		obj.add("Vijay Raj");  
		obj.add("JaiShankar");  
		obj.add("Raj");
		obj.add("Raj");
		obj.add(null);  // it doesn't allows null values 
		obj.poll();  //poll() it remove the element 
//		obj.remove();
		Iterator itr=obj.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}   
		}  		 
}

