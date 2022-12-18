import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {1,3,5,6,2,5,1};
		findDuplicates2(arr);

	}
	
//	public static void findDuplicates(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.print(" "+arr[i]);
//				}
//			}
//		}
//	}
	
	public static void findDuplicates2(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean b = set.add(arr[i]);
			if(b==false) {
				System.out.println(arr[i]);
			}		
		}		
	}
	}

