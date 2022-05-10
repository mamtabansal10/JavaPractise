

public class ConstructorInOverriding {

	public static void main(String[] args) {
		B b = new B();
		// parent constructor will run first then child and then child method
		b.test();
		
//		A a = new B();
//		//same as above
//		a.test();
		

	}

}

class A{
	public A() {
		System.out.println("class A constructor");
	}
	  public Object test() {
		System.out.println("A class test method");
		return null;
	}
}

class B extends A{
	public B() {
		System.out.println("class B constructor");
	}
	 public String test() {
		System.out.println("B class test method");
		return null;
	}
}
