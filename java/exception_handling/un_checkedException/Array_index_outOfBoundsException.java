package un_checkedException;

public class Array_index_outOfBoundsException {
	
	public static void main(String [] args){
		try{
		   int arr[] ={1,2,3,4,5}; // max index no is 4 but we trying to print index 7 which is not in array
		   System.out.println(arr[7]); 
		}      
		catch(ArrayIndexOutOfBoundsException e)    {
		   System.out.println("The specified index does not exist in array. Please correct the error." +"\n"+e);
		}           }

}
