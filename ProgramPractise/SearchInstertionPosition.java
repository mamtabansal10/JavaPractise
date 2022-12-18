
public class SearchInstertionPosition {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		System.out.println(searchInsertionPosition(arr, 7));

	}

	public static int searchInsertionPosition(int[] arr, int target) {

		if (target < arr[0]) {
			return 0;
		}
		if (target > arr[arr.length - 1]) {
			return arr.length;
		}
        int low = 0;
        int high = arr.length -1;
		
	    
		while(low<high) {
			int mid = (low+high) / 2;
			if(target<=arr[mid]) {
				high = mid;
			}
			else {
				low = mid;
			}
			low = low +1;
			
		}

		return low;

	}

}
