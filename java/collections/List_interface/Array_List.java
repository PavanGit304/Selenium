package List_interface;
/*ArrayList: It is like an array, but there is no size limit.
 * We can add or remove elements any time ,It store the duplicate element */

import java.util.*;

public class Array_List {

//	private Random random = new Random();

	public static void main(String args[]) {
		List<String> obj = new ArrayList<String>(); // Creating arraylist
		obj.add("Ravi"); // Adding object in arraylist
		obj.add("1");
		obj.add("Ravi");
		obj.addAll(1, obj);//adding different data type.it is used to add all of the specified elements to the specified collection.
		obj.remove("Ravi"); // Removing object

		
						
   for(int i=0;i<obj.size();i++)   {  
      System.out.println( obj.get(i));   
}  
   
   
   
	}
	}	
		
		
		
	
	
/*for-each loop traverses the array or collection until the last element.
it stores the element in the variable and executes the body of the for-each loop. */	
		
//                         OR
		
// traversing or Looping list through Iterator   Note : 
//		Iterator itr = obj.iterator();     // iterator() it is interface iterate a collection of objects
//		while (itr.hasNext()) {             // hasNext() It returns true if Iterator has more element to iterate or  returns true if next() would return an element rather than throwing an exception.)
//			System.out.println(itr.next()); // next(); It returns the next element in the collection until the hasNext()method return									 
//		}
		
		
//OR			
//for (String str : obj) {
//	System.out.println(str);
//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Array_List obj = new Array_List(); // creating class instance
//		for (int i = 0; i < 10; i++) {
//			System.out.println(obj.getRandomList(list)); // calling getRandomList Method
//		}
//		}
//	public String getRandomList(List<String> list) { // passing list obj
//
//		// 0-4
//		int index = random.nextInt(list.size()); // randomly changes the value in list
//		System.out.println("\nIndex :" + index);
//		return list.get(index);
//	}
	

