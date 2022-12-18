import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = calculateFact(num);
		System.out.println("factorial is : " + fact);
	}

	public static int calculateFact(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		else {
			return num*calculateFact(num-1);
		}
		
	}

}
