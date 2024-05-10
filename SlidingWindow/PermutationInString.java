package SlidingWindow;

import java.util.Arrays;
//Intuition behind the problem - we traverse in each of the strings and increment the places of the alphabets in the respective arrays
// as soon as the length of one string exceeds the other we decreement the value of the character that is beyond the lengths and check
// if the two arrays equal or not if they are equal return true otherwise return false.
class Solution3{
    public boolean PermutationInString(String s1, String s2) {
        int[] arr1 = new int[26];
        int m = s1.length();
        int n = s2.length();
        for(int i=0;i<m;i++){
            arr1[s1.charAt(i)-'a']++;
        }
        int[] arr2 = new int[26];
        for(int j=0;j<n;j++){
            arr2[s2.charAt(j)-'a']++;
            if(j>=m){
                arr2[s2.charAt(j-m)-'a']--;
            }
            if(Arrays.equals(arr1,arr2)) return true;
        }
        return false;
    }
}
class Permutation{
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.PermutationInString("ab","eidbaooo"));
    }
}
