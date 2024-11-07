package map;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {

	 public static void main(String args[]){  
		   Map<Integer,String> hm=new HashMap<Integer,String>();    
		      hm.put(100,"Amit");      // put() it add the the element 
		      hm.put(103,"mit");    
		      hm.put(102,"Rahul"); 
		      hm.put(101,"mit");
		      hm.put(null, null);  //it allows null values and the null key.
//		      hm.remove(101);           // by using keys we remove the element     it is keys and value pair 
		      hm.replace(102,"Rahul","pavan");            //replace()   by using replace() we modify the value    replace(key,"actual value","modified value");
		       
		    //  System.out.println("Initial list of elements: "+hm);   
		          
		      for(Map.Entry  MapObj:hm.entrySet()){  
		    	  System.out.println(MapObj.getKey()+" "+ MapObj.getValue());
		      }
		      }  
	 }




//Map.Entry is interface (it contains set of methods ex: entrySet())
//The Map. entrySet() method returns a collection-view of the map, whose elements are of this class.

//Map.Entry: it allows the options for accessing this collection     
//entrySet() :to retrieve all keys from map interface