package learning.basics;

import java.util.Scanner;

/*
LOOPS:
for-loop
while-loop
do-while-loop

*/
//------------------------------------Factorial -------------------------->>
/*
public class Loops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int n = sc.nextInt();
//		Factorial
		int i,fact=1;
		for (i = 1; i <= n; i++) {	
			fact = fact * i;
		}
			System.out.println(fact);
		
	}
}
*/
import java.util.Scanner;

/*
LOOPS:
for-loop
while-loop
do-while-loop
*/
/*
public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int n = sc.nextInt();
//		Factors
		int i;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
}
*/

/*
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {

//		Entry Controlled loop

		for (int i = 11; i <= 5; i++) {

			System.out.println("for : " + i);
		}

		System.out.println("-----------------------");

		int j = 11;// 1.

		while (j <= 5)// .2
		{

			System.out.println("while : " + j);// 3.
			j++;// 4
		}

		System.out.println("-----------------------");

//		Exit Controlled loop
		int k = 11;// 1.

		do {
			System.out.println("do-while : " + k);// 2.
			k++;// 3.
		} while (k <= 5);// 4.

	}
}
*/



//import java.util.Scanner;

/*
LOOPS:
for-loop
while-loop
do-while-loop

*/
/*
public class Loops {

	public static void main(String[] args) {

		int n = 15;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				System.out.println("for : " + i);
			}
		}

		System.out.println("-----------------------");

		int j = 1;// 1.

		while (j <= n)// .2
		{
			if (n % j == 0) {
				System.out.println("while : " + j);// 3.
			}

			j++;// 4
		}

		System.out.println("-----------------------");

//		Exit Controlled loop
		int k = 1;// 1.

		do {
			if (n % k == 0) {
				System.out.println("do-while : " + k);// 3.
			}

			k++;
		} while (k <= n);// 4.

	}
}
*/
///------------------------------------------------------------------->>

import java.util.*;

/*


		
2*2*2*2*2
1*2
4*2
8*2
16*2
32

LOOPS:
for-loop
while-loop
do-while-loop

*/
public class Loops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int base = sc.nextInt();// 2

		System.out.print("Enter a value of power var: ");
		int exp = sc.nextInt();// 5

		int res = 1;

		for (int i = 1; i <= exp; i++) {

			res = res * base;
		}

		System.out.println("Power : " + res);
	}
}


