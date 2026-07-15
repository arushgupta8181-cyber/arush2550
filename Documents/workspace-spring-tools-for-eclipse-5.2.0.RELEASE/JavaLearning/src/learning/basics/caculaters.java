package learning.basics;
import java.util.Scanner;
/*public class caculaters {

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
*/
public class caculaters{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int income = sc.nextInt();
		int tax;
		if (income < 50000) {
			tax = 0;
			
		} else if ( income >= 50000 && income <1000000 ) {
			tax = (int) (income * 0.2);
		} else {
			tax = (int) (income * 0.3);
		}
		System.out.println("your tax is :" + tax );
		sc.close();
	}
}






































