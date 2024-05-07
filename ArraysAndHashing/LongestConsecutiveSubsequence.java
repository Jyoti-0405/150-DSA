package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

//Intuition behind the problem -

class Solution5{
    public int LongestConsecutiveSubsequence(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int num:nums){
            set.add(num);
        }
        for(int num:nums){
            //check if the num is the start of a sequence by checking if left exists
            if(!set.contains(num-1)){ // start of a sequence
                int count = 1;
                while(set.contains(num+1)){ // check if hs contains next no.
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
            if(longest> nums.length/2) break;
        }
        return longest;
    }
}
class subsequence{
    public static void main(String[] args){
        Solution5 s = new Solution5();
        System.out.println(s.LongestConsecutiveSubsequence(new int[] {100,4,200,1,3,2}));
    }
}
