
public class dddd {
	

		public static void main(String[]args) {
			
			normalandStaticmethod obj = new normalandStaticmethod();
			obj.m1();
			normalandStaticmethod.m2();
			exeMethod obj2 = new exeMethod();
			obj2.m3();
		}
	}
	class normalandStaticmethod{
		
		void m1() {
			System.out.println("Instance method");
		}
		
		static void m2() {
			String print = "print static method";
			System.out.println(print);
		}
	}
		
	 class exeMethod{
		
		public void m3() {
			System.out.println("Print M3");
		}
	}
	
	
	

