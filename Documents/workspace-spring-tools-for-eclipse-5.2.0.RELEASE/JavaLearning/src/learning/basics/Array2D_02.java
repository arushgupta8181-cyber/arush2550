package learning.basics;
/*
public class {

	public static void main(String[] args) {

//		String is immutable means we can not change a string once it created.
//		By using literal --> It will store in the special memory area called SCP(String Constant Pool)
//		It will not allow any duplicate object to store.
		String str1 = "Hello guys you are from summer training program batch";
		String str2 = "Hello guys you are from summer training program batch";

//		By using new Keyword
		String str3 = new String("Hello guys you are from summer training program batch");
		String str4 = new String("Hello guys you are from summer training program batch");

		System.out.println(str1 == str2);
		System.out.println(str3 == str4);

		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));

		System.out.println(str1.length());
		System.out.println(str1.charAt(0));

		int vowelCtr = 0;
		for (int i = 0; i < str1.length(); i++) {

			char ch = str1.charAt(i);

			if (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				vowelCtr++;
			}
		}

		System.out.println("Total vowels : " + vowelCtr);
		System.out.println("================================================");

		int letterCtr = 0;
		for (int i = 0; i < str1.length(); i++) {

			char ch = str1.charAt(i);

			if (ch != ' ') {
				letterCtr++;
			}
		}

		System.out.println("total letters : " + letterCtr);

		System.out.println("================================================");

		int wordCtr = 0;
		for (int i = 0; i < str1.length(); i++) {

			char ch = str1.charAt(i);

			if (ch == ' ' || i == str1.length()-1) {
				wordCtr++;
			}
		}

		System.out.println("total words are : " + wordCtr);

	}

}*/

//-----------------------------------------------------------------------------------/.
/*
public class Array2D_02 {

	public static void main(String[] args) {

		
//		StringBuffer is mutable means we can change an existing StringBuffer object
//		It is synchronized means thread safe class.
		
		StringBuffer str1 = new StringBuffer("Hello guys you are from summer training program batch");
		
		
		System.out.println(str1.append(" Hi this is me"));
		
		
		System.out.println(str1);
		

	}

}
*/
//-------------------------------------------------------------------------------./
/*
public class Array2D_02 {

	public static void main(String[] args) {

		String str = "Hello guys you are from summer training program batch";

		try {

			System.out.println("Hello..............1");
			System.out.println("Hello..............2");
			System.out.println("Hello..............3");
			System.out.println("Hello..............4");
			System.out.println(str.charAt(300));
			System.out.println(100 / 0);
			System.out.println("Hello..............5");
			System.out.println("Hello..............6");
			System.out.println("Hello..............7");

		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			
		}catch (StringIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			
		}
		
		
		System.out.println("LearningException.main()");

	}

}
*/

//-----TRY.....Catch----------------------------------------------------------/.
import java.util.*;

public class Array2D_02 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = "Hello guys you are from summer training program batch";

		try {

			System.out.println("Hello..............1");
			System.out.println("Hello..............2");
			System.out.println("Hello..............3");
			System.out.println("Hello..............4");
			System.out.println(str.charAt(13));
			System.out.println(100 / 0);
			System.out.println("Hello..............5");
			System.out.println("Hello..............6");
			System.out.println("Hello..............7");

		} catch (Exception e) {
			
			e.printStackTrace();
		
		} finally {
			sc.close();
			System.out.println("Hello..............7");
			System.err.println("Hello..............7");
			
		}
		
		
		System.out.println("LearningException.main()");
		sc.close();
		

	}

}



