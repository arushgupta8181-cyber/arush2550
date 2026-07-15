package learning.basics;
//1. Palindrome Number Program------------------------->>
/*
//121 → आगे = 121, पीछे = 121 ✅
//1331 → आगे = 1331, पीछे = 1331 ✅
//123 → आगे = 123, पीछे = 321[*]
import java.util.Scanner;

public class Numbars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
*/

//2. Armstrong Number Program---------------->>
/*
//ex------>>
//numbers --->>370
//3³ = 27
//7³ = 343
//0³ = 0
//योग = 370 ✅

import java.util.Scanner;

public class number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

*/

//3. Strong Number Program //
/* 
ex----->>
number : 1, 4, 5
1! = 1
4! = 24
5! = 120

योग = 1 + 24 + 120 = 145 ✅

    import java.util.Scanner;
public class number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (num > 0) {

            int rem = num % 10;
            int fact = 1;

            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
*/
