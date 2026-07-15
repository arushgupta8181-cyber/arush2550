package learning.basics;

public class LerningString {

public static void main(String[] args) {
	
	
		//{3 }string is immutable means we can not change a string once it created.
		//{2}.By using literal  ---> it will store in the special memory area called SCP(string constant pool)
	
	
		// {2}it will not allow any duplicate object.
	
	//{1} By using literal ----------------->>
		String str1 = "hello guys yor are from summer training program batch";
		String str2 = "hello guys yor are from summer training program batch";
		
		
		// By using  new keyword-----heap  memory area---->>
		String str3 =new String  ("hello guys yor are from summer training program batch");
		String str4 =new String  ("hello guys yor are from summer training program batch");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		//.eqals------------------------------------------>>
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		System.out.println(str4.length());
		
		
		//----find the index in -------------------------------------------->>
		System.out.println(str1.charAt(0));
//		System.out.println(str1.charAt(1));
//		System.out.println(str1.charAt(2));
//		System.out.println(str1.charAt(3));
//		System.out.println(str1.charAt(4));
//		System.out.println(str1.charAt(5));
//		System.out.println(str1.charAt(6));
//		System.out.println(str1.charAt(7));
//		System.out.println(str1.charAt(8));
//		System.out.println(str1.charAt(9));
//		System.out.println(str1.charAt(10));
//		System.out.println(str1.charAt(11));
//		System.out.println(str1.charAt(12));
//		System.out.println(str1.charAt(13));
//		System.out.println(str1.charAt(14));
//		System.out.println(str1.charAt(15));
//		System.out.println(str1.charAt(16));
//		System.out.println(str1.charAt(17));
//		System.out.println(str1.charAt(18));
//		System.out.println(str1.charAt(19));
//		System.out.println(str1.charAt(20));
//		System.out.println(str1.charAt(21));
//		System.out.println(str1.charAt(22));
//		
	//---------------find the vowels --------------------------------------------->>
		int vowelctr = 0;
		for (int i = 0 ; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' ||ch == 'U' || ch == 'a'|| ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'  ) {
				vowelctr++;	
			}	
		}
		
		System.out.println("total vowels :"+ vowelctr);
		System.out.println("=============================================================");
		
		int letterctr = 0;
		for (int i = 0 ; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch  != ' ') {
				letterctr++;	
			}	
		}
		System.out.println("total letters:" + letterctr );
		
	}
}
