
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1 };
		int length = removeDuplicates(arr);
		for (int i = 0; i <= length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int removeDuplicates(int[] nums) {
//		int p = 0;
//		int[] output = new int[nums.length];
//		output[0]= nums[0];
//		for (int i = 0; i < nums.length - 1; i++) {
//			if (nums[i] != nums[i + 1]) {
//				p = p + 1;
//				output[p] = nums[i+1];
//			}
//		}
//		output[p+1]=nums[nums.length-1];
//		if(nums[nums.length-1]!=nums[nums.length-2]) {
//			p = p+1;
//		}
//		
//			for (int j = 0; j < p; j++) {
//				nums[j] = output[j];
//		}
//		return p;
//	}
        
        int j = 0; //current index
        for (int i =1; i<nums.length; i++) { 
            if (nums[i] != nums[j]) { 
                j++; 
                nums[j] = nums[i]; //fill current index with new number
            } 
        }
    return j+1;
	}
}
