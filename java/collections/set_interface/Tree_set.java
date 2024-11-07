package set_interface;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Tree_set {
	
	public static void main(String args[]){  
		//Creating and adding elements  
		SortedSet<String> obj=new TreeSet<String>();
		//TreeSet<String> set=new TreeSet<String>();
		obj.add("Ravi");  
		obj.add("Vijay");  
		obj.add("Ravi");               // it doesn't allows duplicate values 
		obj.add("Ajay");
//		obj.remove("Vijay");
		//traversing elements  
		Iterator<String> itr=obj.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		} 
}
