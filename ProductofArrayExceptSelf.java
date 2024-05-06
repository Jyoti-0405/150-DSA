import java.util.Arrays;

//Intuition behind the problem - first calculate the left array, after the first loop left array will be left[1,2,6,24]
// then we calculate the right array after the second loop the right array will be right[2,6,12,4]
// now we calculate the result subarray by multiplying left[i-1]*right[i+1]
class Solution4{
    public int[] ProductofArrayExceptSelf(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];
        left[0] = nums[0];
        for(int i=1;i<n;i++){
            left[i] = left[i-1]*nums[i];
        }
        right[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]*nums[i];
        }
        res[0] = right[1];
        res[n-1]=left[n-2];
        for(int i=1;i<n-1;i++){
            res[i] = left[i-1]*right[i+1];
        }
        return res;
    }
}
class Product{
    public static void main(String[] args){
        Solution4 s = new Solution4();
        System.out.println(Arrays.toString(s.ProductofArrayExceptSelf(new int[] {1,2,3,4})));
    }
}