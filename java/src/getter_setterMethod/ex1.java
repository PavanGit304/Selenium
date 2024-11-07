package getter_setterMethod;

import Constructors.staticConstructor;
import keyword.this_keyword;

public class ex1 {

	private static String name  ;
	
	private static String name1 ="tumuku" ;
	
	public static  String getter() 
	{
		
		return name;
		
	}
	public static void setter(String entername)
	{
		name=entername;
	}
	
	
	
	
	public static String get() {
		return name1;}
	public static void set(String nickname) 
	{
		name1=nickname;
	}
	
}
