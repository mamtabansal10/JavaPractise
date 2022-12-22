

//can we extend abstract class ?
//yes we can

public class OverridingExamples extends OverloadingExamples {
	
	
	public static void main(String[] args) {
		System.out.println("inside overriding examples");
		main(4,5);
		OverridingExamples obj = new OverridingExamples();
		obj.useSuperKeyword();
		obj.nonStatic();
		
	}
	
	// we can not override static method. This is method hiding not overriding
	// The method in the super class will be hidden by the one that is in the sub class.
	//as static method are class level method. they are resolved at compile time
	public static void main(int x, int y) {
		System.out.println("sum of two numbers in overriding");
		
	}
	
	//resolved at runtime 
	public void nonStatic() {
		System.out.println("in overriding class");
	}
	
	//in case we want to call parent method we can use super keyword
	public void useSuperKeyword() {
		super.main(3,5);
	}
	
}
