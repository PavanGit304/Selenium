package map;

import java.util.Hashtable;
import java.util.Map;

public class hash_Table1 {

	
	public static void main(String[]args)
	{
		
		Hashtable<Integer,String> obj = new Hashtable<Integer,String>();
		obj.put(1,"pavan");
		obj.put(2,"tumuku");
		obj.put(3,"roopa");		
		
		obj.remove(3);
		
		for(Map.Entry mp:obj.entrySet()) {
		System.out.println(mp.getKey()+""+mp.getValue());
		}
	}
}
