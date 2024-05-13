package LinkedList;

class Solution6{
    public int FindDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow!=fast);
        int slow2=0;
        do{
            slow = nums[slow];
            slow2 = nums[slow2];
        }while(slow!=slow2);
        return slow2;
    }
}
class Duplicate{
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.FindDuplicate(new int[]{1,3,4,2,2}));
    }
}

