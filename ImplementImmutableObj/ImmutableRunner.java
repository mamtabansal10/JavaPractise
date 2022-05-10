
public class ImmutableRunner {
	
		public static void main (String[] args) {
			ImmutableObj obj  = new ImmutableObj(10);
			System.out.println(obj.getValue());
			ImmutableObj obj2 = obj.modify(10);
			System.out.println(obj2.getValue());
			System.out.println(obj==obj2);
			ImmutableObj obj3 = new ImmutableObj(12);
			System.out.println(obj3.getValue());
			System.out.println(obj==obj3);
			
		}

}
