
public class MaxDiffInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 16, 10, 6, 23 };
		int max = maxDiffInArray(arr);
		System.out.println(max);

	}

	public static int maxDiffInArray(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length-1]-arr[0];
	}

}
