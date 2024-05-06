import java.util.*;
//Intuition behind the problem - At first we sort the words in alphabetical order and we put them in a hashmap as keys as we iterate through the array of strings as soon as we find a word whose
// letters match the letters already present in the hashmap we put that word in the value part of the hashmap, at last we return a new arraylist of map.values.
class Solution3{
    public List<List<String>> GroupAnagram(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] str1 = str.toCharArray();
            Arrays.sort(str1);
            String str2 = new String(str1);
            if(!map.containsKey(str2)){
                map.put(str2, new ArrayList<>());
            }
//            System.out.println(map);
            map.get(str2).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

class Anagram{
    public static void main(String[] args){
        Solution3 s = new Solution3();
        System.out.println(s.GroupAnagram(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }
}