import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum = sum + num%10;
			num = num/10;	
		}
		System.out.println("sum of digits : "+sum);
	}

}
