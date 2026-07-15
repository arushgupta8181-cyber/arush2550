package learning.basics;
import java.util.*;
/*
public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a num: ");
		int n = sc.nextInt();

		switch (n) {

		case 2:
			System.out.println("Tue");
			break;
		case 1:
			System.out.println("Mon");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("It is a invalid input.......");

		}

	}
}
*/
/*
public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any alphabet: ");
		char ch = sc.next().charAt(0);
		
		
		switch (ch) {

		case 'e':
			System.out.println(ch + " Vowel");
			break;
		case 'E':
			System.out.println(ch + " Vowel");
			break;
		case 'A':
			System.out.println(ch + " Vowel");
			break;
		case 'a':
			System.out.println(ch + " Vowel");
			break;
		case 'I':
			System.out.println(ch + " Vowel");
			break;
		case 'i':
			System.out.println(ch + " Vowel");
			break;
		case 'U':
			System.out.println(ch + " Vowel");
			break;
		case 'u':
			System.out.println(ch + " Vowel");
			break;
		case 'O':
			System.out.println(ch + " Vowel");
			break;
		case 'o':
			System.out.println(ch + " Vowel");
			break;
		default:
			System.out.println("It is a consonant.......");

		}

	}
}
*/
//----------calculator----------use Swich ------------------>>
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the num:");
		int n2 = sc.nextInt();
		
		System.out.println("Enter an operation b/w(+,-,*,/,%):");
		char operator = sc.next().charAt(0);
		switch(operator){
		case'+': 
			System.out.println(n1+n2);
			break;
		case'-': 
			System.out.println(n1-n2);
			break;
		case'*': 
			System.out.println(n1*n2);
			break;
		case'/': 
			System.out.println(n1/n2);
			break;
		case'%': 
			System.out.println(n1%n2);
			break;
		}
	}
}
