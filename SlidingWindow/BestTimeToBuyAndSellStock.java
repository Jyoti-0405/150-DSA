package SlidingWindow;

class Solution{
    public int BestTimeToBuyAndSellStock(int[] nums) {
        int lowest_so_far = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit_so_far = 0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] < lowest_so_far) {
                lowest_so_far = nums[i];
            }
            profit_so_far = nums[i] - lowest_so_far;
            if (profit_so_far > max_profit) {
                max_profit = profit_so_far;
            }
        }
        return max_profit;
    }
}
class Stock{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.BestTimeToBuyAndSellStock(new int[]{7,1,5,3,6,4}));
    }
}