package List_interface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
	public static void main(String args[]){  
		LinkedList<String> al= new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");
//		al.addFirst("pavan");
//		al.addLast(null);
//		al.removeLast();
		
//		al.remove("Vijay");
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}
}
