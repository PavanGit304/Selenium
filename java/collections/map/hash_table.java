package map;


import java.util.Hashtable;
import java.util.Map;

public class hash_table {
	
	 public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  hm.put(100,"Amit");   
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul"); 
//		  hm.put(null, null);
		  
		 for(Map.Entry obj:hm.entrySet()){    // for iteration                 
		 System.out.println(obj.getKey()+" "+obj.getValue());    // getKey():it gets values 
		 }  
//		  System.out.println(hm);  
		 } 
}





//Map.Entry: it allows the options for accessing this collection     
//entrySet() :to retrieve all keys from map interface



