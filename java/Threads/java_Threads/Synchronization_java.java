package java_Threads;

public class Synchronization_java extends Thread {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}	
		
class Table {
	synchronized void printTable(int n) {  // synchronized method
		for (int i = 1; i <= 2; i++) {
			System.out.println(n * i); // n=5 5*1,5*2... for MyThread1 class  n=100 100*1,100*2..... for MyThread2 class
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t; // declaring variable for Table class

	MyThread1(Table t) { // constructor
		this.t = t; // Referring same class variable
	}

	public void run() {
		t.printTable(5); // passing the value to method
	}
}

class MyThread2 extends Thread {
	Table t; // declaring variable for Table class

	MyThread2(Table t) { // constructor
		this.t = t;
	}

	public void run() {
		t.printTable(100); // passing the value to method
	}
} 
