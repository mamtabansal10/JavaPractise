import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		fibnocci(count);
	}
	
	public static void fibnocci(int count) {
		int a = 0;
		int b = 1;
		System.out.print(a +" "+ b);
		while(count>0) {
			int c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
			count = count-1;
		}
		
	}
}
