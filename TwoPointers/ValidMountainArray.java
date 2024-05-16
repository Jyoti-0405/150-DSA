package TwoPointers;

class Solution1{
    public boolean ValidMountainArray(int[] nums) {
        if(nums.length<3) return false;
        int l=0;
        int r=nums.length-1;
        while(l+1<nums.length-1 && nums[l]<nums[l+1]){
            l++;
        }
        while(r-1>0 && nums[r]<nums[r-1]){
            r--;
        }
        return l==r;
    }
}
class Mountain{
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.ValidMountainArray(new int[]{0,2,3,4,5,2,1,0}));
    }
}
