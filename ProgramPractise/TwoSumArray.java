import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class TwoSumArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 3 };
		int[] result = new int[2];
		result = twoSum(arr, 6);
		System.out.println(result[0] + " " + result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
         int[] result = new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(target==nums[i]+nums[j]){
        //             result[0] = i;
        //             result[1] = j;
        //             break;
        //         }
        //     }
        // }
        //  return result;  
        
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
//         HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
//         for(int i=0; i<nums.length; i++){
//             map.put(i,nums[i]); 
//         }
//         
//            int key = 0 ;
//         	Iterator<Entry<Integer,Integer>> itr = map.entrySet().iterator();
// 			while (itr.hasNext()) {
//                 Map.Entry<Integer,Integer> entry = itr.next();
// 				int targetEle = target-entry.getValue();
// 				itr.remove();
// 				if(map.containsValue(targetEle)) {
// 					map1.putAll(map);
// 					for(Map.Entry<Integer, Integer> entryMap: map1.entrySet()) {
// 						if(entryMap.getValue()==targetEle) {
// 							key = entryMap.getKey();
// 						}
// 					}
//                 result[0] = entry.getKey();
// 				result[1] = key;
// 				
// 			}    
//          }
          return result;

			
}
}

//}