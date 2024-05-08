package Stack;

import java.util.Stack;

//Intuition behind the problem - we push all the parenthesis of the string in a stack and we pop the elements in the stack one by one
// and check if matching closing parenthesis is found then we return true otherwise we return false;
class Solution{
    public boolean ValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(')');
            if(s.charAt(i)=='{') st.push('}');
            if(s.charAt(i)=='[') st.push(']');
            if(st.isEmpty()) return false;
            char top = st.pop();
            if(s.charAt(i)==')' && top != '('||s.charAt(i)=='}' && top != '{'||s.charAt(i)==']' && top != '['){
                return false;
            }
        }
        return true;
    }
}
class Parenthesis{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.ValidParenthesis(" {{[{{"));
    }
}
