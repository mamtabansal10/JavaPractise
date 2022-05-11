
import java.util.HashMap;

public class HashMapProgram {

	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		HashMap<Employee,String> hm= new HashMap<Employee,String>();
		hm.put(e1, "Mamta");
		hm.put(e2, "Sahil"); // this will change the name from Mamta to Sahil
		System.out.println(hm.size());
		System.out.println(hm);
	}

}
