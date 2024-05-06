import java.util.HashSet;
import java.util.Set;
//Intuition behind the problem - We take an empty set(stores unique elements only) and add each element of the array one by one
//if an element has already occurred then return true and break out of the loop
class Solution1{
    public boolean ContainsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}

class Duplicate{
    public static void main(String[] args){
        Solution1 s = new Solution1();
        System.out.println(s.ContainsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
