package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

class Solution6{
    public void CountDistinctLetter(String s) {
        String s1 = s.replaceAll(" ","");
        int[] arr = new int[26];
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            map.put(s1.charAt(i),arr[s1.charAt(i)-'a']);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println("Letter: "+entry.getKey() +", Count: " +entry.getValue()
            );
        }
    }
}

class Count{
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        s.CountDistinctLetter("hello world");
    }
}

