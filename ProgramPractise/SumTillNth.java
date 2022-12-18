
public class SumTillNth {

	public static void main(String[] args) {
		int n = 20;
		System.out.println(sumTillNth(n));

	}

	public static int sumTillNth(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		return n + sumTillNth(n - 1);
	}

}
