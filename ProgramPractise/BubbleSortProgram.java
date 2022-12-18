
public class BubbleSortProgram {

	public static void main(String[] args) {
		int[] arr = { 1, 12, 4, 32, 11, 20 };
		int[] sortedArray = sortedArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}

	public static int[] sortedArray(int[] arr) {
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
