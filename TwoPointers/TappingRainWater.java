package TwoPointers;
class Solution4{
    public int TappingRainWater(int[] nums) {
        int[] leftMax = new int[nums.length];
        int[] rightMax = new int[nums.length];
//        int[] res = new int[nums.length];
        leftMax[0] =0;
        for(int i=1;i<nums.length-1;i++){
            leftMax[i] = Math.max(leftMax[i-1],nums[i-1]);
        }
        rightMax[nums.length-1] = 0;
        for(int i=nums.length-2;i>=0;i--){
            rightMax[i] = Math.max(leftMax[i+1],nums[i+1]);
        }
        int trapped = 0;
        for(int i=1;i<nums.length-1;i++){
            if(Math.min(leftMax[i],rightMax[i])>nums[i]){
                trapped+= Math.min(leftMax[i],rightMax[i])-nums[i];
            }
        }
        return trapped;
    }
}
class Trapped{
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.TappingRainWater(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
