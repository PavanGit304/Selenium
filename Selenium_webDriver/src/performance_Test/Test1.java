package performance_Test;

import java.util.Date;

public class Test1 {// checking the time taken to perform any process like delete, save click 
	public static void main(String ars[]){
		try{
			long start = System.currentTimeMillis();// present date
			System.out.println(new Date());
			Thread.sleep(5000);
			System.out.println(new Date());
			long end = System.currentTimeMillis();//some end date
			long diff = start-end;//difference 
			System.out.println("Difference is:"+diff +"milliseconds");
		}
		catch(Exception e){
			System.out.println("got an Exception!");
		}
	}
}

