package learning.basics;
/*
public class Array_01 {

	public static void main(String[] args) {
		int n1=20 ,n2=44,n3=11;
		int arr[] = {11,22,33,44,55,66,77,88,99,7,55,34,664,67,77};
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
*/
//---------------------[2]-------------------------------------------------------->>
/*
import java.util.Scanner;
public class Array_01 {

	public static void inputAnArray(int arr[]) {

		System.out.println("Taking input in your array.............");

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter for arr[" + i + "] ");
			arr[i] = sc.nextInt();
		}

	}

	public static void printArray(int arr[]) {

		System.out.println("Printing your array.............");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n--------------------------------");

	}
	
	
	public static void sumOfArray(int arr[]) {

		System.out.println("Printing sum of your array.............");

		int sum = 1;
		for (int i = 1; i < arr.length; i++) {
			
			sum = sum * arr[i];
		}
		
		System.out.println("Sum of all integers : "+sum);

		System.out.println("\n--------------------------------");

	}

	public static void main(String[] args) {

		int arr[] = new int[6];

		inputAnArray(arr);
		
		printArray(arr);
		
		sumOfArray(arr);
		

	}

}

*/
//---------------------[3]------------------------------------------>>

/*
import java.util.Scanner;

public class Array_01{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter 5 numbar :");
		//Scanner int = new Scanner(System.in);
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
				System.out.println("even num are :");
				for(int i=0; i<arr.length;i++) {
					if( arr[i] % 2 == 0) {
						System.out.println(arr[i] + " ");
					}
				}
		
		sc.close();
	}
}

*/
/*
//Input and Display Elements (SDA Size 15)------{1}----------------->>
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[15];

        // Input
        System.out.println("Enter 15 elements:");
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }

        // Display
        System.out.println("Array Elements are:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

*/
//--WAP to add all elements oF SDA size 8----------------------{2}------------------------>>
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        int sum = 0;

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of all elements = " + sum);

        sc.close();
    }
}

*/
//----WAP to multiplays all elements oF SDA size 12--------------(3)---------------------------------->>
/*
import java.util.Scanner;
public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[12];
        long product = 1;

        System.out.println("Enter 12 elements:");

        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
            product = product * arr[i];
        }

        System.out.println("Product of all elements = " + product);

        sc.close();
    }
}*/
//----WAP to displays square of all element in sda size 8.-----------------------{4}----------------------------------------->>
/*
import java.util.Scanner;

public class Array_01{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int arr[] = new int[8];

      System.out.println("Enter 8 elements:");

      for (int i = 0; i < 8; i++) {
          arr[i] = sc.nextInt();
      }

      System.out.println("Square of all elements:");

      for (int i = 0; i < 8; i++) {
          System.out.print((arr[i] * arr[i]) + " ");
      }

      sc.close();
  }
}
*/
//--WAP to  displays all element even positiom of SDA size 8.-{5}------------------------------------>>
/*
import java.util.Scanner;
public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at even positions are:");

        for (int i = 1; i < 8; i += 2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}*/

//WAP to  displays all element Odd positiom of SDA size 8.----------{6}----------------------------------->>


/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at odd positions are:");

        for (int i = 0; i < 8; i = i + 2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/




//---WAP replace all element by their square of SDA size 8.--{7}----------------------------->>
/*
import java.util.Scanner;

public class Array_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        // Replace elements by their square
        for(int i = 0; i < 8; i++) {
            arr[i] = arr[i] * arr[i];
        }

        System.out.println("Array after replacing by square:");

        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

*/

//WAP replace all even element by their square of SDA size 8import java.util.Scanner  [8]-->>
/*
import java.util.Scanner;
public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        // Replace even elements by their square
        for(int i = 0; i < 8; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = arr[i] * arr[i];
            }
        }

        System.out.println("Array after replacing even elements by square:");

        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/

//WAP replace all odd element by their square of SDA size 8import java.util.Scanner{9}--->>
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        // Replace odd elements by their square
        for(int i = 0; i < 8; i++) {
            if(arr[i] % 2 != 0) {
                arr[i] = arr[i] * arr[i];
            }
        }

        System.out.println("Array after replacing odd elements by square:");

        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/
//{10}----------WAP to multiply even by  2 and odd by 3 in SDA size----------->>
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = arr[i] * 2;   // Even × 2
            } else {
                arr[i] = arr[i] * 3;   // Odd × 3
            }
        }

        System.out.println("Array after multiplication:");

        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}*/

//{10}-- WAP to find count even and odd element in SDA size 8
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        int even = 0, odd = 0;

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++) {
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Elements = " + even);
        System.out.println("Odd Elements = " + odd);

        sc.close();
    }
}*/


//{12}-----WAP TO ADD ALL EVEN AND ODD ELEMENT OD SDA SIZE 8--------->>
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        int evenSum = 0, oddSum = 0;

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++) {
            if(arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }

        System.out.println("Sum of Even Elements = " + evenSum);
        System.out.println("Sum of Odd Elements = " + oddSum);

        sc.close();
    }
}
*/


//--[13]-Write a program to replace  even by (0)zero and  odd by one element in SDA size 5.
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 elements:");

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            if(arr[i] % 2 == 0)
                arr[i] = 0;   // Even → 0
            else
                arr[i] = 1;   // Odd → 1
        }

        System.out.println("Array after replacement:");

        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/
//[14]Write a program to find the count an element in SDE size 8.--->>
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        int count = 0;

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to count: ");
        int num = sc.nextInt();

        for(int i = 0; i < 8; i++) {
            if(arr[i] == num) {
                count++;
            }
        }

        System.out.println(num + " occurs " + count + " times.");

        sc.close();
    }
}*/

//[15]Write a program to replace an element in SDA by 0 size 8.-->>
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to replace by 0: ");
        int num = sc.nextInt();

        for(int i = 0; i < 8; i++) {
            if(arr[i] == num) {
                arr[i] = 0;
            }
        }

        System.out.println("Array after replacement:");

        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/

//[16]Write a program to change the search element size 8.-------
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        System.out.print("Enter new element: ");
        int newElement = sc.nextInt();

        for(int i = 0; i < 8; i++) {
            if(arr[i] == search) {
                arr[i] = newElement;
            }
        }

        System.out.println("Array after change:");

        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/

//[17]Write a program to find prime number in SDA element size 8.
/*
import java.util.Scanner;

public class Array_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        System.out.println("Enter 10 elements:");

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime Numbers are:");

        for(int i = 0; i < 10; i++) {
            int num = arr[i];
            int count = 0;

            for(int j = 1; j <= num; j++) {
                if(num % j == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
*/

//[18]Write a program to count prime number in SDA element size 8.--->>
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        int primeCount = 0;

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++) {
            int num = arr[i];
            int count = 0;

            if(num > 1) {
                for(int j = 1; j <= num; j++) {
                    if(num % j == 0) {
                        count++;
                    }
                }

                if(count == 2) {
                    primeCount++;
                }
            }
        }

        System.out.println("Total Prime Numbers = " + primeCount);

        sc.close();
    }
}*/

//[19]write a program to replace by zero prime number in SDA element size 8.
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++) {
            int num = arr[i];
            int count = 0;

            if(num > 1) {
                for(int j = 1; j <= num; j++) {
                    if(num % j == 0) {
                        count++;
                    }
                }

                if(count == 2) {   // Prime Number
                    arr[i] = 0;
                }
            }
        }

        System.out.println("Array after replacing prime numbers by 0:");

        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/
//[20]Write a program to add all prime numbers of SDA size 8.
/*
import java.util.Scanner;

public class Array_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int sum = 0;

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 8; i++) {
            int num = arr[i];
            int count = 0;

            if(num > 1) {
                for(int j = 1; j <= num; j++) {
                    if(num % j == 0) {
                        count++;
                    }
                }

                if(count == 2) { // Prime Number
                    sum += num;
                }
            }
        }

        System.out.println("Sum of Prime Numbers = " + sum);

        sc.close();
    }
}
*/
//[21]Write a program to reverse an SDA size 8.
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse Array:");

        for(int i = 7; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/
//[22]write a program to reverse THEN  display SDA a size 8.
/*
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];

        System.out.println("Enter 8 elements:");

        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse Array
        for(int i = 0; i < 4; i++) {
            int temp = arr[i];
            arr[i] = arr[7 - i];
            arr[7 - i] = temp;
        }

        System.out.println("Array after Reverse:");

        for(int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
*/








import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = n-1; i <= 1; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);

        sc.close();
    }
}


























