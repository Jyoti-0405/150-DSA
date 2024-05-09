package BinarySearch;

//Intuition behind - At first we check if array is already sorted then we return value at index 0 i.e nums[l]
//if its not already sorted then we find out the mid and try to find out the point from where the array is rotated
// we calculate the mid and check if  the mid value is greater than the left most value then we want a smaller value so we move left pointer to
// mid+1, and if its smaller then we move right pointer to mid.

class Solution3{
    public int FindMinimumInRotatedSortedArray(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]<nums[r]){
                return nums[l];
            }
            int mid = (l+r)/2;
            if(nums[mid]>=nums[l]){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return 0;
    }
}
class Sorted{
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.FindMinimumInRotatedSortedArray(new int[]{3,4,5,1,2}));
    }
}
