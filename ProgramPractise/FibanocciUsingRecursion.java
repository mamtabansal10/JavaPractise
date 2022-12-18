
public class FibanocciUsingRecursion {

	public static void main(String[] args) {
		int count = 8;
		for(int i = 0; i < count; i++){
			System.out.print(printFibanocci(i) +" ");
		}	
	}

	public static int printFibanocci(int n) {
		if(n == 0){
			return 0;
		}
		if(n == 1 ){
			return 1;
		}
	  return printFibanocci(n-2) + printFibanocci(n-1);

	}
}
