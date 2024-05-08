package Stack;

import java.util.Stack;

// Intuition behind the problem - we keep traversing in the given string if we encounter a number we push it in the stack, as soon as we encounter a symbol
// we perform their respective operation and return stack.pop() as the result.

class Solution2{
    public int ReversePolishNotation(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s:tokens){
            if(tokens.equals("+")){
                st.add(st.pop()+st.pop());
            }
            else if(s.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.add(b-a);
            }
            else if(s.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.add(b-a);
            }
            else if(s.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.add(b/a);
            }
            else{
                st.add(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
class Notations{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.ReversePolishNotation(new String[]{"2","1","+","3","*"}));
    }
}
