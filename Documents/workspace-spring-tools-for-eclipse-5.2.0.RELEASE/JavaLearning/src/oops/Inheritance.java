package oops;
class A 
{
	public void m1() {
		System.out.println("A.m1()");
	}
	public void m2() {
		System.out.println("A.m2()");
	}
	public void m3() {
		System.out.println("A.m3()");
	}
	public void m4() {
		System.out.println("A.m4()");
	}
	public void m5() {
		System.out.println("A.m5()");
	}
}

class B extends A{
	public void fub1() {
		System.out.println("B.fun1()");
	}
	public void fub2() {
		System.out.println("B.fun2()");
	}
}
class C extends B {
	public void fun3() {
		System.out.println("C.fun3()");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		A a =new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
		System.out.println("---------------------------");
		B b =new B();
		b.fub1();
		b.fub2();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		System.out.println("---------------------------");
		C c= new C();
		c.fun3();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		c.fub1();
		c.fub2();
	}
}

