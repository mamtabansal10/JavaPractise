import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("before swap");
		   int x = sc.nextInt();
		   int y = sc.nextInt();
		   x = x+y;
		   y = x-y;
		   x = x-y;
		   System.out.println("after swap : "+ x + " "+y);

	}

}
