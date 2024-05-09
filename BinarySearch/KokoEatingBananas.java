package BinarySearch;

class Solution2{
    public int KokoEatingBananas(int[] piles, int hours) {
        int left = 1;
        int right = 1;
        for(int pile:piles){
            right = Math.max(pile, right);
        }
        while(left<right){
            int mid = (left+right)/2;
            int hoursSpent = 0;
            for(int pile:piles){
                hoursSpent+=Math.ceil((double)pile/mid);
            }
            if(hoursSpent<=hours){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return right;
    }
}
class Koko{
    public static void main(String[] args) {
        Solution2 s= new Solution2();
        System.out.println(s.KokoEatingBananas(new int[]{3,6,7,11}, 8));
    }
}