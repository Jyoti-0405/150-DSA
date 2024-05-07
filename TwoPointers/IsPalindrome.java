package TwoPointers;
//Intuition behind the problem-we take two pointers one is pointing at the start of the string and other is at the end of the string
//we check if they are letter or digit, then we convert them to lowercase and check if they are equal or not if they are not equal return false
// otherwise return true.

class Solution{
    public boolean IsPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            Character start = s.charAt(i);
            Character end = s.charAt(j);
            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }
            if(Character.toLowerCase(start)!=Character.toLowerCase(end)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

class Palindrome{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.IsPalindrome("A man, a plan, a canal: Panama"));
    }
}