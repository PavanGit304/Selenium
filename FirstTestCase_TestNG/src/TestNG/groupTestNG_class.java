package TestNG;

import org.testng.annotations.Test;

@Test(groups = { "test1" })
public class groupTestNG_class {
	public void m1() {
		System.out.println("test1   m1 method ");
	}
	public void m2() {
		System.out.println("test1   m2 method ");
	}
	public void m11() {
		System.out.println("test1   m11 method ");
	}
}

@Test(groups = { "test2" })
class second1 {
	public void m2() {
		System.out.println("test2    m2 method");
	}
}

@Test(groups = { "test3" })
class second12 {
	public void m2() {
		System.out.println("test3    m2 method");
	}
}



//Group TestNG Class  :Just like methods, Classes can also be grouped in TestNG.  
//<exclude name="test1" />  it prevent particular group of tests 