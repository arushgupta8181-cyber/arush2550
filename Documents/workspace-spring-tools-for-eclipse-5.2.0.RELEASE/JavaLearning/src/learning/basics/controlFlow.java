package learning.basics;
import java.util.*;
/*
//vowel is --------------[A,E,I,O,U,a,e,i,o,u]------------>
public class controlFlow{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the vowel");
		char ch = sc.next().charAt(0);
		if (  ch == 'A') {
			System.out.println("A is Vowel");
		} else if (ch == 'E') {
			System.out.print("E is vowel");
		} else if (ch == 'I') {
			System.out.print("I is vowel");
		} else if (ch == 'O') {
			System.out.print("O is vowel");
		} else if (ch == 'U') {
			System.out.print("U is vowel");
		} else if (ch == 'a') {
			System.out.print("a is vowel");
		} else if (ch == 'e') {
			System.out.print("e is vowel");
		} else if (ch == 'i') {
			System.out.print("i is vowel");
		} else if (ch == 'o') {
			System.out.print("o is vowel");
		} else if (ch == 'u') {
			System.out.print("u is vowel");
		} else {
			System.out.print("not a Vowel");
		}
	}
}*/
/*
//months -------------------------------------------------------------->
public class controlFlow {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int n = sc.nextInt();
		if (n== 1) {
			System.out.println("jan");
		} else if(n==2) {
			System.out.println("feb");
		} else if(n==3) {
			System.out.println("march");
		} else if(n==4) {
			System.out.println("april");
		} else if(n==5) {
			System.out.println("may");
		} else if(n==6) {
			System.out.println("june");
		} else if(n==7) {
			System.out.println("july");
		} else if(n==8) {
			System.out.println("august");
		} else if(n==9) {
			System.out.println("september");
		} else if(n==10) {
			System.out.println("october");
		} else if(n==11) {
			System.out.println("November");
		} else if(n==12) {
			System.out.println("December");
		}else {
			System.out.println("invelid input");
		}
		
	}
}
*/
/*
//----------------------------------------------weekdays -------------->>
public class controlFlow {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbar");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("Mon");
		}else if (n==2) {
			System.out.println("Tue");
		} else if (n==3) {
			System.out.println("Wed");
		}else if (n==4) {
			System.out.println("Thu");
		} else if (n==5) {
			System.out.println("Fri");
		}else if (n==6) {
			System.out.println("Sat");
		}else if (n==7) {
			System.out.println("Sun");
		} else {
			System.out.println("Invalid input");
		}
		
	}
}*/
/*

public class controlFlow {
	public void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		char ch = sc.next().charAt(0);
		if ( ch== 'A' || ch =='a'||ch =='E'|| ch =='e'|| ch =='I'|| ch =='i'|| ch =='O'|| ch =='o'|| ch =='U'|| ch =='u') {
			System.out.println(ch +" is voewl ");
		} else {
			System.out.println(ch +" is consonant ");
		}
	}
}*/

/*
public class controlFlow{
	public void main (String[]args) {
		System.out.println("Enter the num :");
		
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if ( marks >=90 && marks <= 100) {
			System.out.println("A+ Grads");
		} else if ( marks >=70 && marks <= 89) {
			System.out.println("B+ Grads");
		}  else if ( marks >= 60 && marks <= 69) {
			System.out.println("first");
		} else if ( marks >= 33 && marks<= 59) {
			System.out.println("just pass");
		} else  if ( marks >= 0 && marks<= 32){
			System.out.println("Fail");
		} else {
			System.out.println("invalid input");
		}
		sc.close();
	}
}

*/

import java.util.Scanner;
// positive num and negative num=----------------->>
/*
public class controlFlow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the numbar:");
		int n = sc.nextInt();
		
		if(n > 0 )
		{
			System.out.println("N is positive");
		} else{
			System.out.println("n is negative");
			
		}
		

	}

}
*/


//even and odd numbar 
/*
public class controlFlow {
	public static void main( String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num:");
		int n = sc.nextInt();
		if( n %  2 ==0 ) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
	}
} 
*/

//max beween 2 vers--------------------------------------------------->>
/*
public class controlFlow{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num:");
		int n = sc.nextInt();
		System.out.println("Enter the second num:");
		int m = sc.nextInt();
		if(n > m) {
			System.out.println("maximum number =" + n);
		} else {
			System.out.println("maximum number = " + m);
		}
	}
}
*/
//min num ----------------------------------------------->
/*
public class controlFlow{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num:");
		int n = sc.nextInt();
		System.out.println("Enter the second num:");
		int m = sc.nextInt();
		if(n < m) {
			System.out.println("minimum number =" + n);
		} else {
			System.out.println("minimum number = " + m);
		}
	}
}
*/
//max two numbar ---------------------------------------mkmk--->
/*
public class controlFlow {
	public static void main (String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int a = sc.nextInt();
		System.out.println("Enter b num :");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("a is max");
		
		}else if (a<b) {
			System.out.println("b is max");
		} else {
			System.out.println("both are quals");
		}
		
	}
}
*/

//--------------------------------POWER NUMBAR ---------------->
/*
public class  controlFlow {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Number: ");
      int num = sc.nextInt();

      System.out.print("Enter Power: ");
      int power = sc.nextInt();

      int result = 1;

      for (int i = 1; i <= power; i++) {
          result = result * num;
      }

      System.out.println(num + " ^ " + power + " = " + result);
  }
}
*/

//-------------------------------------------PRIME NUMBAR------------>
/*
import java.util.Scanner;

public class controlFlow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			boolean isPrime =true;
			for(int j=2;j<i;j++) {
		if( i%j ==0) {
			isPrime=false;
			break;
		}
		}
			if (isPrime) {
			System.out.println(i);
			}
		sc.close();

		}
	}
}
*/
// only ------------------------or prime no----------------->>
public class controlFlow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbar");
		int n = sc.nextInt();
		int count = 0 ;
		for (int i = 1; i<=n; i++) {
			if( n% i == 0) {
				count++;
				
			}
		}
		
		if (count == 2) {
			System.out.println(n + "is a prime number ");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

}
