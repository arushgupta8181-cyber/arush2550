package oops;
/*
abstract class Car {

	public abstract void breakingSystem();

	public abstract void run();

	public abstract void startEngine();

	public abstract void device();

}

class Thar extends Car {

	@Override
	public void breakingSystem() {
		System.out.println("We have disc break system so stopping your Thar ..................");
	}

	@Override
	public void run() {
		System.out.println("Thar can run with the speed of 180km/h.......");
	}

	@Override
	public void startEngine() {
		System.out.println("Thar's Engine will start with key..........");
	}

	@Override
	public void device() {
		System.out.println("Thar have Google map and FM Radio and Bluetooth connectivity .............");
	}

}

class Audi extends Car {

	@Override
	public void device() {
		System.out.println(
				"We have Apple Car play & Android Play Google map and FM Radio and Bluetooth connectivity .............");
	}

	@Override
	public void breakingSystem() {
		System.out.println("Audi have 4*4 disc break system so stopping your Thar ..................");
	}

	@Override
	public void run() {
		System.out.println("Audi can run with the speed of 240km/h.......");
	}

	@Override
	public void startEngine() {
		System.out.println("Audi's Engine will start with push START/STOP button..........");
	}

}

public class OOPS {

	public static void main(String[] args) {

		Car c1 = new Thar();// Up-Casting
		c1.startEngine();
		c1.run();
		c1.breakingSystem();
		c1.device();

		System.out.println("------------------------------");

		Audi b = new Audi();
		b.startEngine();
		b.run();
		b.breakingSystem();
		b.device();

		System.out.println("------------------------------");

	}

}
*/
interface Car {

	void breakingSystem();

	void run();

	public abstract void startEngine();

	public abstract void device();

}

interface XY {
	void m1();
}

class Thar implements Car, XY {

	@Override
	public void breakingSystem() {
		System.out.println("We have disc break system so stopping your Thar ..................");
	}

	@Override
	public void run() {
		System.out.println("Thar can run with the speed of 180km/h.......");
	}

	@Override
	public void startEngine() {
		System.out.println("Thar's Engine will start with key..........");
	}

	@Override
	public void device() {
		System.out.println("Thar have Google map and FM Radio and Bluetooth connectivity .............");
	}

	@Override
	public void m1() {
		System.out.println("Thar.m1()");
	}

}

class Audi implements Car, XY {

	@Override
	public void device() {
		System.out.println(
				"We have Apple Car play & Android Play Google map and FM Radio and Bluetooth connectivity .............");
	}

	@Override
	public void breakingSystem() {
		System.out.println("Audi have 4*4 disc break system so stopping your Thar ..................");
	}

	@Override
	public void run() {
		System.out.println("Audi can run with the speed of 240km/h.......");
	}

	@Override
	public void startEngine() {
		System.out.println("Audi's Engine will start with push START/STOP button..........");
	}

	@Override
	public void m1() {
		System.out.println("Audi.m1()");
	}

}

public class OOPS {

	public static void main(String[] args) {

		Car c1 = new Thar();// Up-Casting
		c1.startEngine();
		c1.run();
		c1.breakingSystem();
		c1.device();

		System.out.println("------------------------------");

		Audi b = new Audi();
		b.startEngine();
		b.run();
		b.breakingSystem();
		b.device();

		System.out.println("------------------------------");

	}

}

