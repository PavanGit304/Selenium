package List_interface;

import java.util.Iterator;
import java.util.Vector;

public class vecto {
	
	public static void main(String args[]){  
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit"); 
		v.add("Garima");
		v.add("Ashish");   
//		v.remove("Ayush");
//		v.removeAllElements();
			
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

}
