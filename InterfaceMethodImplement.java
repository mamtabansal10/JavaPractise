interface newFeature{
	
	void test();
	void rest();
	default void display(){
		System.out.println("default method");
		//return 2;
	}
	
	static int mstatic() {
	System.out.println("static method");
	return 3;
	}
}

interface oldFeature{
	default void display() {
		System.out.println("m old default method");
	}
}

interface middleFeature extends newFeature,oldFeature{

	@Override
	default void display() {
		
	}
	
}

public class InterfaceMethodImplement implements newFeature,oldFeature{
    
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		newFeature.super.display();
	}

	public static void main(String[] args) {
		
	InterfaceExample nf = new InterfaceExample();
	 nf.display();
	 newFeature.mstatic();
	 
	}

}
