import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		checkPrime(num);

	}

	private static void checkPrime(int num) {
		boolean flag=true;
		if (num == 0||num ==1) {
			System.out.println(num+" is not prime");
		}
		else {
			for(int i=2;i<num;i++) {
				int reminder = num%i;
				if (reminder==0) {
					flag = false;
					break;
					
				}
			}
			if(flag) {
				System.out.println(num+" is prime");
			}else {
				System.out.println(num+" is  not prime");
			}		
		}
	}

}
