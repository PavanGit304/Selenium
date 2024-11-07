package methods;

public class mthodOverloading {//With method overloading, multiple methods can have the same name with different parameters:
	
	static int plusMethodInt(int x, int y) {//static method
		  return x + y;
		}

		static double plusMethodDouble(double x, double y) {//static method 
		  return x + y;
		}

		public static void main(String[] args) {
		  int myNum1 = mthodOverloading.plusMethodInt(8, 5); // or we can call className.methodName EX:mthodOverloading.plusMethodInt(8, 5);
		  double myNum2 = plusMethodDouble(4.3, 6.26); // assigning static method to variable 
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);
		}
}
