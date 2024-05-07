package TwoPointers;

import java.util.Arrays;

//Intuition behind the problem - we take two pointers one is pointing at the start index of the array and other is at the end index
//we check at any point if their sum is equal to target element then we break out of the loop otherwise if the calculated value is less than
//the required value we increment the start pointer if its greater than the target value we decrement the end pointer, we return a new array of the found
//indexes.
class Solution2{
    public int[] TwoSumII(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length-1;
        int num_a,num_b;
        while(a<b){
            num_a = numbers[a];
            num_b = numbers[b];
            if(num_a+num_b == target){
                break;
            }
            if(num_a+num_b<target){
                a++;
            }
            b--;
        }
        return new int[]{a+1,b+1};
    }
}
class SumII{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.TwoSumII(new int[]{2,7,11,15}, 9)));
    }
}