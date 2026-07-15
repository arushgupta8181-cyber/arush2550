package oops;

/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class multiTasking {

	public static void main(String[] args) {

		
		

		String str = null;

		try (Scanner sc = new Scanner(System.in); FileInputStream fin = new FileInputStream("abc.text");)
		{

			System.out.println("Hello..............1");
			System.out.println("Hello..............2");
			System.out.println("Hello..............3");
			System.out.println("Hello..............4");
			System.out.println(str.length());
			System.out.println(100 / 10);

		} catch (ArithmeticException e) {
			System.out.println("LearningException.main()");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
//		finally {
//
//			if (sc != null) {
//				sc.close();
//			}
//			if(fin != null) {
//				try {
//					fin.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			System.err.println("Finally executed...........");
//		}

		System.out.println("Hello..............5");
		System.out.println("Hello..............6");
		System.out.println("Hello..............7");

		System.out.println("LearningException.main()");

	}

}
*/
/*
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class multiTasking  {

	public static void main(String[] args) {

		
		

		String str = null;

		try (Scanner sc = new Scanner(System.in); FileInputStream fin = new FileInputStream("abc.text");)
		{

			System.out.println("Hello..............1");
			System.out.println("Hello..............2");
			System.out.println("Hello..............3");
			System.out.println("Hello..............4");
			System.out.println(str.length());
			System.out.println(100 / 10);

		} catch (ArithmeticException e) {
			System.out.println("LearningException.main()");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
//		finally {
//
//			if (sc != null) {
//				sc.close();
//			}
//			if(fin != null) {
//				try {
//					fin.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			System.err.println("Finally executed...........");
//		}

		System.out.println("Hello..............5");
		System.out.println("Hello..............6");
		System.out.println("Hello..............7");

		System.out.println("LearningException.main()");

	}

}
*/

/*
class MyThread extends Thread {

	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.err.println("Current thread name is: " + Thread.currentThread().getName() + "  " + i);

			try {

				Thread.sleep(2000);
				//Thread.wait(2000);
				//Thread.suspend(2000);
				

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

public class  multiTasking  {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		MyThread t1 = new MyThread("Task-1");
		t1.start();
		
		MyThread t2 = new MyThread("Task-2");
		t2.start();
		
		MyThread t3 = new MyThread("Task-3");
		t3.start();
		
		MyThread t4 = new MyThread("Task-4");
		t4.start();

	}

}*/