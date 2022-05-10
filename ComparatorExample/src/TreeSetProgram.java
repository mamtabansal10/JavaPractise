

import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>(new ComparatorExample());
		ts.add("mamta");
		ts.add("sahil");
		ts.add("pupoo");
		ts.add("punu");
		ts.add(new StringBuffer("ladoo"));
		System.out.println(ts);
	}
}
