package List_interface;

import java.util.Iterator;
import java.util.Stack;

public class Stack_victor {
	public static void main(String args[]){  
		Stack<String> obj = new Stack<String>();  
		obj.push("Ayush");  
		obj.push("Garvit");  
		obj.push("pavan"); 
		obj.push("pavan");
		obj.push(null);
		obj.push("Garima");//push() it add the element 
		obj.pop();   //pop() it delete the element
//		obj.remove(2);
		
		Iterator<String> itr=obj.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		} 
}
