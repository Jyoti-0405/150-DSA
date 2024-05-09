package BinarySearch;

class Solution4{
    public int SearchInRotatedSortedArray(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            //left sorted
            if(nums[l]<=nums[mid]) {
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            //right sorted
            else{
                if(target<nums[mid] || target>nums[r]){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
        }
        return -1;
    }
}
class Search1{
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.SearchInRotatedSortedArray(new int[]{4,5,6,7,0,1,2},0));
    }
}
