package oops;
/*
public class superkey {

	public static void main(String[] args) {
		 puppy p1 = new puppy(String name , String color, int age);
		
		
		

	}

}

class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal.animal()");
	}
	
	public void wakeUP() {
		System.out.println("Animal.animal()");
	}
	
	public void eat() {
		System.out.println("Animal.animal()");
	}
	
	public void sleep() {
		System.out.println("Animal.animal()");
	}
	public String getName() {
		return name;
	}
}


class Dogbhai extends Animal {
	private String color;
	public Dogbhai(String name , String color) {
		super(color);
		System.out.println("Dogbhai.Dogbhai()");
		
	}
	public void print() {
		System.out.println("Name is :" + getName());
		System.out.println("coloe is :" + color);
		System.out.println("----------------");
	}
	public String getcolor() {
		return color;
	}

class puppy extends Dogbhai{
		private int age ;
		public puppy(String name , String color, int age) {
			super(name,color);
			this.age = age;
			
			System.out.println("puppy.Puppy()");
		}
		public void print() {
			System.out.println("Name is :" + getName());
			System.out.println("coloe is :" + getcolor());
			System.out.println("age is :"+ age);
			
		}
		
		
	}

}*/



class Animal {

	private String name;

	public Animal(String name) {

		this.name = name;
		System.out.println("Animal.Animal()");
	}
	public void wakeUp() {
		System.out.println(name + " is waking Up...............");
	}
	public void eat() {
		System.out.println(name + " is eating...............");
	}
	public void sleep() {
		System.out.println(name + " is sleep..................");
	}
	public String getName() {
		return name;
	}
}

class DogeshBhai extends Animal {
	private String color;

	public DogeshBhai(String name, String color) {

		super(name);
		this.color = color;
		System.out.println("DogeshBhai.DogeshBhai()");
	}

	public void print() {
		System.out.println("Name is : " + getName());
		System.out.println("Color is : " + color);
		System.out.println("-----------------------");
	}
	
	public String getColor()
	{
		return color;
	}

}

class Puppy extends DogeshBhai {
	private int age;
	public Puppy(String name, String color, int age) {
		super(name,color);
		this.age = age;
		System.out.println("Puppy.Puppy()");	
	}
	public void print() {
		System.out.println("Name is : " + getName());
		System.out.println("Color is : " + getColor());
		System.out.println("Age is : " + age);
		System.out.println("-----------------------");
	}
	
}
public class superkey {
	public static void main(String[] args) {
		Puppy p1 = new Puppy("Shimbha", "Brown",1);
		p1.eat();
		p1.sleep();
		p1.print();
	}

}