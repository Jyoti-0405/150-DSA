package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

class Solution1{
    public int LongestSubstringWithoutRepeatingCharacters(String s) {
        List<Character> subStringL = new ArrayList<>();
        int longestLength = 0;
        for(int i=0;i<s.length();i++){
            if(subStringL.contains(s.charAt(i))){
                int index = subStringL.indexOf(s.charAt(i));
                subStringL.remove(index);
                if(index>0){
                    subStringL.subList(0,index).clear();
                }
            }
            subStringL.add(s.charAt(i));
            longestLength = Math.max(longestLength,subStringL.size());
        }
        return longestLength;
    }
}
class Substring{
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.LongestSubstringWithoutRepeatingCharacters("bbbbb"));
    }
}
