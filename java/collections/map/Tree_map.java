package map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_map {
	public static void main(String args[]){  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(100,"Amit");    
		      map.put(102,"Ravi");    
		      map.put(101,"Vijay");    
		      map.put(103,"Rahul");   
		      map.put(null, null); 
		      map.remove(103);              // for removing the element 
		      
		      for (Map.Entry m:map.entrySet()) {
		    	  System.out.println(m.getKey()+""+m.getValue());
		      }      
	}
}
