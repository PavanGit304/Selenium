 /*An array with three indexes is called three dimensional array in java. 
 In other words, a three-dimensional array is a collection of one or more two-dimensional arrays
Three-Dimensional array, use nested for loops and array size 2 and  2 rows and 2cols 2*2*2= total bytes of memory allocation is 8
 * */

package Arrays_cl;

public class multi_dimentionArray {

	 public static void main(String[] args){    
	        ex obj = new ex();
	        obj.m1();
	        obj.m2();       
	        
	    }
}

class ex{
	void m1() { // array (R ,C) array(R, C)
		 int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		  
	        for (int i = 0; i < 2; i++) { //1st for loop array 2nd for loop Row 3rd col
	            for (int j = 0; j < 2; j++) {
	                for (int k = 0; k < 2; k++) {
	                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = "
+ arr[i][j][k]);	
	                }}}
	}
	                

	
	
	void m2() {
		
		int[][][] arr = { { { 1, 2 }, { 3, 4 } },           // array 1  2 rows 2 col
                { { 5, 6 }, { 7, 8 } ,} };        // array 2   2 rows 2 col

for (int i = 0; i < 2; i++) {

  for (int j = 0; j < 2; j++) {

      for (int k = 0; k < 2; k++) {

         // System.out.print(arr[i][j][k] + " ");
          System.out.println( "\n"+"arr[" 
                  + i + "]["
                  + j + "]["
                  + k + "] = "
                  + arr[i][j][k]);
      }

      System.out.println();
  }
  System.out.println();
}
		
	}

}

