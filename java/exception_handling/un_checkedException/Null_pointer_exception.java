package un_checkedException;

public class Null_pointer_exception { 
	
    public static void main(String args[]) { 
    	try { 
            String a = null; //null value 
            System.out.println(a.charAt(0)); 
        } catch(NullPointerException e) { 
            System.out.println("NullPointerException.." +"\n"+e); 
        } 
    } 

}
