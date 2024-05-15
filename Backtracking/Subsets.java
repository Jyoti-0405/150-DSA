package Backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<List<Integer>> Subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(res, 0, nums, list);
        return res;
    }

    private void dfs(List<List<Integer>> res, int start, int[] nums, List<Integer> list) {
        if(start>=nums.length){
            res.add(new ArrayList<>(list));
        }else{
            list.add(nums[start]);
            dfs(res,start+1,nums,list);
            list.remove(list.size()-1);
            dfs(res,start+1, nums, list);
        }
    }
}
class set{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.Subsets(new int[]{1,2,3}));
    }
}
