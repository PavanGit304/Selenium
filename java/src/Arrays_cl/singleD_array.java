
/*Array: it is collection of elements with same data type and fixed length and it stores multiple values in a single variable 

* 1D array: the elements are stored linearly and can be accessed individually by specifying the index value
 of each element stored in the array.
* */


package Arrays_cl;

public class singleD_array { 

	public static void main(String args[]) {
		SingleD obj = new SingleD();
		obj.m1();
	}
}

class SingleD { // 1D Array
	void m1() {
		String [] a = { "pavan", "Kumar", "Tumuku" };
		for (int i = 0; i < 4; i++) {
			System.out.println(a[i]);
		}

//for (String i : a) { System.out.println(i); } //for-each loop : it iterate each element of an array and the collection

	}
}





