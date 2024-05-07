package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//Intuition behind the problem - first we iterate through the array and check if the complement of the current element exists in the array
// if it exists then we put the indexes of the elements in the array and return the array, else we keep iterating in the array and putting values
// in the hashmap

class Solution2{
    public int[] TwoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                arr[0] = i;
                arr[1] = map.get(target-nums[i]);
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
class Sum{
    public static void main(String[] args){
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.TwoSum(new int[] {2,7,3,1}, 9)));
    }
}

