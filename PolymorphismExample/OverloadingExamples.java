
public abstract class OverloadingExamples {

	
	public static void main(String[] args) {
		OverloadingExamples.main(3,4);
		OverridingExamples.main(2,3);
		
	}
	
	//can we overload main method ?
	//yes we can
	public static void main(int x, int y) {
		System.out.println("sum of two numbers in overloading");
	}

	public void nonStatic() {
		System.out.println("in overloading class");
	}
}

 