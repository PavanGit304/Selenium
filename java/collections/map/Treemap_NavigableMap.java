package map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Treemap_NavigableMap {

	
	public static void main(String args[]){  
		   NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(100,"Amit");    
		      map.put(102,"Ravi");    
		      map.put(101,"Vijay");    
		      map.put(103,"Rahul");   
		      System.out.println( "descending order" + map.descendingMap());   //descending order 
		      System.out.println("headMap: "+map.headMap(102,true));  //  it returns all elements less than or equal to the specified key.
		      System.out.println("tailMap: "+map.tailMap(102,true));  //  it returns all elements greater than or equal to the specified key.  
		      System.out.println("subMap: "+map.subMap(100, true, 102, true));  // it returns in between elements 
	
		      for(Map.Entry m:map.entrySet()) {      // it iterates in order  
		      System.out.println(m.getKey()+""+m.getValue());}
}
}
