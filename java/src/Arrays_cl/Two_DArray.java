/*2D Array :The data is stored in row and column based on index (also known as  
	 * matrix form) note: 1st it starts with rows(1st/outer for loop) and then col(2nd/inner for loop)*/


//
package Arrays_cl;

public class Two_DArray {

	public static void main(String args[]) {

		twoD ob = new twoD();
		ob.m2();
//		ob.m3();
	}
}

class twoD {

	void m2() {
		int[][] arr = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
//				System.out.println("arr[0][0] = " + arr[0][0]);
//				System.out.println("arr[0][1] = " + arr[0][1]);
//				System.out.println("arr[1][0] = " + arr[1][0]);
//				System.out.println("arr[1][1] = " + arr[1][1]);
				
		        System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);

			}
		}
	}

	void m3() {

			int [][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			for (int i = 0; i < 3; i++) {// 0,1,2,3F
				for (int j = 0; j < 3; j++) { //0,1,2,3F
					System.out.println(ar[i][j] + "");
				}
				System.out.println();
			}


	}
}
