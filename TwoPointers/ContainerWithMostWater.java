package TwoPointers;

//Intuition behind the problem - We take two pointer one is pointing at the start of the array and other is pointing at the end of the array
// we calculate the area while we traverse in the array by multiplying the len(right -left) with min between left value and right value
// we keep checking if left value is less than right value we increement the left otherwise we decreement the right, we return the max area.
class Solution3{
    public int ContainerWithMostWater(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int res = 0;
        while(left<right){
            int len = right-left;
            int area = len*(Math.min(nums[left],nums[right]));
            res = Math.max(res, area);
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
class Container{
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.ContainerWithMostWater(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}