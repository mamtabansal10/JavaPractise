
public class StockExchangeProgram {

	public static void main(String[] args) {
		int[] a = { 10, 3, 5, 1 ,3 };
		System.out.println(maxProfit(a));

	}

	public static int maxProfit(int[] a) {
		int maxProfit = 0;
		int minValue = a[0];
		// O(1)
		for (int i = 1; i < a.length; i++) {
			if(a[i-1]>a[i]) {
				minValue = a[i];
			}
			if(a[i]-minValue>maxProfit) {
				maxProfit = a[i]-minValue; 
			}
		}
		return maxProfit;
	}

}
