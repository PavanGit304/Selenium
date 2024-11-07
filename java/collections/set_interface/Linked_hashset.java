package set_interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hashset {
	public static void main(String args[]){  
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");     
		set.add("Ravi");        // it doesn't allows duplicate values 
		set.add("Ajay");
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
}
