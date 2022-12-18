import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("before swap");
	   int x = sc.nextInt();
	   int y = sc.nextInt();
	   int z;
	   z=x;
	   x=y;
	   y=z;
	   System.out.println("after swap");
	   System.out.println(x+" "+y);
	}

}
