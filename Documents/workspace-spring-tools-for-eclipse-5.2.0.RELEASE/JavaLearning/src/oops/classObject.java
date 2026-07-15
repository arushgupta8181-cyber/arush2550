package oops;
/*
class person 
{
	
//---------------------------------------attributes
int age;
String name,gender;
//-------------------------------------- behaviours 
   public void wakeup()
   {
	   System.out.println("person.wakeup()");
   }
   public void eat()
   {
	   System.out.println("person.rat()");
   }
   public void run()
   {
	   System.out.println("person.run()");
   }
   public void sleep()
   {
	   System.out.println("person.sleep()");
   }
   
   public void print ()
   {
	   System.out.println("Name is :"+ name);
	   System.out.println("GENDER is :"+gender);
	   System.out.println("AGE is :"+age);
   }
	
	
}
	
public class classObject {

	public static void main(String[] args) {
		// class name objName = new ClassName();
		person arush = new person();
		arush.name = "arush gupta";
		arush.age = 20;
		arush.gender = "male";
		
		arush.wakeup();
		arush.eat();
		arush.run();
		arush.sleep();
		arush.print();


	}

}
*/
/*
//-------------Type of variables------------------------------------>>
public class classObject{
	String name; // instance var
	static String CompName ; // static var
	
	public static void main (String[]args) { // local var only main funtion access------>
		int n = 90 ; // local var
	}
	// non static all var access----------------------------->
	public void method1(){
		System.out.println(name);
		System.out.println(CompName);
		
	}
	// static is not a  instance var only static funtion------>
	public static void method2(){
		System.out.println(CompName);
	}
	
}
*/
//---------------------------------------------------------------------------------------------------------->
/*
class Calculations {
	public void opretion(int a, int b) {
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a-b);
	}
	public void opretion(int a, double b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
	}
	
public void opretion(double a , double b) {
	System.out.println(a+b);
	System.out.println(a%b);
	System.out.println(a*b);
}
public void opretion(int a, int b , int c) {
	System.out.println(a+b-c);
	System.out.println(a%b*2);
	System.out.println(a*b+c);
}
}

 
 
public class classObject {

	public static void main(String[] args) {
		Calculations c1 = new Calculations();
		c1.opretion(41,11);
		c1.opretion(21,2.5);
		c1.opretion(2.1,5.5);
		c1.opretion(21,2,20);
		
		

	}

}
*/
/*
//-------------------------------------
//---------------------------------Class Object ------------------------------->>
// blue print-----------in pen ----------------------------------------->>
 class pen {
	String color;
	String Type ; // ballpoint , gel ;
	
	public void write() {
		System.out.print("writing  semething");
	}
// all object print is info------------------------------------->>
//	public void printinfo() {
//		System.out.println(this.color);
//		System.out.println(this.Type);
//		
//	}
	public void printType() {
		System.out.println(this.Type);
	}
	public void printcolor() {
		System.out.println(this.color);
	}
}




public class classObject{
	public void main(String args[]) {
		pen pen1 = new pen(); // created a pen objrct colled pen1----------------->>
		pen1.color ="blue";  
		pen1.Type = "gel";
		
	pen pen2 = new pen(); //created a pen objrct colled pen2----------------->>
		pen2.color = "black";
		pen2.Type = "ballpoint";
		
	pen1.printcolor();
	pen1.printType();
	pen2.printcolor();
	pen2.printType();
		//pen1.printinfo();

	
	}
} 



*/

// set   use set methad ------------------------------------------------------->>
// BLUE PRINT IN CLASS PEN OBJECT------------------------------------->>
/*
class pen {
	String Color;
	int Tip ;
	
	// METHAD ---------------------------------------------------->>
	 void setcolor(String newColor) {
		 Color = newColor;
	 }
	 void settip( int newTip) {
		 Tip = newTip;
	 }
}

public class classObject{
	public void main(String args[]) {
		pen p1 = new pen();
		p1.setcolor("blue");
		System.out.println(p1.Color );
		p1.settip(5);
		System.out.println(p1.Tip);
			//p1.setcolor("yellow");
		p1.Color = "yellow";
			System.out.println(p1.Color );
		
	}
}*/

/*
class student {
	String name;
	int age ;
	float cgpa;
	
	void setCgpa(float newCgpa) {
		cgpa = newCgpa;
	}
}
*/

//class bank {
//	 public String usename  ;
//	 private String Password ;
//	 
//	  public void setpassword(String pws) {
//		 Password = pws;
//	 }
//	 void setusename() {
//		 usename = "new usename";
//	 }
//	
//	  
//}























