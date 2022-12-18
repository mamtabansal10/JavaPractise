
public class StockDayProgram {

	public static void main(String[] args) {
		int[] a = {4, 8,10,14};
		getBuyAndSellDay(a);
	}
	
	public static void getBuyAndSellDay(int[] a) {
		int maxProfit = 0;
		int buyDay = 0;
		int sellDay = 0;
		int minValue = a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]<a[i-1]) {
				minValue = a[i];
				buyDay = i;
			}
			if(a[i]-minValue>maxProfit) { 
				maxProfit=a[i]-minValue;
				sellDay = i;
			}
		}
		System.out.println("Buy day : " + buyDay);
		System.out.println("Sell day : " + sellDay);
		
	}

}
