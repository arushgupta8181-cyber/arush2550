package oops;
/*
class parson 
{
	private String name , gendar;
	private int age;
	
	public void setNmae(String name)
	{
		this.name = name ;
	}
	public void setGendar(String gendar )
	{
		this.gendar = gendar;
	
	}
	public void setAge(int age){
		 if(age< 0 && age<120) {
		 } else System.out.println("sorry you,re not founds----------");
		this.age= age ;
	}
	//------------get----------------------------------------//
	public String getNmae () {
		return name;
	}
	
	public String getGendar() {
		return gendar;
	}
	public int getAge() {
		return age;
	}
	
	
	//-------------------------------------------------------//
	public void print()
	{
		System.out.println("Nmae is :"+ name);
		System.out.println("Gendar is :" + gendar);
		System.out.println("Age is :"+ age);
	}
}




public class Encapsulation {

	public static void main(String[] args) {
		parson p1 = new parson();
		p1.setNmae("Arush");
	 	p1.setGendar("Male");
		p1.setAge(10);
		p1.print();
		
		if(p1.getAge()>= 60) {
			System.out.println("congrats------------");
		}

	}

}
*/

class parson 
{
	private String name , gendar;
	private int age;
	
	public parson( String name , String gendar , int age)
	{
		this.name = name;
		this.gendar = gendar ;
		this.age = age;
		System.out.println("parson.parson()");
	}
	
	public void setNmae(String name)
	{
		this.name = name ;
	}
	public void setGendar(String gendar )
	{
		this.gendar = gendar;
	
	}
	//public void setAge(int age){
	//	 if(age< 0 && age<120) {
		// } else System.out.println("sorry you,re not founds----------");
		//this.age= age ;
	//}
	//------------get----------------------------------------//
	public String getNmae () {
		return name;
	}
	
	public String getGendar() {
		return gendar;
	}
	public int getAge() {
		return age;
	}
	
	
	//-------------------------------------------------------//
	public void print()
	{
		System.out.println("Nmae is :"+ name);
		System.out.println("Gendar is :" + gendar);
		System.out.println("Age is :"+ age);
		System.out.println("-----------------------------------");
	}
}




public class Encapsulation {

	public static void main(String[] args) {
		parson p1 = new parson("arush","male",10);
	
		//p1.setNmae("Arush");
	 	//p1.setGendar("Male");
		//p1.setAge(10);
		p1.print();
		//p1.setAge(21);
		p1.setNmae("kancha");
		p1.setGendar("femal");
		p1.print();
		
		if(p1.getAge()>= 60) {
			System.out.println("congrats------------");
		}

	}

}


