import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListProgram {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add(11);
		al.add("learning");
		al.add(1, 8); // it will add the element at index and shift other
		al.set(2, 9); // replace existing with new
		System.out.println(al);

		ArrayList<Object> al1 = new ArrayList<Object>(11);
		al1.add(3);
		System.out.println("size is :" + al1.size());

		ListIterator<Object> litr = al.listIterator();
		while (litr.hasNext()) {
			System.out.println("elements are : " + litr.next());
			litr.remove();
		}
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}
