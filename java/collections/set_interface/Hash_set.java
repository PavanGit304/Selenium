package set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Hash_set {
	
	public static void main(String args[]){  
		//Creating HashSet and adding elements  
		Set <String> obj=new HashSet<String>();  
		obj.add("Ravi");  
		obj.add("Vijay");  
		obj.add("Ravi");                  // it doesn't allows duplicate values 
		obj.add("Ajay");     
		//Traversing elements  
		Iterator<String> itr=obj.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
		}  
}
