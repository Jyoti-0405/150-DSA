package BinarySearch;

class Solution{
    public int BinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left +(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
}
class Search{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.BinarySearch(new int[]{-1,0,3,5,9,12},9));
    }
}