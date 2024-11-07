package Encapsulation;


  class Person {
	  private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	}

public class GetandSetMethod {

	 public static void main(String[] args) {
		    Person myObj = new Person();
		    myObj.name = "John";  // error: name has private access in Person
		    System.out.println(myObj.name); // error: name has private access in Person
		  }
}

/* use below code it will executes 
 *     myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
 * */
