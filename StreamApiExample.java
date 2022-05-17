public class StreamApiExample {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(11);

		List<Integer> al1 = al.stream().filter(x -> x % 10 == 0).collect(Collectors.toList());
		System.out.println(al1);

		Set<Integer> al2 = al.stream().map(n -> n * 2).collect(Collectors.toSet());
		System.out.println(al2);

		List<Integer> show = al.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
         al.forEach(y->System.out.print(" "+y));
         
	}

}
