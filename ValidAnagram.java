import java.lang.module.ResolutionException;
import java.util.HashMap;
import java.util.Map;

//Intuition behind the problem- we take an empty array of length 26 and traverse in the first string and check the count of each letter in the string and increement it, we traverse
//in the second string and decreement the count each time same characters occur in the string, at last we traverse each digit in the array and check
//if a non zero value exists return false otherwise return true.
class Solution{
public boolean ValidAnagram (String s, String t){
        int[] arr = new int[26];
        Map<String, String> map = new HashMap<>();
        if(s.length()!= t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int a: arr){
            if(a!=0){
                return false;
            }
            return true;
        }
    return false;
}
}
class Main{
    public static void main(String[] args){
        Solution va = new Solution();
        System.out.println(va.ValidAnagram("anagram","nagaram"));
    }
}




